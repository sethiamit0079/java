package ecapsulation;

public class constru {
	static class student{
		String name;
		int age;
		
		public void print() {
			System.out.println(this.name);
			System.out.println(this.age);
		}
		student(){
			System.out.println("i am a constructor");
		}
	}
	
	
	public static void main(String[] args) {
		student s1 = new student();
		
	}

}
