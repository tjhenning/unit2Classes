import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    Car car=new Car(300,400,2,2);
    Sun sun=new Sun(getWidth()/2,getHeight()/8,50,50);
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Building building= new Building(100, 100,130,300);
        building.draw(g2);           
        car.draw(g2);
        Building building2= new Building(400, 200,100,200);
        building2.draw(g2);  
        sun.draw(g2);
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        int x=car.changeX();
        if (x<=-20)
        {
            x=(int)((double)getWidth()/1.2);
            car.setX(x);
        }
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
