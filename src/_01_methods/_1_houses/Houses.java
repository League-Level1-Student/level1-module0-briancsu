package _01_methods._1_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	static Robot rob;
	public static void main(String[] args) {
		rob = new Robot();
		
		rob.moveTo(25, 350);
		rob.setSpeed(100);
		rob.penDown();
		run("Small", new Color(255,0,0));
		run("Large", new Color(0,0,255));
		run("medium", new Color(255,255,0));
		run("Small", new Color(255,0,255));
		run("medium", new Color(0,255,0));
		run("large", new Color(255,0,255));
		run("Small", new Color(0,0,255));
		run("medium", new Color(255,255,0));
		run("large", new Color(255,0,0));
	}	
	
	public static void run(String num, Color c)
	{
		if (num.equalsIgnoreCase("Small")) {
			run(80, c);
		}
		else if (num.equalsIgnoreCase("Medium")) {
			run(120, c);
		}
		else if (num.equalsIgnoreCase("Large")) {
			run(250, c);
		}
		
	}
	
	public static void run(int height, Color c) {
		rob.setPenColor(c);
		rob.move(height);
		rob.turn(45);
		rob.move(80);
		rob.turn(90);
		rob.move(80);
		rob.turn(45);
		rob.move(height);
		rob.turn(-90);
		rob.move(80);
		rob.turn(-90);
		// Check the recipe to find out what code to put here
	}
}
