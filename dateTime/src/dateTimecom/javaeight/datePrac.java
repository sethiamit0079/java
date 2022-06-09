package dateTimecom.javaeight;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class datePrac {
	public static void main(String[] args) {
		
	//old problem same class in two packages
	//not thread safe
		
	//new one immutable
	//Date
	LocalDate d = LocalDate.now();
		System.out.println(d);
		
	LocalDate d2 = LocalDate.of(1999,8,20);
	System.out.println(d2);
	
	LocalDate d3 = LocalDate.of(1999,Month.AUGUST,20);
	System.out.println(d3);
	
	//Time
	LocalTime t = LocalTime.now();
	System.out.println(t);
		
		
	//interface java 8
	INterJavaE.greet2();
	
	INterJavaE r = new INterJavaE() {
		
		@Override
		public void greet3() {
			// TODO Auto-generated method stub
			System.out.println("normal greet");
		}
	};
	
	r.greet();
	r.greet3();
		
		
		
		
		
	}

}
