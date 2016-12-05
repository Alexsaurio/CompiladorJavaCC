/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Tomas
 */
public class Panel extends JPanel {

    private JButton boton;
    private JButton btnSalir;
    private JButton btnClean;
    private JTextArea area;
    public static JLabel etiqueta;
    private JLabel nomArc;

    public Panel() {
        addComponentes();
    }

    private void addComponentes() {
        setLayout(new BorderLayout());
        JPanel panelS = new JPanel();
        JPanel panelN = new JPanel();
        area = new JTextArea(40, 10);
        JScrollPane panelC = new JScrollPane(getArea());
        nomArc = new JLabel();
        nomArc.setSize(30, 30);
        panelN.add(nomArc);
        
        boton = new JButton("Compilar");
        btnSalir = new JButton("Salir");
        btnClean = new JButton("Limpiar");

        
        panelS.add(boton);
        panelS.add(btnSalir);
        panelS.add(btnClean);

        add(panelC, "Center");
        add(panelS, "South");
        add(panelN, "North");
    }

    public void addEventos(Oyente o) {
        boton.addActionListener(o);
        btnSalir.addActionListener(o);
        btnClean.addActionListener(o);
        nomArc.setText(null);
    }

    /**
     * @return the area
     */
    public JTextArea getArea() {
        return area;
    }

    /**
     * @return the nomArc
     */
    public JLabel getNomArc() {
        return nomArc;
    }

}
