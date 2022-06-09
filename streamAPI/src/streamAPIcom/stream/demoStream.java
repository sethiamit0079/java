package streamAPIcom.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demoStream {
	public static void main(String[] args) {
		
// create a list & filter even number print
		
	List <Integer> list1 = new ArrayList<Integer>();
		for(int i=11;i<=20;i++) {
			list1.add(i);
		}
		
		System.out.println(list1);
		
		//without stream
		List <Integer> list2 = new ArrayList<Integer>();
		
		for(Integer e:list1) {
			if(e%2 == 0) {
				list2.add(e);
			}
		}
		
		System.out.println(list2);
		
		
		// using Stream API (stream is an Interface)
		
	Stream<Integer> st = list1.stream();
	
	//from list1 get stream & put in st variable
	List<Integer> newList = st.filter( i-> i%2 == 0).collect(Collectors.toList());
	System.out.println(newList);    //predicate pass
		   
	 
	 List<Integer> newList2 = list1.stream().filter(i-> i>15).collect(Collectors.toList());
	 System.out.println(newList2);
	 
	 
	 
	}

}
