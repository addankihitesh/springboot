package com.infy.assignment.springboot.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infy.assignment.springboot.service.AssignService;

@RestController
public class AssignController {
	@Autowired
	AssignService assignService;

	@RequestMapping(value="/api/fibonacci",method=RequestMethod.GET)
	public ResponseEntity<String> getNthFibonacci(@RequestParam("n") long n) {

		String fib = assignService.getNthFibonacci(n);

		return new ResponseEntity<String>(fib,getHttpHeaders(), HttpStatus.OK);
	}

	@RequestMapping(value="/api/reverseword",method=RequestMethod.GET)
	public ResponseEntity<String> reverseWordInSentence(@RequestParam("sentence") String sentence) {

		String rev = assignService.reverseWordInSentence(sentence);

		return new ResponseEntity<String>(rev,getHttpHeaders(), HttpStatus.OK);
	}

	@RequestMapping(value="/api/triangletype",method=RequestMethod.GET)
	public ResponseEntity<String> getTypeOfTriangle(@RequestParam("a") int a, @RequestParam("b") int b,
			@RequestParam("c") int c) {

		String tri = assignService.getTypeOfTriangle(a, b, c);

		return new ResponseEntity<String>(tri,getHttpHeaders(),HttpStatus.OK);
	}

	@RequestMapping(value = "/api/makeonearray", method = RequestMethod.POST)
	public ResponseEntity<String> removeDuplicatesFromArray(@RequestBody String json) {

		String list = assignService.removeDuplicatesFromArray(json);

		return new ResponseEntity<String>(list, getHttpHeaders(), HttpStatus.OK);
	}

	private HttpHeaders getHttpHeaders() {

		HttpHeaders headers = new HttpHeaders();

		headers.add("pragma", "no-cache");
		headers.add("date", new Date().toString());
		headers.add("content-type", "application/json;charset=UTF-8");
		headers.add("cache-control", "no-cache");
		//headers.add("content-encoding", "gzip");
		//headers.add("content-length","131");
		headers.add("expires", "-1");

		return headers;
	}

}
