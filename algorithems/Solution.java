package algorithems;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'minOperations' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */
    private static String convertIntToBinary(long n) {
        String x = "";

        while (n > 0) {
            long a = n % 2;
            x = a + x;
            n = n / 2;
        }
        return x;
    }
    public static long minOperations(long n) {
    	if(n<=0) return 0l;
		boolean operationFlag = false;
		if(n%2==0) {
			operationFlag = false;
		}else {
			operationFlag = true;
		}
		String binary = convertIntToBinary(n);
        long operation = 0l;
        while ((Integer.parseInt(binary, 2)) > 0) {
            char[] charr = binary.toCharArray();
            if (!operationFlag) {

                int index = ithPositionChangeIndex(charr);
                if (index != -1) {
                    if (charr[index] == '0') {
                        charr[index] = '1';
                    } else {
                        charr[index] = '0';
                    }
                    operation++;
                    String temp02 = "";
                    for (int k = 0; k < charr.length; k++) {
                        temp02 = temp02 + charr[k];

                    }
                    binary = temp02;
                }
                operationFlag = true;

            } else if (operationFlag) {

                if (charr[charr.length - 1] == '0') {
                    charr[charr.length - 1] = '1';
                } else {
                    charr[charr.length - 1] = '0';
                }

                operation++;
                String temp01 = "";
                for (int k = 0; k < charr.length; k++) {
                    temp01 = temp01 + charr[k];
                }
                operationFlag = false;
                binary = temp01;
            }
        }

        return operation;   

    }
    
    private static int ithPositionChangeIndex(char[] charr) {
        boolean flg = false;
        int index = -1;
        for (int i = 1; i < charr.length; i++) {
            if (charr[i] == '1') {
                if ((i + 1) == charr.length) {
                    flg = true;
                } else {
                    for (int j = i + 1; j < charr.length; j++) {
                        if (charr[j] != '1') {
                            flg = true;
                        }
                    }
                }
                if (flg) {
                    index = i - 1;
                }
            }
        }
        return index;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.minOperations(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
