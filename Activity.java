import java.util.ArrayList;

public class Activity {
	
	public String pickActivity() {
		//setup
		ArrayList<String> acts = new ArrayList<>();
		
		//---Add activities here---
		acts.add("Overwatch");
		acts.add("Anime");
		acts.add("Smash");
		acts.add("Ping Pong");
		acts.add("Quiplash");
		acts.add("Board game");
		acts.add("Minecraft");
		acts.add("Flash Game");
		acts.add("Code");
		//-------------------------
		
		//Pick random activity 
		int randNum = (int) (Math.random() * acts.size());
		return acts.get(randNum);
		
	}

}
