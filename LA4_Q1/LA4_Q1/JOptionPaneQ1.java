package LA4_Q1;
import javax.swing.JOptionPane;

public class JOptionPaneQ1 {
    public static void main(String[] args) 
    {
        var name = javax.swing.JOptionPane.showInputDialog("What is your name?");
        var ouput = "Welcome " + name + " to the answer !";
        JOptionPane.showMessageDialog(null, ouput);
    }
}
