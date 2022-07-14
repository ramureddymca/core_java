package algorithems;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	 // Complete the isBalanced function below.
    static String isBalanced(String s) {
    	
		/*
		 * if(s == null){ return "NO"; } Map<Character, Character> map = new
		 * HashMap<>(); map.put('}', '{'); map.put(']', '['); map.put(')', '('); int len
		 * = s.length(); Boolean flg = false; for(int i=0; i<len/2; i++){ if(s.charAt(i)
		 * == (map.get(s.charAt(len-i-1))!=null?map.get(s.charAt(len-i-1)):' ')){ flg =
		 * true; }else{ flg = false; break; } } if(flg==true) return "YES"; else return
		 * "NO";
		 */
    	int len=s.length();
        if(len==0 || s==null) return "YES";
          Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')  stack.push(s.charAt(i));
            else if(s.charAt(i)==')' && !stack.empty() && stack.peek()=='(') stack.pop();
            else if(s.charAt(i)==']' && !stack.empty() && stack.peek()=='[') stack.pop();

            else if(s.charAt(i)=='}' && !stack.empty() && stack.peek()=='{') stack.pop();
            else return "NO";


        }
        return stack.isEmpty() ? "YES" : "NO";
    }
//{(([])[])[]}
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);
            System.out.println(result);
           // bufferedWriter.write(result);
           // bufferedWriter.newLine();
        }

       // bufferedWriter.close();

        scanner.close();
    }
}
