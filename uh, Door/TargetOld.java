import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Hopefully draws a target.
 * 
 * @author Tyler H
 * @version 9/16/15
 */
public class TargetOld extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;
    private double xmult;
    private double ymult;
    /**
     * Default constructor for objects of class Target
     */
    public TargetOld(int x1,int y1,double xmult1, double ymult1)
    {
        // initialise instance variables
        x=x1;
        y=y1;
        xmult=xmult1;
        ymult=ymult1;
    }


     public void draw(Graphics2D g2)
    {
       
        //Point2D.Double r1=new Point2D.Double(50,50);
        Ellipse2D.Double biggest = new Ellipse2D.Double(x+50,y+50,100*xmult,100*ymult);
        Ellipse2D.Double t2 = new Ellipse2D.Double(x+62.5,y+62.5,75*xmult,75*ymult);
        Ellipse2D.Double t3 = new Ellipse2D.Double(x+75,y+75,50*xmult,50*ymult);
        Ellipse2D.Double t4 = new Ellipse2D.Double(x+87.5,y+87.5,25*xmult,25*ymult);
        g2.setColor(Color.BLACK);
        g2.draw(biggest);
        g2.fill(biggest);
        g2.setColor(Color.WHITE);
        g2.draw(t2);
        g2.fill(t2);
        g2.setColor(Color.BLACK);
        g2.draw(t3);
        g2.fill(t3);
        g2.setColor(Color.WHITE);
        g2.draw(t4);
        g2.fill(t4);
        //g2.setColor(Color.BLACK);
        //THIS IS MADNESS
       
    }
}
