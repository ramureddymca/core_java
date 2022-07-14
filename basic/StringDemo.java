package basic;

import java.util.Collections;

public class StringDemo {

	 public static void main(String a[]){
	        String x = "junk";
	        String y = "junk";
	        String z = new String("junk");
	        /**
	         * We cannot use '==' operator to compare two strings.
	         * We have to use equals() method.
	         */
	        if(x.equals(y)){
	            System.out.println("Both strings are equal.");
	        } else {
	            System.out.println("Both strings are not equal.");
	        }
	        if(x==y){
	            System.out.println("Both strings are equal=.");
	        } else {
	            System.out.println("Both strings are not equal=.");
	        }
	        if(x==z){
	            System.out.println("Both strings are equal=.");
	        } else {
	            System.out.println("Both strings are not equal=.");
	        }
	        if(x.equalsIgnoreCase(y)){
	            System.out.println("Both strings are equal.");
	        } else {
	            System.out.println("Both strings are not equal.");
	        }
	        if(z.equalsIgnoreCase(y)){
	            System.out.println("Both strings are equal.");
	        } else {
	            System.out.println("Both strings are not equal.");
	        }
	    }
}
