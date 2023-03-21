package LA4_Q3;
import java.awt.Graphics; 
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      int temp = 0;
      int width = getWidth();  
      int height = getHeight();
      for(int i=0; i <=15;i++)
      {
         g.drawLine(0,0,width-temp,0+temp);
         temp+=20;
      }
      temp=0;
      for(int i=0; i <=15;i++)
      {
         g.drawLine(width,height,width-temp,0+temp);
         temp+=20;
      }
      temp=0;
      
   } 
} // end class DrawPanel

