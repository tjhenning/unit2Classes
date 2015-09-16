import javax.swing.JFrame;

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
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void Main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setSize(300,400);
        frame.setTitle("What");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Target target=new Target();
        frame.add(target);
        frame.setVisible(true);
    }

}
