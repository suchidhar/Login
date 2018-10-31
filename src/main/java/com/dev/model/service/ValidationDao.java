package com.dev.model.service;
public interface ValidationDao {
	
	boolean isStringOnlyAlphabet(String str);
	boolean passvalid(String password);

}