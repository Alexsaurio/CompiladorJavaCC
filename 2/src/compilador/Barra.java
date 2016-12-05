/* To change this license header, choose License Headers in Project Properties.
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

public class Barra extends JMenuBar {
    
    private JMenu archivo;
    private JMenuItem abrir;
    private JMenuItem guardar;
    
    public Barra() {
        addComponentes();
    }

    private void addComponentes() {
        archivo = new JMenu("Archivo");
        abrir = new JMenuItem("Abrir");
        guardar = new JMenuItem("Guardar");
        archivo.add(abrir);
        archivo.add(guardar);
        this.add(archivo);
    }
    
    public void addEventos(Oyente o) {
        abrir.addActionListener(o);
        guardar.addActionListener(o);
    }
    
}
