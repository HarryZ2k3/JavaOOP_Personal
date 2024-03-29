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
      //Top left corner
      for(int i=0; i <=height;i++)
      {
         g.drawLine(0,0,width-temp,0+temp);
         temp+=20;
      }
      temp=0;
      //bottom right corner
      for(int i=0; i <=width;i++)
      {
         g.drawLine(width,height,width-temp,0+temp);
         temp+=20;
      }
      temp=0;
      //Top right
      for(int i=0; i <=height;i++)
      {
         g.drawLine(width,0,0+temp,0+temp);
         temp+=20;
      }
      temp=0;
      //Bottom left
      for(int i=0; i <=height;i++)
      {
         g.drawLine(0,height,0+temp,0+temp);
         temp+=20;
      }
      temp=0;
   } 
} // end class DrawPanel

