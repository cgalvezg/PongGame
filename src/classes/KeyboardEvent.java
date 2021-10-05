
package classes;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


//KeyAdapter let us detect when the user press a key
public class KeyboardEvent extends KeyAdapter {
    
    static boolean w, s, up, down;
    
    //when the user press a key, calls this method
    public void keyPressed (KeyEvent e){
    
        //id save the key code pressed
        int id = e.getKeyCode();
        
        if (id == KeyEvent.VK_W){
            w = true;
        }
        if (id == KeyEvent.VK_S){
            s = true;
        }
        if (id == KeyEvent.VK_UP){
            up = true;
        }
        if (id == KeyEvent.VK_DOWN){
            down = true;
        }
    
    }
    
    //when the user release a key, calls this method
    public void keyReleased (KeyEvent e){
    
       //id save the key code pressed
        int id = e.getKeyCode();
        
        if (id == KeyEvent.VK_W){
            w = false;
        }
        if (id == KeyEvent.VK_S){
            s = false;
        }
        if (id == KeyEvent.VK_UP){
            up = false;
        }
        if (id == KeyEvent.VK_DOWN){
            down = false;
        }
    
    }
    
}
