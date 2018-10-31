package com.dev.model.service;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation implements ValidationDao
{
	public boolean isStringOnlyAlphabet(String str) 
    { 
      return   ((str != null) 
                && (!str.equals("")) 
                && (str.matches("^[a-zA-Z]*$")));
        }
     
	public boolean passvalid(String password) {
		
		
		 Pattern letter = Pattern.compile("[a-zA-z]");
	        Pattern digit = Pattern.compile("[0-9]");
	        Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
	        //Pattern eight = Pattern.compile (".{8}");


	           Matcher hasLetter = letter.matcher(password);
	           Matcher hasDigit = digit.matcher(password);
	           Matcher hasSpecial = special.matcher(password);

	           return hasLetter.find() && (hasDigit.find() || hasSpecial.find());

	   
	}
	
	
}