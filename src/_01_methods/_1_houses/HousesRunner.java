package _01_methods._1_houses;

import java.awt.Color;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class HousesRunner {

	public static void main(String[] args) {
		//Here we call the run() method from the Houses class
		//Do not add any more code here!
		
		Houses houseBuilder = new Houses();
		houseBuilder.mai(args);
		houseBuilder.run("Small", new Color(255,0,0));
		houseBuilder.run("Large", new Color(0,0,255));
		houseBuilder.run("medium", new Color(255,255,0));
		houseBuilder.run("Small", new Color(255,0,255));
		houseBuilder.run("medium", new Color(0,255,0));
		houseBuilder.run("large", new Color(255,0,255));
		houseBuilder.run("Small", new Color(0,0,255));
		houseBuilder.run("medium", new Color(255,255,0));
		houseBuilder.run("large", new Color(255,0,0));


	}

}
