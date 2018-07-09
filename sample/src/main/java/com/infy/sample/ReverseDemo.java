package com.infy.sample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseDemo {
	@RequestMapping("/api/reverseword")
	
	public ResponseEntity<String> reverse(@RequestParam("sentence")String sentence) {
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
		
		return new ResponseEntity(reverse,HttpStatus.OK);
	    }
	}
