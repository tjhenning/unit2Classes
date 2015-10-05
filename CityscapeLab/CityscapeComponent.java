import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;
import java.awt.Rectangle;
import java.awt.Color;

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
    Random rand=new Random();
    Car car=new Car(400,500,1,1);
    Sun sun=new Sun();
    Car car2=new Car(300,410,3,3);
    Tree tree1=new Tree(500,400,35,35);
    Tree tree2=new Tree(250,400,35,35);
    //Building b1=new Building(rand.nextInt)
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
        Rectangle sky= new Rectangle(0,0,getWidth(),getHeight()/2);
        Color color=new Color(204,255,255);
        g2.setColor(color);
        g2.fill(sky);                
        Building building= new Building(100, 100,130,300);
        building.draw(g2);
        car.draw(g2);
        car2.draw(g2);
        Building building2= new Building(400, 200,100,200);
        building2.draw(g2);  
        sun.SunMaker(getWidth()/2,getHeight()/12,50,50);
        sun.draw(g2);      
        tree1.draw(g2);
        tree2.draw(g2);
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
        int x2=car2.changeX();
        if (x2<=-30)
        {
            x2=(int)((double)getWidth()/1.2);
            car2.setX(x2);
        }
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
