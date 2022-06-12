package dsalgo;

import java.util.ArrayDeque;
import java.util.Deque;

public class brackets {
	
	static boolean arebraces(String exp) {
		Deque<Character> stack = new ArrayDeque<Character>();
		
		for(int i=0;i<exp.length();i++) {
			char x = exp.charAt(i);
			if(x=='(' ||x=='{' || x=='[') {
				stack.push(x);
				continue;
			}	
			if(stack.isEmpty()) {
				return false;
			}
			char check;
			switch(x) {
			
			case ')':
				check=stack.pop();
				if(check == '{' || check == '[')
					return false;
					break;
					
			case '}':
				check=stack.pop();
				if(check == '(' || check == '[')
					return false;
					break;
					
			case ']':
				check=stack.pop();
				if(check == '{' || check == '(')
					return false;
					break;
			}
		}
		
		return (stack.isEmpty());
		
	
	}
	
	
	public static void main(String[] args) {
		String exp = "([{)}])";
		
		if(arebraces(exp)) {
			System.out.println("balaces");
		}else {
			System.out.println("not balances");
		}
	}

}
