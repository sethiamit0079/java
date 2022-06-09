package streamAPIcom.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamOBJ {
	public static void main(String[] args) {
	
	//STREAM API - COLLECTION PROCESS
	//GROUP OF OBJECTS 
		
		//1- blank stram
		Stream<Object> st = Stream.empty();
		st.forEach(e ->{
			System.out.println(e);
		});
		
		
		//2 array,obj,collection
		String names[] = {"amit","ankit","akshay"};
		Stream<String> ste = Stream.of(names);
		ste.forEach(e ->{
			System.out.println(e);
		});
		
		Integer arr[] = {5,4,3,2,1};
		Stream<Integer> ar = Stream.of(arr);
		ar.forEach(e ->{
			System.out.println(e);
		});
		
		//3
		IntStream st2 =  Arrays.stream(new int[] {2,3,4,5,6,7});
		st2.forEach(e ->{
			System.out.println(e);
		});
		
		//5
		List<String> list = Arrays.asList("Hello ", 
                         "G", "E", "E", "K", "S!");
		
		//4 list set  *************************
		List <Integer> list1 = new ArrayList<Integer>();
		//child class obj stored in parent class obj
		for(int i=11;i<=20;i++) {
			list1.add(i);
		}
		
		//list1 is list interface ka obj
		Stream<Integer> st3 = list1.stream();
		st3.forEach(e ->{
			System.out.println(e);
		});
		
		
	}

}
