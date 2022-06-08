package practice;

public class userDefineException {
	public static void main(String[] args) throws Myexception {
		int i=5;
		try {
		if(i<10) {
			throw new Myexception("user define error ");
		}
		}catch(Myexception e) {
			System.out.println(e);
		}
	}

}


class Myexception extends Exception{
	public Myexception(String str) {
		super(str);
	}
	
}