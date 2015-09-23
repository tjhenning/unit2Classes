
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
public class HardTarget extends JComponent
{
    /** X value of top corner of the target */
    private int x;
    /** Y value of top corner of the target*/
    private int y;
    /** How wide the X axis of the target is*/
    private double xmult;
    /** How wide the Y axis of the target is*/
    private double ymult;
    /** amount of rings in the target*/
    private int amount;
    /**
     * Constructer for class Target.
     */
    public HardTarget(int x1,int y1,double xmult1, double ymult1, int amount1)
    {
        // initialise instance variables
        x=x1;
        y=y1;
        xmult=xmult1;
        ymult=ymult1;
        amount=amount1;
    }

    /**
     * Draws the target. Lots of math
     *
     * @post    Draws the target on the frame
     * @param   g2 is Graphics2D object
     */ 

    public void draw(Graphics2D g2)
    {
       int counter=1;   
       g2.setColor(Color.WHITE);
       Ellipse2D.Double ring;
       String stupid=new String("1");
       while (amount+1>counter)
       {               
        double xsize = (amount-(counter-1))*xmult/amount;
        double ysize = (amount-(counter-1))*ymult/amount;
        ring = new Ellipse2D.Double(x+50+(.5*xmult*counter/amount),y+50+(.5*ymult*counter/amount),xsize,ysize);//replace ymult with xmult for trippiness
        stupid=new String(g2.getColor().toString());
        g2.setColor(Color.BLACK);
        if (g2.getColor().toString().equals(stupid))
        {
            g2.setColor(Color.WHITE);           
        } else {
            g2.setColor(Color.BLACK);            
        }        
        counter++;  
        g2.draw(ring);
        g2.fill(ring);        
        }
    }
}
