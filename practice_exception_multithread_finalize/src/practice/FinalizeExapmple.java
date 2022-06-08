package practice;

public class FinalizeExapmple {
	public static void main(String[] args) {
		FinalizeExapmple f = new FinalizeExapmple();
		
		f = null;
		System.gc();
		
		System.out.println("end of garbage coll");
	}
	
	protected void finalize() {
		System.out.println("called");
	}

}
