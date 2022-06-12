package ecapsulation;

class employee{
	String name;
	int age;
	
	public void print() {
		System.out.println("employees");
	}
	
	public void print(int age,String name) {
		System.out.println(age+" "+name);
	}
	
}


public class oops {

	public static void main(String[] args) {
		employee em = new employee();
		em.print();
		em.age=5;
		em.name="sethi";
		em.print(em.age,em.name);
	}
}
