/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package idontknowwhatimdoing;
import java.awt.*;
import javax.swing.*;
public class PanMain extends JPanel{
    PanHUD hud = new PanHUD();//South
    PanCenter center = new PanCenter();  //Center
  //  PanHero hero = new PanHero();
    public PanMain(){
        setLayout(new BorderLayout());
       // add(panMenu, BorderLayout.NORTH);
        
        add(hud, BorderLayout.SOUTH);
        add(center, BorderLayout.NORTH);
        
     //   add (hero, BorderLayout.CENTER);      //DECIDED NOT TO MAKE HERO ON A DIFFERENT PANEL BECAUSE I WAS UNABLE TO MAKE HERO PANEL HAVE A TRANSPARENT BACKGROUND
        
        
      
    }
}
