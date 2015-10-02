import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.BasicStroke;

/**
 * Draws an awesome modular target.
 * 
 * @author Tyler H
 * @version 9/16/15
 */
public class Sun extends JComponent
{
    /** X value of top corner of the target */
    private int x;
    /** Y value of top corner of the target*/
    private int y;
    /** How wide the X axis of the target is*/
    private int height;
    /** How wide the Y axis of the target is*/
    private int width;/**
     * Constructer for class Target.
     */
    public Sun()
    {
        // initialise instance variables            
    }
    /**
     * Constructer for class Target.
     */
    public void SunMaker(int x1,int y1, int width1, int height1)
    {
        // initialise instance variables
        x=x1;
        y=y1;
        width=width1;
        height=height1;
     
    }

    /**
     * Draws a building.
     *
     * @post    Draws the target on the frame
     * @param   g2 is Graphics2D object
     */ 

    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun= new Ellipse2D.Double(x,y,width,height);
        g2.setColor(Color.YELLOW);
        g2.fill(sun);
        Random rand=new Random();
        Point2D.Double p1=new Point2D.Double(width/2+x,height/2+y);
        //(rand.nextDouble(1)+1)        
        Point2D.Double p2=new Point2D.Double(((int)width*((double)rand.nextInt(10)/10+2))/2+x+(width/2),((int)height*((double)rand.nextInt(10)/10+2))/2+y+(height/2));
        Point2D.Double p3=new Point2D.Double(x-((int)width*((double)rand.nextInt(10)/10+2))/2+(width/2),y-((int)height*((double)rand.nextInt(10)/10+2))/2+(height/2));
        Point2D.Double p4=new Point2D.Double(x+((int)width*((double)rand.nextInt(10)/10+2))/2+(width/2),y-((int)height*((double)rand.nextInt(10)/10+2))/2+(height/2));
        Point2D.Double p5=new Point2D.Double(x-((int)width*((double)rand.nextInt(10)/10+2))/2+(width/2),y+((int)height*((double)rand.nextInt(10)/10+2))/2+(height/2));
        Point2D.Double p6=new Point2D.Double(x+(width/2)+(rand.nextInt(width)-width/2),y+((int)height*((double)rand.nextInt(10)/5+2))/2+(height/2));
        Point2D.Double p7=new Point2D.Double(x+(width/2)-(rand.nextInt(width)-width/2),y-((int)height*((double)rand.nextInt(10)/5+2))/2+(height/2));
        Point2D.Double p8=new Point2D.Double(x+((int)width*((double)rand.nextInt(10)/10+2))/2+(width/2),y+(height/2)+(rand.nextInt(height)-height/2));
        Point2D.Double p9=new Point2D.Double(x-((int)width*((double)rand.nextInt(10)/10+2))/2+(width/2),y+(height/2)-(rand.nextInt(height)-height/2));
        Line2D.Double l1=new Line2D.Double(p1,p2);
        Line2D.Double l2=new Line2D.Double(p1,p3);
        Line2D.Double l3=new Line2D.Double(p1,p4);
        Line2D.Double l4=new Line2D.Double(p1,p5);
        Line2D.Double l5=new Line2D.Double(p1,p6);
        Line2D.Double l6=new Line2D.Double(p1,p7);
        Line2D.Double l7=new Line2D.Double(p1,p8);
        Line2D.Double l8=new Line2D.Double(p1,p9);
        g2.setStroke(new BasicStroke(5));
        g2.draw(l1);
        g2.draw(l2);        
        g2.draw(l3);
        g2.draw(l4);
        g2.draw(l5);
        g2.draw(l6);
        g2.draw(l7);
        g2.draw(l8);
        g2.setStroke(new BasicStroke(1));
        }
    }

