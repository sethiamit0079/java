package hello.demo;

class Person{
	String name;
	int age;
	static int count=0;
	
	public Person(){
		count++;
		System.out.println("create");
	}
	
	public Person(int age,String name) {
		this();
		this.age=age;
		this.name=name;
	}
	
	void walk() {
		System.out.println("i am walking");
	}
	
	void walk(int x) {
		System.out.println("i am walking"+ x + "x steps");
	}
}


class developer extends Person{
	public developer(int age,String name) {
		super(age,name);
	}
	
	void walk() {
		System.out.println("developer is walking");
	}
	
}


public class demo2 { 
	public static void main(String[] args) {
		Person p1 = new Person(2,"amit");
		developer d1 = new developer(4,"akshay");
		d1.walk(5);
		
		System.out.println(d1.name);
		
		
		System.out.println(p1.name);
	}

}
