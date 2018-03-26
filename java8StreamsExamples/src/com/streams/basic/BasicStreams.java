package com.streams.basic;

import java.util.Arrays;
import java.util.stream.Collectors;

import com.streams.model.Employee;

import java.util.List;

public class BasicStreams {

	public static void main(String[] args) {
		
		 List<Employee> empList = Arrays.asList(new Employee("Alex", 24), new Employee("Andrew", 44), 
				new Employee("Smith", 34), new Employee("Monk", 77), new Employee("Boss", 36));
		 
		 List<Employee> filteredList = empList.stream().limit(2).collect(Collectors.toList());
		 filteredList.forEach(System.out::println);
	}
}
