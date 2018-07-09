package com.infy.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayDemo {
	
	@RequestMapping("/api/makeonearray")
	public  Integer [] makeOneArray(){
		
		Integer []a= {1,2,3,4};
		Integer []b= {3,4,5,6};
		Integer []c= {6,1,3,11};
		
		List<Integer> alist=Arrays.asList(a);
		List<Integer> blist=Arrays.asList(b);
		List<Integer> clist=Arrays.asList(c);
		
		List<Integer> list=new ArrayList<>();
		list.addAll(alist);
		list.addAll(blist);
		list.addAll(clist);
		
		
		Set<Integer> s=new HashSet<>(list);
		
		List<Integer> finallist=new ArrayList(s);
		
		Integer[] in=new Integer[finallist.size()];
		
		return finallist.toArray(in);
		
	}
	
	
	}


