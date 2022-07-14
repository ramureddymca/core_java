package algorithems;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class ContactMatchCount {


	    /*
	     * Complete the contacts function below.
	     */
	    static int[] contacts(String[][] queries) {
	        /*
	         * Write your code here.
	         */
	         Set<String> set = new TreeSet<>();
	         int contactMatchNum [] = new int[queries.length/2];
	         int k=0;
	         for(int i=0; i<queries.length;i++){
	         
	            String op = queries[i][0];
	            String name = queries[i][1];
	            
	            if("add".equalsIgnoreCase(op)){
	                set.add(name);
	            }else if("find".equalsIgnoreCase(op)){
	                int count =0;
	                for(String s : set){
	                    if(s.substring(0,name.length()).contentEquals(name)) count++;
	                }
	                contactMatchNum[k++]=count;
	            }
	            
	         }
	        
	         return contactMatchNum;

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int queriesRows = Integer.parseInt(scanner.nextLine().trim());

	        String[][] queries = new String[queriesRows][2];

	        for (int queriesRowItr = 0; queriesRowItr < queriesRows; queriesRowItr++) {
	            String[] queriesRowItems = scanner.nextLine().split(" ");

	            for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr++) {
	                String queriesItem = queriesRowItems[queriesColumnItr];
	                queries[queriesRowItr][queriesColumnItr] = queriesItem;
	            }
	        }

	        int[] result = contacts(queries);

	        for (int resultItr = 0; resultItr < result.length; resultItr++) {
	            bufferedWriter.write(String.valueOf(result[resultItr]));

	            if (resultItr != result.length - 1) {
	                bufferedWriter.write("\n");
	            }
	        }

	        bufferedWriter.newLine();

	        bufferedWriter.close();
	    }

}
