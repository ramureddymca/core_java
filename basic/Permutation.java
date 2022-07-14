package basic;

public class Permutation {

	public static void main(String[] args) {
		String str="ABC";
		permuationWords(str, "");

	}

	private static void permuationWords(String input, String ans) {
		if(input.length() == 0) {
			System.out.println(ans );
			return;
		}
		for(int i=0; i< input.length(); i++) {
			Character ch = input.charAt(i);
			String row = input.substring(0, i)+input.substring(i+1);
			permuationWords(row , ans+ch);
		}
		
	}

	private static void findPermuationWords(String input, String ans) {
		if(input.length() == 0) {
			System.out.println(ans );
			return;
		}
		for(int i=0; i< input.length(); i++) {
			Character ch = input.charAt(i);
			String row = input.substring(0, i)+input.substring(i+1);
 			findPermuationWords(row , ans+ch);
		}
		
		
		
	}

}
