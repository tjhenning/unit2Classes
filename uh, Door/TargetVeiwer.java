import javax.swing.JFrame;
import java.awt.Graphics;

/**
 * Write a description of class TargetVeiwer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetVeiwer
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class TargetVeiwer
     */
    public TargetVeiwer()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Makes the target
     *
     * @post    should call methods to eventually make the target
     *            
     */
    public static void main(String... args)
    {
        JFrame frame=new JFrame();
        frame.setSize(650,600);
        frame.setTitle("Awesome Targets");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent target=new TargetComponent();
        frame.add(target);
        Graphics g1=frame.getGraphics();
        frame.setVisible(true);        
        
    }

}
