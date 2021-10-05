
package classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;


//to draw in a JFrame (window) we need a JPanel
public class GameBoard extends JPanel{
    
    Ball ball = new Ball(0, 0);
    Bar bar1 = new Bar(10, 250);
    Bar bar2 = new Bar(794-10-Bar.WIDTH, 250);
    Audio audio = new Audio();
    public boolean finishGame = false;
    
    
    public GameBoard(){       
        //Can we let the user select the color?
        setBackground(Color.BLACK); 
        audio.PlaySound("src/song1.wav");
    
    }
    
    
    //method to paint ball and bars
    public void paintComponent(Graphics g){        
        
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g; //more functionalities
        g2.setColor(Color.BLUE);
        drawPoints(g2); //draw the points in g2
        draw(g2);   //drawing the components in g2
        update();   //updating the movement
    
    }
    
    
    public void draw(Graphics2D g){    
        g.fill(ball.getBall());         
        g.setColor(Color.white);
        g.fill(bar1.getBar());
        g.fill(bar2.getBar());
        //System.out.println("x=" + getBounds().getMaxX());
        //System.out.println("x=" + getBounds().getMaxY());
    }
    
    //In this method we update the ball and bar positions
    public void update(){        
        //getBouns returns the limits of the table
        ball.move(getBounds(), collision(bar1.getBar()), collision(bar2.getBar()));    
        bar1.moveBar1(getBounds());
        bar2.moveBar2(getBounds());
    }
    
    
    //method that determine if 2 rectangles intersects
    private boolean collision (Rectangle2D rectangle){        
        return ball.getBall().intersects(rectangle);     
    }
    
    
    private void drawPoints(Graphics2D g) {
        Graphics2D g1 = g, g2 = g;
        Font score = new Font("Arial", Font.BOLD, 30);
        g.setFont(score);

        g1.drawString(Integer.toString(ball.getScore1()), (float) getBounds().getCenterX() - 50, 30);
        g2.drawString(Integer.toString(ball.getScore2()), (float) getBounds().getCenterX() + 25, 30);
        
        if (ball.getScore1() == 5) {
            g.drawString("GANÓ EL JUGADOR 1", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            finishGame= true;
        }
        if (ball.getScore2() == 5) {
            g.drawString("GANÓ EL JUGADOR 2", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            finishGame = true;
        }
    }
    
    
    
    
    
    
    
}
