package dev.grafity.race;

public class App {
	public static void main(String[] args) {
		RaceBike bikeOne = new RaceBike("AP39 00 BQ 1341","FZ","YAMAHA",185,220,5,15,"Disk+Drum",0);
		System.out.println(bikeOne);
		
		
		bikeOne.gareUp();
		bikeOne.accelerate(10);
		System.out.println(bikeOne);
		
		bikeOne.gareUp();
		bikeOne.accelerate(30);
		System.out.println(bikeOne);
		
		bikeOne.gareUp();
		bikeOne.accelerate(20);
		System.out.println(bikeOne);
		
		bikeOne.gareUp();
		System.out.println(bikeOne);

		
		//bikeOne.applyBreak();
		System.out.println(bikeOne);
		
		
		System.out.println(bikeOne.getCurrentGare());
		System.out.println(bikeOne.getCurrentSpeed());
		
		System.out.println(RaceBike.getName());
		
		
		RaceBike bikeTwo = new RaceBike("AP39 00 BQ 1414","Gixer","Suzuki",185,220,5,15,"Disk+Drum",0);
		System.out.println(bikeTwo.version);
		System.out.println(bikeOne.version);
		bikeTwo.version = 3;
		System.out.println(bikeOne.version);
	}
}
