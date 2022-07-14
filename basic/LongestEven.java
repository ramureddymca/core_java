package basic;
public class LongestEven {
	
	public static void Long(String Str) {
		String[] strarray = Str.split(" ");
		String Evenword="00";
		for(String st : strarray) {
			if(st.length()%2==0)
			{
				if(Evenword.length()<st.length()) {
					Evenword=st;
					
				}
				
			}
		}System.out.print("Word is an Even and is " +Evenword);
	}
	public static void main(String args[]) {
	Long("hey ");
	}

}