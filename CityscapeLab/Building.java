import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
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
public class Building extends JComponent
{
    /** X value of top corner of the building */
    private int x;
    /** Y value of top corner of the building*/
    private int y;
    /** How wide the X axis of the building is*/
    private int height;
    /** How wide the Y axis of the building is*/
    private int width;
    /**
     * Constructer for class Building.
     */
    public Building(int x1,int y1, int width1, int height1)
    {
        // initialise instance variables
        x=x1;
        y=y1-height1;
        width=width1;
        height=height1;
     
    }

    /**
     * Draws a building.
     *
     * @post    Draws the building on the frame
     * @param   g2 is Graphics2D object
     */ 

    public void draw(Graphics2D g2)
    {
        Rectangle mainBuilding = new Rectangle(x,y,width,height);
        int howMany=(int)(width/30)*(height/60);
        int inRow=(howMany-1)%(width/30);
        inRow++;
        int rowNum=0;
        int counter=0;
        int trueCounter=0;
        Rectangle window;
        g2.setColor(Color.BLACK);
        g2.fill(mainBuilding);
        g2.setStroke(new BasicStroke(2));
        g2.setColor(Color.DARK_GRAY);
        g2.draw(mainBuilding);
        g2.setStroke(new BasicStroke(1));
        Color color=new Color(204,255,255);
        g2.setColor(color);
        
        while (trueCounter<howMany){
            if (counter>=inRow){
                counter-=inRow;
                rowNum++;
                if (rowNum==-1+height/60){
                    rowNum=0;}
            }
            window = new Rectangle(x+10+(counter*30),y+10+(rowNum*60),20,40);
            //System.out.println(inRow);
            counter++;
            trueCounter++;
            g2.fill(window);
             }     
        window = new Rectangle(x+width/2-20,y+height-60,40,60);
        g2.setColor(Color.LIGHT_GRAY);
        g2.fill(window);
        }
    }

