package amzn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReorderDatainLogFiles {

	public static void main(String[] args) {
		String[] logs = { "dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero" };
		List<String> logs2 = reorderLogFiles(logs);
		for(String s : logs2)
		System.out.println(s);
	}
	
	public static List<String> reorderLogFiles(String[] logs) {
		/*
		 * if (logs == null || logs.length == 0) { return logs; }
		 */
		
		String[] letters  = Arrays.stream(logs).filter(s ->  s.charAt(s.indexOf(' ') + 1) >= 97)
				.sorted((String s1, String s2) -> 
				s1.substring(s1.indexOf(' ') + 1).concat(s1.substring(0, s1.indexOf(' '))).compareTo(s2.substring(s2.indexOf(' ') + 1).concat(s2.substring(0, s2.indexOf(' ')))))
				.toArray(String[]::new);
				
				String[] numbers  = Arrays.stream(logs).filter(s ->  s.charAt(s.indexOf(' ') + 1) <= 57)
						.toArray(String[]::new);
			
				return Stream.concat(Arrays.stream(letters), Arrays.stream(numbers))
						.collect(Collectors.toList());
	}


	/*
	 * public static String[] reorderLogFiles(String[] logs) { if (logs == null ||
	 * logs.length == 0) { return logs; } int r = logs.length; for (int l =
	 * logs.length; l >= 0; l--) { int spaceIdx = logs[l].indexOf(" "); char
	 * firstLiteral = logs[l].charAt(spaceIdx + 1); if (firstLiteral <= '9' &&
	 * firstLiteral >= '0') { // swap String temp = logs[l]; logs[l] = logs[r];
	 * logs[r] = temp; r--; } } Arrays.sort(logs, 0, r + 1, new MyComparator());
	 * return logs; }
	 */
}

class MyComparator implements Comparator<String> {
	public int compare(String o1, String o2) {
		int spaceIdx = o1.indexOf(" ");
		String id1 = o1.substring(0, spaceIdx);
		String message1 = o1.substring(spaceIdx + 1, o1.length());

		spaceIdx = o2.indexOf(" ");
		String id2 = o2.substring(0, spaceIdx);
		String message2 = o2.substring(spaceIdx + 1, o2.length());

		int result = message1.compareTo(message2);
		if (result == 0) {
			return id1.compareTo(id2);
		}

		return result;
	}
}
