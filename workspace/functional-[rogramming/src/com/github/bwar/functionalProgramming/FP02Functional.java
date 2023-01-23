package com.github.bwar.functionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		//addListNumbersFunctional(numbers);
		//System.out.println(addListNumbersFunctionalLambda(numbers));
		//System.out.println(squareAndAddNumbers(numbers));
		//System.out.println(cubeAndAddNumbers(numbers));
		
		//List<Integer> doubleNumbers = doubleList(numbers);
		//System.out.println(doubleNumbers);
		
		//List<Integer> evenList = evenNumberList(numbers);
		//System.out.println(evenList);
		
		List<Integer> squaredNumbers = squareList(numbers);
		
		//System.out.println(squaredNumbers);
		
		
		// int sum = addListFunctional(numbers);
		//
		// System.out.println(sum);

	}
	
		
	private static List<Integer> evenNumberList(List<Integer> numbers) {
		
		return numbers.stream()
		.filter(x-> x%2 ==0)
		.collect(Collectors.toList());
	}


	private static List<Integer> doubleList(List<Integer> numbers) {
		
		return numbers.stream()
		.map(x-> x*x)
		.collect(Collectors.toList());
	
	}


	private static Integer cubeAndAddNumbers(List<Integer> numbers) {
		
		return numbers.stream()
				.map(x-> x*x*x)
				.reduce(0, (x,y) -> x+y);
	}


	private static Integer squareAndAddNumbers(List<Integer> numbers) {
		
		return numbers.stream()
		.map(x-> x*x)
		.reduce(0, (x,y)-> x+y );
		
	}


	private static Integer addListNumbersFunctionalLambda(List<Integer> numbers) {
		return numbers.stream()
		.reduce(0, (x,y) -> x+y); // OR
		//.reduce(0, Integer:: sum);
	}


	private static void addListNumbersFunctional(List<Integer> numbers) {
		numbers.stream()
		.reduce(0,FP02Functional::sum);
		
	}

	private static List<Integer> squareList(List<Integer> numbers) {
		//1 , 5, 6
		//1 -> 1
		//5 -> 25
		//6 -> 36
		
		return numbers.stream()
				.map(number -> number * number)
				.collect(Collectors.toList());
	}

	private static int sum(int aggregate, int nextNumber) {
		System.out.println(aggregate + " " + nextNumber);
		// 0 12
		// 12 9 
		// 21 13
		// 34 4
		// 38 6
		// 44 2
		// 46 4
		// 50 12
		// 62 15
		// 77

		return aggregate + nextNumber;
		//return aggregate;
	}

	private static int addListFunctional(List<Integer> numbers) {
		//Stream of number -> One result value
		  //Combine them into one result => One Value
		  // 0 and FP02Functional::sum
		return numbers.stream()
				.parallel()
		  //.reduce(0, FP02Functional::sum);	
		  // .reduce(0, (x,y) -> x + y);
			.reduce(0, Integer::sum);
	}
}
