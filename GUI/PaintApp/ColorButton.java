package GUI.PaintApp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class ColorButton extends JButton{
  
  // instance variables
  private String name;
  private Color color;
  public static Random rand = new Random();

  // constructor
  public ColorButton(){
    name = "Try me";
    color = new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
    this.setBackground(color);
    this.setText(name);
  }

  public Color getColor(){
    return color;
  }

  public void setColor(Color g){
    color = g;
  }
}