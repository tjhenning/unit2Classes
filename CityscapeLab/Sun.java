import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

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
    private int width;
    /**
     * Constructer for class Target.
     */
    public Sun(int x1,int y1, int width1, int height1)
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
        Point2D.Double p1=new Point2D.Double(width/2+x,height/2+y);
        }
    }

