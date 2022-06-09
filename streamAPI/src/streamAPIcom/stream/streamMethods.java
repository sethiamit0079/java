package streamAPIcom.stream;

import java.util.List;
import java.util.stream.Collectors;

public class streamMethods {
	public static void main(String[] args) {
		
		
	//filter(predicate)
	//predicate == boolean valued function  return T or F {
	// if true pick if false not pick 
		//e - > { return T or F    }
		// e-> T or F
		// e -> e>10   }
		
		
		//  Boolean VS  Element
		
	//map(function)
	// function returns value or can say element on the basis of which map makes stream.
		
		
	//filterout names starts with A
	List<String> names = List.of("Aman","nkit","Abinav");
	//collect method with the help of stream containing all elemt starting with 'A' collects.
	List<String> aNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
	System.out.println(aNames);
	
	//foreach used to traverse each elemnt one by one
	aNames.stream().forEach(e ->{
		System.out.println(e);
	});
	
	//double colon operator ::  (fuction ka reference)
	names.stream().forEach(System.out::println);
	
		
	//square each no. & return. there for no contdition so use MAP
	
	List<Integer> num = List.of(23,4,2,8,6,1);
	List<Integer> newNum = 	num.stream().map(i -> i*i).collect(Collectors.toList());
	System.out.println((newNum));
	

	
	//sort function
	num.stream().sorted().forEach(System.out::println);
	
	//min                                 //.get() for single element
	Integer i = num.stream().min((x,y)-> x.compareTo(y)).get();
	                            //impl of cpmarator
	System.out.println(i);
	
	//max 
	Integer res = num.stream().max((x,y)-> x.compareTo(y)).get();
    //impl of cpmarator
System.out.println(res);

//Array convert using stream use .toArray, .of is to make List.
	
	
	}

}
