package amzn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCompetitors {

	public static void main(String[] args) {
	

		List<String> competitors = Arrays.asList("","");
		List<String> reviews = Arrays.asList("","");
		
		findNTopCompetitors(competitors.size(), competitors, 2, 5, reviews);
	}

	private static void findNTopCompetitors(int numCompetitors, List<String> competitors, int topNCompetitors, int numReviews, List<String> reviews) {
		
		if(numCompetitors > 0 && topNCompetitors>0) {
			Map<String, Integer> mentionsMap = new HashMap<>();
			for(String competitor: competitors) {
				reviews.stream()
				.filter(review -> review.contains(competitor))
				.forEachOrdered(x -> mentionsMap.put(competitor, 1+(mentionsMap.getOrDefault(competitor, 1))));
			}
			
			System.out.println(mentionsMap);
		}
		
		
	}

}
