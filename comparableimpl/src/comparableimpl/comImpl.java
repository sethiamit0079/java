package comparableimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class comImpl {
	public static void main(String[] args) {
		
		
		List<Laptop>ls = new ArrayList<>();
		ls.add(new Laptop(2000,"dell", 8));
		ls.add(new Laptop(9000,"asus", 4));
		ls.add(new Laptop(3000,"hp", 2));
		ls.add(new Laptop(8000,"lenovo", 9));
		
		Comparator<Laptop> com = new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				// TODO Auto-generated method stub
				if(o1.getRam() > o2.getRam())
					return 1;
				else
					return -1;
			}
			
		};
		
		Collections.sort(ls, com);
		
		System.out.println(ls);
		
		
	}

}
