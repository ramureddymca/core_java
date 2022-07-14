package HR;

import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            int len = input.length();
            boolean flag = true;
            Stack<Character> stack = new Stack<>();
            for (char ch : input.toCharArray()) {
                if(ch == '(' || ch == '[' || ch == '{'){
                    stack.push(ch);
                }else if(ch == ')' && !stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }else if(ch == ']' && !stack.isEmpty() && stack.peek()=='['){
                    stack.pop();
                }else if(ch == '}' && !stack.isEmpty() && stack.peek()=='{'){
                    stack.pop();
                } else if (ch == ')' || ch == ']' || ch == '}') {
                    flag =false;
                }
            }
            if(stack.isEmpty() && flag) {
                System.out.println("true");
            }else{
                System.out.println("false");
            }
		}
		
	}
}



