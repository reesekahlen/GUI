import javax.swing.*;    // For JFrame and JPanel
import java.awt.*;

public class GermanyFlag {

  public static void main(String[] args){
    
    JFrame theGUI = new JFrame();
    theGUI.setSize(300, 200);
    theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel1 = new JPanel();
    panel1.setBackground(Color.black);
    JPanel panel2 = new JPanel();
    panel2.setBackground(Color.red);
    JPanel panel3 = new JPanel();
    panel3.setBackground(Color.yellow);
    Container pane = theGUI.getContentPane();
    pane.setLayout(new GridLayout(3,0));
    pane.add(panel1);
    pane.add(panel2);
    pane.add(panel3);
    theGUI.setVisible(true);
    
  }
  
}