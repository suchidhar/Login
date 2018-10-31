package com.dev.model.dao;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class LoginDaoImpl implements LoginDao {

	public boolean login(String email,String password) {
		java.sql.Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			java.sql.Driver ref=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(ref);
			
			String dbUrl="jdbc:mysql://localhost:3306/capsv4_db";
			String filePath = "D:/Geminites/J2EE/db.properties";
			FileReader reader = new FileReader(filePath);
			Properties prop = new Properties();
			prop.load(reader);
			
			con = DriverManager.getConnection(dbUrl, prop);
			
			String sql="select * from user_db where username=? and password=?;";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,email);
			pstmt.setString(2, password);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) 
				return true;
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally
		{
			
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
 
		
	}
		
		return false;
	}

}