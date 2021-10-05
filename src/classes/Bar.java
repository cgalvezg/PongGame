
package classes;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;


public class Bar {
    private int x,y;
    static final int WIDTH = 10, HEIGHT = 60;
    
    public Bar (int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public Rectangle2D getBar(){
        return new Rectangle2D.Double(x, y, WIDTH, HEIGHT);    
    }
    
    public void moveBar1(Rectangle limits){
    
        if (KeyboardEvent.w && y > limits.getMinY()){
            y--;
        }
         if (KeyboardEvent.s && y < limits.getMaxY()-HEIGHT){
            y++;
        }
    
    
    }
    
    public void moveBar2 (Rectangle limits){
        
        if (KeyboardEvent.up && y > limits.getMinY()){
            y--;
        }
         if (KeyboardEvent.down && y < limits.getMaxY()-HEIGHT){
            y++;
        }
    
    
    }
    
    
    
}
