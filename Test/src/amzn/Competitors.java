package amzn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

// CLASS BEGINS, THIS CLASS IS REQUIRED
class Competitors {
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public static ArrayList<String> topNCompetitors(int numCompetitors, int topNCompetitors, List<String> competitors,
			int numReviews, List<String> reviews) {
		// WRITE YOUR CODE HERE

		List<String> results = new ArrayList<>();

		if (numCompetitors != 0 && numReviews != 0) {
			Map<String, Integer> mentionsMap = new HashMap<>();
			
			//competitors.
			for (String competitor : competitors) {
				for (String review : reviews) {
					if (review.contains(competitor)) {
						int mentionsCount = mentionsMap.getOrDefault(competitor, 1);
						mentionsMap.put(competitor, ++mentionsCount);
					}
				}
			}
			
			results = mentionsMap
	        .entrySet()
	        .stream()
	        .sorted((Entry<String, Integer> o1, Entry<String, Integer> o2) -> {
	              return o1.getValue().equals(o2.getValue()) ? o1.getKey().compareTo(o2.getKey()) 
	                              : o2.getValue().compareTo(o1.getValue());
	          })
	        .map(e -> e.getKey())
	        .collect(Collectors.toList());
		}

		return new ArrayList(results.subList(0, topNCompetitors));

	}

	public static void main(String[] args) {

		List<String> competetors = Arrays.asList("anacell", "betacellular","cetracular","detacellular","eurocell");
		List<String> reviews2 = Arrays.asList("best services provided by anacell", 
				"betacellular has greate",
				"anacell provides much better services that all other");
		
		List<String> reviews = Arrays.asList("I love anacell best services provided by anacell, ", 
				"betacellular has greate service",
				"detacellular provides much better services than betacellular",
				"cetracular is worst trhan eurocell",
				"betacellular is better than detacellular");
		ArrayList<String> result = topNCompetitors(competetors.size(), 2, competetors, reviews.size(), reviews);
		System.out.println(result);
	}
	// METHOD SIGNATURE ENDS
}