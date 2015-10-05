import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
//import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.BasicStroke;
import java.util.Random;


/**
 * Draws an awesome modular target.
 * 
 * @author Tyler H
 * @version 9/16/15
 */
public class Tree
{
    /** X value of top corner of the target */
    private int x;
    /** Y value of top corner of the target*/
    private int y;
    /** How wide the X axis of the target is*/
    private int height;
    /** How wide the Y axis of the target is*/
    private int width;
    /**
     * Constructer for class Tree.
     */
    public Tree(int x1,int y1, int width1, int height1)
    {
        // initialise instance variables        
        x=x1;
        y=y1;
        width=width1;
        height=height1;
     
    }
   
    /**
     * Draws a tree.
     *
     * @post    Draws the target on the frame
     * @param   g2 is Graphics2D object
     */ 

    public void draw(Graphics2D g2)
    {
        Color color=new Color(102,51,0);
        g2.setColor(color);
       
        Random rand=new Random();
        Rectangle trunk= new Rectangle(x+(width/5),y+height/2,width/5,3*height);
        g2.fill(trunk);        
        g2.setColor(Color.GREEN);
        Ellipse2D leaf1=new Ellipse2D.Double(x+(rand.nextInt(width+(width/2))-((width+(width/2))/2)),y+(rand.nextInt(height+(height/2))-((height+(height/2))/2)),width-((rand.nextInt(width)-width/2)/4),height-((rand.nextInt(height)-height/2)/4));
        g2.fill(leaf1);
        int counter=0;
        while (counter<=7){        
        leaf1=new Ellipse2D.Double(x+(rand.nextInt(width+(width/2))-((width+(width/2))/2)),y+(rand.nextInt(height+(height/2))-((height+(height/2))/2)),width-((rand.nextInt(width)-width/2)/4),height-((rand.nextInt(height)-height/2)/4));
        g2.fill(leaf1);
        counter++;
    }
    }
    }

