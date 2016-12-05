/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Tomas
 */
public class Menu extends JMenuBar {

    private JMenu menu;
    private JMenuItem abrir;
    private JMenuItem guardar;

    public Menu() {
        addComponentes();
    }

    private void addComponentes() {
        menu = new JMenu("Archivo");
        abrir = new JMenuItem("Abrir");
        guardar = new JMenuItem("Guardar");
        menu.add(abrir);
        menu.add(guardar);
        this.add(menu);
    }

    public void addEventos(Oyente o) {
        abrir.addActionListener(o);
        guardar.addActionListener(o);
    }

}
