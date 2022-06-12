package ecapsulation;
class parent{
	void show() {
		System.out.println("parents show");
	}
}

class child extends parent{
	void show() {
		System.out.println("child show");
	}
}

public class overiding {
	public static void main(String[] args) {
		
		parent p=new parent();
		p.show();
		
		child c = new child();
		c.show();
		
		parent p2 = new child();
		p2.show();
		
		
	}

}
