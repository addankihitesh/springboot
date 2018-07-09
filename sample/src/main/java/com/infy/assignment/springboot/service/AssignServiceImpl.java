package com.infy.assignment.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.infy.assignment.springboot.model.RemoveDuplicateArray;
@Service("assignservice")
public class AssignServiceImpl implements AssignService{

	
	public String getNthFibonacci(long n) {
		if(n==0) {
			return "n=>value should be greater than zero "
					+ "";	
			}
			if(n<0) {
				return "n=>value should be positive";	
			}
		long a=-1;
		long b=1;
		long c=0;
		for(int i=0;i<=n;i++)
		{
			
			c=a+b;
			a=b;
			b=c;
			
		}
		return new Gson().toJson(c);
	}

	public String reverseWordInSentence(String sentence) {
		if(sentence==null || sentence.isEmpty()) {
			return "Sentence should not empty";	
		}
		String  [] tokens=sentence.split(" ");
		String reverse="";
		for(int i=0;i<tokens.length;i++) {
			String token=tokens[i];
			String reverseword="";
			for(int j=token.length()-1;j>=0;j--) {
			reverseword=reverseword+token.charAt(j);
		}
			reverse=reverse+reverseword+" ";
		}
		
		return reverse;
	}

	
	public String getTypeOfTriangle(Integer a, Integer b, Integer c) {
		if(a==null || b==null || c==null) {
			return "a,b,c value/s should not empty";
		}
		if(a==0 || b==0 || c==0) {
			return "a,b,c value/s should not be Zero";
		}	
		if(a<0 || b<0 || c<0) {
			return "a,b,c value/s should not be negative";
		}
		String type="";
		if((a + b > c))
        {
            if((a==b) && (b==c))
            {
               
               type= "equilateral triangle";
            }
 
            else if ((a == b) & (b != c) || (b == c) & (c!= a))
            {
                
                type= "Isosceles Triangle";
            }
            else if((a != b) & (b != c))
                 {
                    
                	 type= "Scalene Triangle"; 
                 }
 
        }
         else
        {
          
            type= "This Triangle is NOT possible";
        }

		

		return type;
	}

	
	public String removeDuplicatesFromArray(String json) {
		if(json==null|| json.isEmpty()) {
			 return "JSON should not be empty";	
			}
			
	RemoveDuplicateArray rmduplicatesarray=new Gson().fromJson(json,RemoveDuplicateArray.class);
		
		List<Integer> finalList = new ArrayList<Integer>();

		finalList.addAll(rmduplicatesarray.getL1());
		finalList.addAll(rmduplicatesarray.getL2());
		finalList.addAll(rmduplicatesarray.getL3());
		Set<Integer> set = new TreeSet<Integer>(finalList);

		return new Gson().toJson(set);

	}
	

}
