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
         Target target7= new Target(-85,-85,.75,.75);
         target7.draw(g2);
         NewishTarget target8=new NewishTarget(0,400,3,1,2);
         target8.draw(g2);
         NewishTarget target9=new NewishTarget(350,100,1,3,5);
         target9.draw(g2);
          HardTarget target10=new HardTarget(100,0,100,100,15);
          target10.draw(g2);
          HardTarget target11=new HardTarget(0,100,200,100,6);
          target11.draw(g2);
          HardTarget target12=new HardTarget(300,0,300,50,10);
          target12.draw(g2);
          HardTarget target13=new HardTarget(-25,-25,50,50,2);
          target13.draw(g2);
          HardTarget target14=new HardTarget(400,400,200,200,25);
          target14.draw(g2);
    }

}
