/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import javax.swing.JFrame;

/**
 *
 * @author Tomas
 */
public class iniciar {
        public static void main(String[] args) {
        // TODO code application logic here
        Panel p = new Panel();
        Oyente o = new Oyente(p);
        p.addEventos(o);
        Menu m = new Menu();
        m.addEventos(o);
        JFrame f = new JFrame();
        f.setSize(600, 600);
        f.setJMenuBar(m);
        f.setLocation(10,10);
        f.setDefaultCloseOperation(3);
        f.add(p);
        f.setVisible(true);
    }
    
}
