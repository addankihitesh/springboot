package com.infy.assignment.springboot;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.gson.Gson;
import com.infy.assignment.springboot.model.RemoveDuplicateArray;
import com.infy.assignment.springboot.service.AssignServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AssessmentServiceTest {
	
	@Autowired
	private AssignServiceImpl assignService;
	
	/* Fibonacci unit test start */
	@Test
	public void getNegativeFibonacciTest(){
	
		String fib=assignService.getNthFibonacci(-1);
		System.out.println("########### getNegativeFibonacciTest result:"+fib);		
	}
	@Test
	public void getZeroFibonacciTest(){
	
		String fib=assignService.getNthFibonacci(0);
		System.out.println("######### getZeroFibonacciTest result:"+fib);		
	}
	
	@Test
	public void get5thFibonacciTest(){
	
		String fib=assignService.getNthFibonacci(5);
		System.out.println("########## get5thFibonacciTest result:"+fib);		
	}
	@Test
	public void get8thFibonacciTest(){
	
		String fib=assignService.getNthFibonacci(8);
		System.out.println("######## get8thFibonacciTest result:"+fib);		
	}
	/* Fibonacci unit test End */
	
	
	/* reverseWordInSentence unit test Start */
	@Test
	public void emptyWordInSentenceTest(){
	
		String rev=assignService.reverseWordInSentence("");
		System.out.println("########## emptyWordInSentenceTest result:"+rev);		
	}
	@Test
	public void nullWordInSentenceTest(){
	
		String rev=assignService.reverseWordInSentence(" ");
		System.out.println("######### nullWordInSentenceTest result:"+rev);		
	}
	@Test
	public void reverseWordInSentenceTest(){
	
		String rev=assignService.reverseWordInSentence("How are you");
		System.out.println("######### reverseWordInSentenceTest result:"+rev);		
	}
	/* reverseWordInSentenceTest unit test End */
	
	
	/* Triangle unit test Start */
	@Test
	public void negativeTriangleTest(){
	
		String tri=assignService.getTypeOfTriangle(-1,-2,10);
		System.out.println("######## negativeTriangleTest result:"+tri);		
	}
	@Test
	public void zeroTriangleTest(){
	
		String tri=assignService.getTypeOfTriangle(0,0,0);
		System.out.println("######## zeroTriangleTest result:"+tri);		
	}
	@Test
	public void equilateralTriangleTest(){
	
		String tri=assignService.getTypeOfTriangle(10,10,10);
		System.out.println("######## equilateralTriangleTest result:"+tri);		
	}
	@Test
	public void notTriangleTest(){
	
		String tri=assignService.getTypeOfTriangle(50,10,60);
		System.out.println("######## notTriangleTest result:"+tri);		
	}
	@Test
	public void isoscelesTriangleTest(){
	
		String tri=assignService.getTypeOfTriangle(80,80,20);
		System.out.println("######## isoscelesTriangleTest result:"+tri);		
	}
	@Test
	public void scaleneTriangleTest(){
	
		String tri=assignService.getTypeOfTriangle(60,40,80);
		System.out.println("######## scaleneTriangleTest result:"+tri);		
	}
	/* Triangle unit test End */
	
	/* remove duplicate array unit test Start */
	@Test
	public void nullremoveDuplFromArrayTest(){
		
		String list=assignService.removeDuplicatesFromArray(null);	
		System.out.println("######## nullremoveDuplFromArrayTest result:"+list);
		
	}
	@Test
	public void emptyremoveDuplFromArrayTest(){
		
		String list=assignService.removeDuplicatesFromArray("");	
		System.out.println("######## emptyremoveDuplFromArrayTest result:"+list);
		
	}
	@Test
	public void removeDuplFromArrayTest(){	
		
		RemoveDuplicateArray array=new RemoveDuplicateArray();
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		List<Integer> list3=new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		list2.add(10);
		list2.add(50);
		list2.add(30);
		list2.add(60);
		
		list3.add(60);
		list3.add(20);
		list3.add(70);
		list3.add(80);
		
		array.setL1(list1);
		array.setL2(list2);
		array.setL3(list3);
		String list=assignService.removeDuplicatesFromArray(new Gson().toJson(array));	
		System.out.println("######## removeDuplFromArrayTest result:"+list);
		
		/* remove duplicate array unit test End */
	}
	
	
	

}
