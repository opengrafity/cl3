package dev.grafity.video;

public class Test {
	public static void main(String[] args) {
		float playingAt = 9.58F;
		float forwardBy = 0.10F;
		int playingAtMins = (int)playingAt;
		float playingAtSecs = playingAt-playingAtMins;
		
		int forwardTo = (int)((playingAtSecs+forwardBy)*100);
		
		int incMinBy = 0;		
		float incSecBy = 0;
		
		if(forwardTo >= 60) {
			incMinBy = forwardTo/60;
			incSecBy = (forwardTo % 60)*0.01F;
			playingAt = (playingAtMins + incMinBy) + incSecBy;
		}else {
			playingAt = playingAtMins + (forwardTo*0.01F);
		}
		System.out.println(playingAt);
	}
}
