package basic;

public class Demo {

	public static void main(String[] args) {
		
		String s1="12";
		String s2 ="1";
		String s3=s2+"2";
		System.out.println(s1.equals(s3));		//factorial recursive
		/*int a=5, fact=1;
		fact = factor(a);
		System.out.println(fact);*/
		//factorial
		/*int a=5, fact=1;
		
		for(int i=1; i<=5;i++) {
			fact= fact*i;
		}
		System.out.println(fact);*/
		
		//palindrom
		/*int a = 123;
		
		int rev = 0, rem;
		while(a>0) {
		rem= a%10;
		rev=rev*10+rem;
		a=a/10;
		}
		System.out.println(rev);
		*/
	}
	static int factor(int a) {
		
		if(a==0)
			return 1;
		else
		return a*factor(a-1);
	}
}
