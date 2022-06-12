package ecapsulation;

public class abstrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
audi a1 = new audi();
a1.start();
	}

}

class audi extends car{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("audi start");
	}
	
}

class bmw extends car{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("bmw start ");
	}
	
}


abstract class car{  //car is a concept
	int price;
	
	abstract void start();
}