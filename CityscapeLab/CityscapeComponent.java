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
 * @author @tjhenning
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    Random rand=new Random();
    Rectangle sky= new Rectangle(0,0,getWidth(),getHeight()/2);
    Color color=new Color(204,255,255);
    Car car=new Car(400,500,1,1);
    Sun sun=new Sun();
    Car car2=new Car(300,410,3,3);
    Tree tree1=new Tree(rand.nextInt(800),500+(rand.nextInt(40)-20),rand.nextInt(20)+20,rand.nextInt(20)+20);
    Tree tree2=new Tree(rand.nextInt(800),500+(rand.nextInt(40)-20),rand.nextInt(20)+20,rand.nextInt(20)+20);
    Tree tree3=new Tree(rand.nextInt(800),500+(rand.nextInt(40)-20),rand.nextInt(20)+20,rand.nextInt(20)+20);
    Tree tree4=new Tree(rand.nextInt(800),500+(rand.nextInt(40)-20),rand.nextInt(20)+20,rand.nextInt(20)+20);
    Tree tree5=new Tree(rand.nextInt(800),500+(rand.nextInt(40)-20),rand.nextInt(20)+20,rand.nextInt(20)+20);
    Building[] buildings;
    // Building b2=new Building(rand.nextInt(800),450+(rand.nextInt(20)-10),(rand.nextInt(4)*30)+70,rand.nextInt(150)+150);
    // Building b3=new Building(rand.nextInt(800),450+(rand.nextInt(20)-10),(rand.nextInt(4)*30)+70,rand.nextInt(150)+150);
    // Building b4=new Building(rand.nextInt(800),450+(rand.nextInt(20)-10),(rand.nextInt(4)*30)+70,rand.nextInt(150)+150);
    // Building b5=new Building(rand.nextInt(700),450+(rand.nextInt(20)-10),(rand.nextInt(4)*30)+70,rand.nextInt(150)+150);
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    public CityscapeComponent(int buildingNum)
    {
            int counter=0;
            buildings=new Building[buildingNum];
            while (counter<buildingNum){                             
                buildings[counter]=new Building(rand.nextInt(800),450+(rand.nextInt(20)-10),(rand.nextInt(4)*30)+70,rand.nextInt(150)+150);
                counter++;  
            }
            
    }
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(color);
        g2.fill(sky);
        sun.SunMaker(getWidth()/2,getHeight()/12,50,50);
        sun.draw(g2);         
        car.draw(g2);
        car2.draw(g2);             
        tree1.draw(g2);
        tree2.draw(g2);
        tree3.draw(g2);
        tree4.draw(g2);
        tree5.draw(g2);
        int counter=0;
        while (counter<buildings.length){                             
                buildings[counter].draw();
                counter++;  
            }
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
