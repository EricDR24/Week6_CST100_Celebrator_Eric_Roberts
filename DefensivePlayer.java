import java.util.Random;

/** 
* 	Program: Celebrator Interface
* 	File: DefensivePlayer.java
* 	Summary: Students will create an interface which the NFLPlayer class will “implement.” 
* 		     This interface will determine the player’s reaction when they are drafted.
* 	Author: Eric Roberts
* 	Date: July 30, 2016 
**/
class DefensivePlayer extends NFLPlayer implements Celebrator {
	private double tackels;
	private double sacks;
	private int forcedFumbles;
	
	public DefensivePlayer() {
		
	}
	
	public void celebrate() {
		//random celebrate
		int celebrateRandom = new Random().nextInt(Celebrator.celebrations.length);
		String randomCelebrate = (Celebrator.celebrations[celebrateRandom]);
		
		//print celebration
		System.out.println(this.name + " " + randomCelebrate + " to celebrate!");
	}
	
	public DefensivePlayer(String name, String position, String team, int number, double height, double weight, int age, String College, int experience, double tackels, double sacks, int forcedFumbles) {
		this.name = name;
		this.position = position;
		this.team = team;
		this.number = number;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.College = College;
		this.experience = experience;
		this.tackels = tackels;
		this.sacks = sacks;
		this.forcedFumbles = forcedFumbles;
		
	}
	
	//getters
	public double getSacks() {
		return sacks;
	}
	
	public double getTackels() {
		return tackels;
	}
	
	public int getForcedFumbles() {
		return forcedFumbles;
	}
	
	//setters
	public void setTackels(double playerTackels) {
		tackels = playerTackels;
	}
	
	public void setSacks(double playerSacks) {
		sacks = playerSacks;
	}
	
	public void setForcedFumbles(int playerForcedFumbles) {
		forcedFumbles = playerForcedFumbles;
	}
}

