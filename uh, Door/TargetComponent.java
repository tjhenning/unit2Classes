import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;



public class TargetComponent extends JComponent
{
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2=(Graphics2D) g;
        Target target1= new Target(0,0,1,1);
        target1.draw(g2);
        Target target2= new Target(150,150,2,.5);
        target2.draw(g2);
        Target target3= new Target(150,0,1,3);
        target3.draw(g2);
        Target target4= new Target(0,150,.5,.5);
        target4.draw(g2);
        TargetOld target5=new TargetOld(0,200,.5,.5);
        target5.draw(g2);
        TargetOld target6=new TargetOld(0,300,3,1);
        target6.draw(g2);
        Target target7= new Target(-50,-50,.75,.75);
        target7.draw(g2);
    }

}
