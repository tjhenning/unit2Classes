import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.BasicStroke;

/**
 * Draws an awesome modular target.
 * 
 * @author Tyler H
 * @version 9/16/15
 */
public class Car
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
     * Constructer for class Target.
     */
    public Car(int x1,int y1, int width1, int height1)
    {
        // initialise instance variables        
        x=x1;
        y=y1;
        width=width1;
        height=height1;
     
    }
    public int changeX()
    {
        x-=10;
        return x;
        
        
    }
     public void setX(int newX)
    {
        x=newX;
               
    }
    /**
     * Draws a building.
     *
     * @post    Draws the target on the frame
     * @param   g2 is Graphics2D object
     */ 

    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.BLACK);
        Rectangle mainBuilding = new Rectangle(x,10*height+y,60*width,10*height);
        g2.fill(mainBuilding);        
        Point2D.Double p3=new Point2D.Double(20*width+x,y);
        Point2D.Double p4=new Point2D.Double(10*width+x,10*height+y);
        Line2D.Double l2=new Line2D.Double(p3,p4);
        Point2D.Double p5=new Point2D.Double(52*width+x,y);
        Point2D.Double p6=new Point2D.Double(60*width+x,10*height+y);
        Line2D.Double l3=new Line2D.Double(p5,p6);
        Line2D.Double l1=new Line2D.Double(p5,p3);
        Ellipse2D.Double tire1=new Ellipse2D.Double(width*9+x,height*15+y,10*width,10*height);
        Ellipse2D.Double tire2=new Ellipse2D.Double(width*45+x,height*15+y,10*width,10*height);
        Point2D.Double p7=new Point2D.Double(25*width+x,height+y);
        Point2D.Double p8=new Point2D.Double(25*width+x,10*height+y);
        Point2D.Double p9=new Point2D.Double(25*width+x,height+y);
        Point2D.Double p10=new Point2D.Double(25*width+x,10*height+y);
        g2.draw(l1);
        g2.draw(l2);
        g2.draw(l3);
        g2.setColor(Color.GRAY);
        g2.fill(tire1);
        g2.fill(tire2);
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(5));
        g2.draw(tire1);
        g2.draw(tire2);        
        Line2D.Double l4=new Line2D.Double(p8,p7);
        g2.draw(l4);
        g2.setStroke(new BasicStroke(1));
        }
    }

