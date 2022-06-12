package anujBhaiyacom.oops;

public class oppsTwo {
	public static void main(String[] args) {
		Alien.speak();
	}

}

class Alien{
	static void speak() {
		System.out.println("i can speak");
		sayHello();
	}
	
	static void sayHello() {
		System.out.println("i am saying hello");
	}
}