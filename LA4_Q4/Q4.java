package LA4_Q4;

import javax.swing.JFrame;

public class Q4
{
   public static void main(String[] args)
   {
      DrawPanel panel = new DrawPanel();
      
      JFrame application = new JFrame();
      
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      application.add(panel);   
      application.setSize(250, 250);
      application.setVisible(true);   
   } 
}