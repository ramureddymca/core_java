package algorithems;
public class Game {

	 HashMap<TimeSlot, HashSet<Player>> mapOfficeTimeSlot;
	 
	public static void main(String[] args) {
		//we can also ask input from user but its a good way to test our algorithm fast. :)
		try{
			
//			//Q1
//			Player[] players = {
//					new Player("P1", 9, 10),
//					new Player("P2", 9, 12)
//			};
			
//			//Q2
//			Player[] players = {
//					new Player("P1", 9, 10),
//					new Player("P2", 9, 12),
//					new Player("P3", 13, 15),
//					new Player("P4", 10, 18),
//			};
			
//			//Q3
//			Player[] players = {
//					new Player("P1", 9, 11),
//					new Player("P2", 12, 14),
//					new Player("P3", 13, 15),
//					new Player("P4", 11, 18),
//					new Player("P5", 14, 18),
//					new Player("P6", 10, 14),
//					new Player("P7", 15, 18),
//			};
				
				//Q4
				Player[] players = {
						new Player("P1", 9, 10),
						new Player("P2", 9, 12),
						new Player("P3", 14, 15),
						new Player("P4", 16, 18),
						new Player("P5", 14, 18),
						new Player("P6", 10, 13),
						new Player("P7", 15, 18),
						new Player("P8", 10, 14),
						new Player("P9", 9, 13),
				};	

//				//Q5
//				Player[] players = {
//						new Player("P1", 9, 14),
//						new Player("P2", 15, 17),
//						new Player("P3", 12, 13),
//						new Player("P4", 16, 18),
//						new Player("P5", 10, 15),
//						new Player("P6", 14, 16),
//						new Player("P7", 9, 13),
//						new Player("P8", 9, 15),
//				};	
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			TimeSlot officeTimeSlot = new TimeSlot(9, 18);
			//PingPong pingPong = new PingPong(officeTimeSlot, players);
			//Matches matches = pingPong.calculateMatches();
			 HashMap<TimeSlot, HashSet<Player>> mapOfficeTimeSlot = new HashMap<>();
				for (int i = timeSlot.getMinTime(); i < timeSlot.getMaxTime(); i++) {

					mapOfficeTimeSlot.put(new TimeSlot(i, i + 1), new HashSet<>());
				}
				for (int i = 0; i < players.length; i++) {
					Player p = players[i];
					//put players availability in office time slot
					for (int j = p.getTimeSlot().getMinTime(); j < p.getTimeSlot().getMaxTime(); j++) {
						TimeSlot ts = new TimeSlot(j, j + 1);
						mapOfficeTimeSlot.get(ts).add(p);
					}
				}
			
			System.out.println("INPUT");
			System.out.println(players.length);
			
			for (Player player : players) {
				System.out.println(player);
			}
			
			System.out.println("\nOUTPUT");
			System.out.println(matches.getSingles() + " " + matches.getDoubles());
			
			} catch (InvalidTimeSlotException e) {
				System.out.println(e.getMessage());
			}
	}
	public Matches calculateMatches() {
		int countSingles = 0;
		int countDoubles = 0;
		Iterator<TimeSlot> iterator = mapOfficeTimeSlot.keySet().iterator();
		while (iterator.hasNext()) {
			TimeSlot timeSlot = (TimeSlot) iterator.next();
			int size = mapOfficeTimeSlot.get(timeSlot).size();
			if (size >= 4) {
				//if over 4 players can play within same time slot then there would be one doubles match of an hour 
				countDoubles++;
			} else if (size > 1 && size < 4) {
				//if 2 or 3 players can play within same time slot then there would be one singles match of an hour
				countSingles++;
			}
		}
		return new Matches(countSingles, countDoubles);
	}
}