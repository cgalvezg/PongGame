
package classes;
import javax.swing.JFrame;


public class Window extends JFrame{
    
    //attributes
    private final int HEIGHT = 800, WIDTH = 600;
    private GameBoard frame;
    private GameThread gameThread;
    
    
    //constructor with the settings of the windows
    public Window(){
        setTitle("Pong by Carlos");
        setSize(HEIGHT, WIDTH);  
        setLocationRelativeTo(null);//display at center
        setResizable(false);
        frame = new GameBoard(); //new board
        add(frame); //adding board to the windows
        addKeyListener (new KeyboardEvent()); //create KeyboardEvent object
        gameThread = new GameThread(frame); 
        gameThread.start(); //starting a thread with the frame
              
        
    }
    
}
