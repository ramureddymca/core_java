package algorithems;

import java.util.Scanner;

public class BinaryDigitAlgoDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Decimal Number:");
		long n = s.nextLong();
		
		System.out.println(operationCount(n));
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

	private static Long operationCount(long n) {
		if(n<=0) return 0l;
		boolean operationFlag = false;
		if(n%2==0) {
			operationFlag = false;
		}else {
			operationFlag = true;
		}
		String binary = convertIntToBinary(n);
		
	//	if(binary==0) return 1;
		Long operation = 0l;
		char[] charrtemp = binary.toCharArray();
		int indexTEmp = ithPositionChangeIndex(charrtemp);
		//boolean operationFlag = indexTEmp !=-1?true:false;
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

	private static String convertIntToBinary(long n) {
		String x = "";

		while (n > 0) {
			long a = n % 2;
			x = a + x;
			n = n / 2;
		}
		return x;
	}

}
