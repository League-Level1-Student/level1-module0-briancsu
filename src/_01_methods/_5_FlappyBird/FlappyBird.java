package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 500;
    static final int HEIGHT = 750;
    int birdX = 200;
    int birdY = 300;
    int birdYVelocity = -100;
    int gravity = 5;
    int upPipeX = 250;
    int lowPipeX = 250;
    int upPipeY = -130;
    int lowPipeY = 375;
    int pipeGap = 500;
    PImage back;
    PImage pipeBottom;
    PImage pipeTop;
    PImage bird;
    @Override
       public void setup() {
           back = loadImage("flappyBackground.jpg");
           pipeBottom = loadImage("bottomPipe.png");
           pipeTop = loadImage("topPipe.png");
           bird = loadImage("bird.png");
           bird.resize(50,50);
           teleportePipes();
       }
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

  
   

    @Override
    public void draw() {
    	background(back);
        image (pipeBottom,lowPipeX,lowPipeY);
        image (pipeTop,upPipeX,upPipeY);
        image (bird, birdX, birdY);
    	birdY += gravity;
    	lowPipeX -= 5;
    	upPipeX -= 5;
    	if(upPipeX <= 0) {
    		teleportePipes();
    	}
    }
    public void mousePressed() {
    	if(mousePressed) {
    		birdY += birdYVelocity;
    	}
    }
    public void teleportePipes() {
    		lowPipeX = 500;
    		upPipeX = 500;
    		upPipeY = (int) random(-250, 250);
    		lowPipeY = upPipeY + pipeGap;
    	
    }
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
