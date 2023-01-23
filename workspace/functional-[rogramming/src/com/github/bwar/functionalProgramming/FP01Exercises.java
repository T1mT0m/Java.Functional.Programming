package com.github.bwar.functionalProgramming;

import java.util.List;

public class FP01Exercises { 
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		//printOddNumbersInListFunctional(numbers);
		//printCubesOfOddNumbersInListFunctional(numbers);
		//printListOfCourses(courses);
		//printSpringCourses(courses);
		//printSprintCoursesWithLength(courses);
		//printSquaresOfEvenNumbers(numbers);
		//pringCubeOfOddNumbers(numbers);
		printLengthofCourses(courses);

	}

	private static void printLengthofCourses(List<String> courses) {
		courses.stream()
		.map(course -> course + " "+ course.length())
		.forEach(System.out:: println);
		
	}

	private static void pringCubeOfOddNumbers(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number % 2 != 0)
		.map(number -> number * number * number)
		.forEach(System.out :: println);
		
	}

	private static void printSquaresOfEvenNumbers(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number % 2 == 0)
		.map(number -> number * number)
		.forEach(System.out :: println);
		
	}

	private static void printSprintCoursesWithLength(List<String> courses) {
		courses.stream()
			.filter(course -> course.length() >= 4)
			.forEach(System.out :: println);
		
	}

	private static void printSpringCourses(List<String> courses) {
		courses.stream()
		.filter(course -> course.contains("Spring"))
		.forEach(System.out::println);
		
	}

	private static void printListOfCourses(List<String> courses) {
		
		courses.stream().forEach(System.out::println);
		
	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 != 0) // Lamdba Expression
				.forEach(System.out::println);// Method Reference
	}

	private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 != 0) // Lamdba Expression
				.map (number -> number * number * number)
				.forEach(System.out::println);// Method Reference
	}

}
