package com.infy.assignment.springboot.service;

import java.util.List;

import com.infy.assignment.springboot.model.RemoveDuplicateArray;

public interface AssignService {
	
	public String getNthFibonacci(long n);
	public String reverseWordInSentence(String sentence);
	public String getTypeOfTriangle(Integer a,Integer b,Integer c);
	public String removeDuplicatesFromArray(String json);

}
