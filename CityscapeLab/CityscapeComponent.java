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
    Random rand=new Random();
    Rectangle sky= new Rectangle(0,0,1000,400);
    Rectangle ground= new Rectangle(0,400,1000,400);
    Rectangle road= new Rectangle(0,480,1000,150);
    Color color=new Color(204,255,255);
    Color color2=new Color(178,255,102);
    Car car=new Car(400,550,1,1);
    Sun sun=new Sun();    
    Car car2= new Car(300,450,3,3);
    Tree[] trees;   
    Building[] buildings;
    int sunSize;
    
    public CityscapeComponent(int buildingNum, int sunSize1,int treeNum)
    {
            int counter=0;
            buildings=new Building[buildingNum];
            while (counter<buildingNum){ 
                buildings[counter]=new Building(rand.nextInt(800),450+(rand.nextInt(20)-10),(rand.nextInt(4)*30)+70,rand.nextInt(150)+150);
                counter++;  
            }
            counter=0;
            trees=new Tree[treeNum];
            while (counter<treeNum){                             
                trees[counter]=new Tree(rand.nextInt(800),500+(rand.nextInt(40)-20),rand.nextInt(20)+20,rand.nextInt(20)+20);
                counter++;  
            }
            sunSize=sunSize1;
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
        g2.setColor(color2);
        g2.fill(ground);
        g2.setColor(Color.LIGHT_GRAY);
        g2.fill(road);
        sun.draw(g2);                          
        int counter=0;        
        while (counter<buildings.length){
                buildings[counter].draw(g2);
                counter++;  
            }
        counter=0;
        car.draw(g2);
        car2.draw(g2); 
        while (counter<trees.length){                             
                trees[counter].draw(g2);
                counter++;  
        }        
        }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
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
        sun.SunMaker(getWidth()/2,getHeight()/12,sunSize,sunSize);
        repaint();
    }

}
