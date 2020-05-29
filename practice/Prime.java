package practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = (int) Math.sqrt(n);
		for(int i=2;i<=a;i++) {
			if(n%i==0) {
				System.out.println("prime");
			}
		}
	}

	
	public static String getStringFromDate (Date date) throws ParseException {
	    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	  return formatter.format(date);
	}
	 /* public static void main(String[] argv) throws ParseException {
	    System.out.println(getStringFromDate(getFromatedDate("20190514114540")));
	  }*/
	  
	  //20190514114540
	  
	  public static Date getFromatedDate(String date) throws ParseException {
			 if(date != null && date.length()>13){

				String formattedDt = date.substring(6, 8) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4) + " "
						+ date.substring(8, 10) + ":" + date.substring(10, 12) + ":" + date.substring(12, 14);
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:sss");
				return formatter1.parse(formattedDt);
			}
			return null;
			
		}
}
