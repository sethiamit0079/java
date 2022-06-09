package com.prac;

import java.lang.reflect.Array;
import java.util.List;

public class seq {
	public static void main(String[] args) {
		
		List<String> l1 = List.of("hi","i","am","amit");
		
		l1.stream().forEach(System.out::println);
		System.out.println();
		l1.parallelStream().forEach(System.out::println);
	}

}
