package com.dev.beans;
import java.time.Instant;

public class Credential 
{
	private String email;
	private String password;
	private int count;
	private Instant start;
	
	public Instant getStart() {
		return start;
	}
	public void setStart(Instant start) {
		this.start = start;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}