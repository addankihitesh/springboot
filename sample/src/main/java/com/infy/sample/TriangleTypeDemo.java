package com.infy.sample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriangleTypeDemo {
	@RequestMapping("/api/triangletype")
	public ResponseEntity<String> triangleType(@RequestParam("a")int a,@RequestParam("b")int b,@RequestParam("c")int c) {
		if((a + b > c))
        {
            if((a==b) && (b==c))
            {
               
               return new ResponseEntity("Equilateral",HttpStatus.OK);
            }
 
            else if ((a == b) & (b != c) || (b == c) & (c!= a))
            {
                
                return new ResponseEntity("Isosceles Triangle",HttpStatus.OK);
            }
            else if((a != b) & (b != c))
                 {
                    
                	 return new ResponseEntity("Scalene Triangle",HttpStatus.OK); 
                 }
 
        }
         else
        {
          
            return new ResponseEntity("This Triangle is NOT possible",HttpStatus.OK);
        }

		
		return new ResponseEntity(HttpStatus.OK);
	}
	
	}


