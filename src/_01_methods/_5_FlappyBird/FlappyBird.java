package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 500;
    static final int HEIGHT = 750;
    static boolean gameEnd = false;
    static int birdX = 200;
    static int birdY = 300;
    static int birdYVelocity = -100;
    static int gravity = 3;
    static int upPipeX = 250;
    static int lowPipeX = 250;
    static  int upPipeY = -130;
    static int lowPipeY = 375;
    static  int pipeGap = 500;
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
    	lowPipeX -= 3;
    	upPipeX -= 3;
    	if(upPipeX <= 0) {
    		teleportePipes();
    	}
    	intersectsPipes();
    	
    	if(birdY >= HEIGHT) {
    		System.exit(0);
    	}
    }
    
   boolean intersectsPipes() { 
        if (birdY < upPipeY +400 && birdX > upPipeX && birdX < (upPipeX+50)){
        	 System.exit(0);
        	gameEnd = true;
        	return true; 
        }
       else if (birdY>lowPipeY && birdX > lowPipeX && birdX < (lowPipeX+50)) {
    	   System.exit(0);
    	  gameEnd = true;
    	   return true; }
       else { 
    	   return false;
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
    		upPipeY = (int) random(-200, 200);
    		lowPipeY = upPipeY + pipeGap;
    	
    }
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
       
    }
}
