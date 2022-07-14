package algorithems;

public class CreditAgricole {

	public static void main(String[] args) {
		String [] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		String S = "WED";
		int count=1;
		for(String day: days) {
			if(!day.equals(S)) {
				count++;
			}else {
				break;
			}
		}
		int K=2;
System.out.println(days[((K)%7)-1]);
	}

}
