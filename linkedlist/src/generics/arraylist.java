package generics;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		//System.out.println(list);
		
	list.add(2,66);
Collections.sort(list);
		System.out.println(list);
		
	}

}
