
package classes;

import java.util.logging.Level;
import java.util.logging.Logger;
import classes.Window;
import javax.swing.JFrame;


public class GameThread extends Thread{
    GameBoard frame;
    
    public GameThread (GameBoard frame){
        this.frame = frame;
    }
    
    @Override
    public void run(){
        
        
        
        while(!frame.finishGame){
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            frame.repaint();
        
        }
    }
    
}
