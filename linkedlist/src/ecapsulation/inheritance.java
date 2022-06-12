package ecapsulation;

class shape{
	String name;
	void print() {
		System.out.println("my shape is "+name);
	}
}

class traingle extends shape{
	
}

class circle extends shape{
	
}


public class inheritance {
public static void main(String[] args) {
	traingle t1 = new traingle();
	t1.name="traingle";
	t1.print();
	
	circle c1 = new circle();
	c1.name="circle";
	c1.print();
}
}
