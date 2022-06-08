package anujBhaiyacom.oops;

public class demoClass {
	public static void main(String[] args) {
//		animal a1 = new animal();
//		a1.legs=4;
//		a1.name="cow";
//		animal.owner = "deepa";
//		a1.who();
//		animal a2 = new animal();
//		a2.legs=2;
//		a2.name="goat";
//		animal.owner = "peepa";
//		a2.who();
		
		person p = new person("sethi",14);
		System.out.println(p.name+ " "+p.age);
	}

} 

class person{
	String name;
	int age;
	public person() {
		//this("deep",40);
		System.out.println("i am unstoppable");
	}
	
	
	public person(String name,int age) {
		//this();
		this.name = name;
		this.age = age;
		//System.out.println(name+" "+age);
		walking(this);
	}
	
	void walking(person p) {
		age +=10;
		//System.out.println("walking"+" "+name+ " "+ age);
	}
}



class animal{
	static String owner;
	String name;
	int legs;
	void who() {
		System.out.println(name+ " "+legs+" "+owner);
	}
}




// this as ambiguity var names;
// this construc overloading.
// this as an argment.