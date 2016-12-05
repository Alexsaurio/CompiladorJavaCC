/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compilador;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Tomas
 */

public class PanelR extends JPanel {
    
    private JTextArea area;
    private final String texto;
    
    public PanelR(String texto) {
        this.texto = texto;
        setLayout(new BorderLayout());
        addComponentes();
    }

    private void addComponentes() {
        area = new JTextArea(texto);
        JScrollPane p = new JScrollPane(area);
        add(p, "Center");
    }

    /**
     * @return the area
     */
    public JTextArea getArea() {
        return area;
    }
    
}
