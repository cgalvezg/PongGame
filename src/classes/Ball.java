
package classes;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;


public class Ball {
    
    //Positions
    private double x;
    private double y;
    private double dx=1, dy=1;
    private final int HEIGHT=15, WIDTH=15;
    private Integer score1 = 0, score2 = 0;
   
    
    public Ball(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    
    Audio audio = new Audio();  
    
    
    
    //Returns a ball
    public Rectangle2D getBall(){
        
      
        return new Rectangle2D.Double(x, y, WIDTH, HEIGHT);
        
    }
    
    //Moving the ball
    public void move(Rectangle limits, boolean collisionR1, boolean collisionR2){
        x += dx;
        y += dy;
        
        
        if (collisionR1){
            dx = -dx;
            x = 25;
            audio.PlaySound("src/ball.wav"); //play a sound when ball impacts to bar
        }
        
        if (collisionR2){
            dx = -dx;
            x = 755;
            audio.PlaySound("src/ball.wav"); //play a sound when ball impacts to bar
        }
        
        //if we reach a limit, change the direction
        if (x < limits.getMinX()) {
            score2++; //increase points to player2
           
            x = limits.getCenterX();
            y = limits.getCenterY();
            dx = -dx;
            
        }

        if (x + HEIGHT >= limits.getMaxX()) {
            score1++; //increase points to player1
            
            x = limits.getCenterX();
            y = limits.getCenterY();
            dx = -dx;
            
        }

        if (y < limits.getMinY()) {

            y = limits.getMinY();

            dy = -dy;
            
        }

        if (y + WIDTH >= limits.getMaxY()) {

            y = limits.getMaxY() - WIDTH;
            dy = -dy;
            
        }
        
    
    }
    
    
    public int getScore1(){
        return score1;
    }
    
    public int getScore2(){
        return score2;
    }
    
}
