package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SplitDemo {

	/*public static void main(String[] args) {
		String input = "NFL=Game_State:PreGame-Preview,High,Team_states,Leaders,Replays,More,"+ "Game_State:InProgress-Summury,Fantasy,"
					 + "NFL2=Game_State:PreGame-Preview,High,Team_states,Leaders,Replays,More,Game_State:InProgress-Summury,Fantasy";
		String s1 = "Game_State:PreGame";
		
		Map<String,Map<String,List<String>>> top = new  HashMap<>();
		Map<String,List<String>> gameState = new  HashMap<>();
		
		//
		
		System.out.println(input.split("="));
		StringTokenizer stoken = new StringTokenizer(input,"=//:");
		String str = "";

        while(stoken.hasMoreElements()) {
        	str = stoken.nextToken();
        	System.out.println(str);
        }
		
		
		
		//System.out.println(s1.substring(11));
		
		//Map<String, String> reconstructedUtilMap = Arrays.asList(input.split("=")).stream().filter(s -> s[1])
				.map(s -> s.substring(0, 9))
	             * 
	            .map(s -> s.split("-"))
	            .collect(Collectors.toMap(s -> s[0], s -> s[1]));
		
		
		Map<String, String> reconstructedUtilMap = Arrays.stream(utilMapString.split("="))
	            .map(s -> s.split("-"))
	            .collect(Collectors.toMap(s -> s[0], s -> s[1]));
	}*/
	
	public static void main(String[] args) {
	       System.out.println(getExtrasTabsOrderByLeague("NFL")); 
	    }
	   public static Map<String, List<String>> getExtrasTabsOrderByLeague(String leagueName){
	       List<String> testList = Arrays.asList("NFL=GAME_STATE:PreGame-Preview,Highlights,Team_Stats,Leaders,Replays,More;GAME_STATE:InProgress-Summary,Fantasy,Leaders,Scoring,Highlights,More;GAME_STATE:Final-Recap,Highlights,Fantasy,Leaders,Scoring,Replays,More");
	      Map<String, Map<String, List<String>>> extrasTabOrderMap = new HashMap<>();
	       for(String extrasTabOrder: testList) {
	          String[] tabOrderByLeagueSplit =  extrasTabOrder.split("=");
	          
	          String[] gameStateStr =  tabOrderByLeagueSplit[1].split(";");
	         
	          Map<String, Map<String, String>> tabOrderByStateMap = Arrays.asList(gameStateStr)
	        		  	.stream()
	        		  	.filter(s-> !s.isEmpty())
	        		  	.map(s -> s.split("-"))
	        		    .collect(Collectors.toMap(
	        		        a -> a[0].substring(11),
	        		        a -> Arrays.asList(a[1].split(",")).stream().collect(Collectors.toMap(a[1], a[1]))
	        		        ));
	        
	           extrasTabOrderMap.put(tabOrderByLeagueSplit[0], tabOrderByStateMap);
	           
	       }
	    return extrasTabOrderMap.get(leagueName);
	        
	    }

}
