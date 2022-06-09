package dateTimecom.javaeight;


//in java 8 we can define methods in interface too but need to be default or static
public interface INterJavaE {
	default void greet() {
		System.out.println("hi default");
	}

	static void greet2() {
		System.out.println("hi static");
	}
	
	void greet3();
}
