package com.infy.sample;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FibonacciDemo {
	
	@RequestMapping("/api/fibonacci")
    public ResponseEntity<String> fibonacci(@RequestParam("n")int n) {
		String temp="";
		int a=-1;
		int b=1;
		int c=0;
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			
			c=a+b;
			a=b;
			b=c;
			
		}
		temp=temp+c;
		return new ResponseEntity(temp,HttpStatus.OK);
	    }


}
