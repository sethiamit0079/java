package cognizant;

class cellPhone{
	void call() {
		System.out.println("i can call");
	}
	
	void message() {
		System.out.println("i can message");
	}
	
}

interface gps{
	default void location() {
		System.out.println("accurate location");
	}
}

interface camera{
	default void clickPicture() {
		System.out.println("4k resolution");
	}
}

interface media{
	default void playSong() {
		System.out.println("premium music");
	};
}

class smartphone extends cellPhone implements gps,camera,media{
	
	void call() {
		System.out.println("i can vediocall");
	}
	
	void message() {
		System.out.println("i can voicemessage");
	}

	@Override
	public void location() {
		// TODO Auto-generated method stub
		System.out.println("smart location");
		
	}

	@Override
	public void clickPicture() {
		// TODO Auto-generated method stub
		System.out.println("smart pics");
		
	}

	@Override
	public void playSong() {
		// TODO Auto-generated method stub
		System.out.println("smart songs");
		
	}
	
}

public class phone {
	public static void main(String[] args) {
		
		media m = new smartphone();
		
		
		m.playSong();
		
		
	}

}
