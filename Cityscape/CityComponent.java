import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;



public class CityComponent extends JComponent
{
    
    public void CityComponent(Graphics g)
    {
         Graphics2D g2=(Graphics2D) g;
         Building building=new Building(100,100,100,100);
         building.draw(g2);
         System.out.print("Got Here Too");
    }

}
