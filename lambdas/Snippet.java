package lambdas;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class Snippet {
	public static void main(String[] args) {
		ThreadMXBean bean = ManagementFactory.getThreadMXBean();
		long ids [] = bean.findDeadlockedThreads();
		
		if(ids !=null) {
			ThreadInfo[] info = bean.getThreadInfo(ids);
			
		}
		
	}
}

