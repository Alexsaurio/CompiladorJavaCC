/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomas
 */
public class Oyente extends Panel implements ActionListener {

    private final Panel panel;

    public Oyente(Panel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        switch (s) {
            case "Abrir":
                try {
                    JFileChooser ch = new JFileChooser();
                    StringBuilder sb = new StringBuilder();
                    int n = ch.showOpenDialog(null);
                    if (n == JFileChooser.APPROVE_OPTION) {
                        File archivo = ch.getSelectedFile();
                        BufferedReader br = new BufferedReader(new FileReader(archivo));
                        do {
                            sb.append(br.readLine()).append("\n");
                        } while (br.ready());
                        panel.getArea().setText(sb.toString());
                        panel.getNomArc().setText("Nombre del archivo: "+archivo.getName());
                    }
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.PLAIN_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.PLAIN_MESSAGE);
                }
                break;
            case "Guardar":
                try {
                    JFileChooser ch = new JFileChooser();
                    String[] lineas = panel.getArea().getText().split("[\n]+");
                    int n = ch.showSaveDialog(null);
                    if (n == JFileChooser.APPROVE_OPTION) {
                        File archivo = ch.getSelectedFile();
                        PrintWriter pw = new PrintWriter(archivo + ".txt");
                        for (String linea : lineas) {
                            pw.println(linea);
                            pw.flush();
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Guardado correctamente");
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.PLAIN_MESSAGE);
                }
                break;

            case "Salir":
                System.exit(0);
                break;

            case "Limpiar":
                panel.getArea().setText(null);
                panel.getNomArc().setText(null);
                
                break;

            case "Compilar":
                try {

                    String[] lineas = panel.getArea().getText().split("\n");

                    PrintWriter pw = new PrintWriter(new File("C:\\Users\\Public\\Documents\\pruebaR.txt"));

                    for (String linea : lineas) {
                        pw.println(linea);
                        pw.flush();
                    }
                    Compilador Compilador1 = new Compilador(new FileInputStream("C:\\Users\\Public\\Documents\\pruebaR.txt"));
                    Compilador1.Programa();
                    StringBuilder sb = new StringBuilder();
                    JOptionPane.showMessageDialog(null, "Analisis Concluido", "Analisis", JOptionPane.PLAIN_MESSAGE);

                    for (int i = 0; i < CompiladorTokenManager.getTablaTok().size(); i++) {
                        sb.append(CompiladorTokenManager.getTablaTok().get(i)).append("\n");
                    }
                    CompiladorTokenManager.getTablaTok().clear();
                    PanelR p = new PanelR(sb.toString());
                    JFrame t = new JFrame();
                    t.setSize(600, 600);
                    t.setLocation(605,10);
                    t.add(p);
                    t.setVisible(true);
                    
                } catch (FileNotFoundException | ParseException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.PLAIN_MESSAGE);
                }
                break;
        }
    }

}
