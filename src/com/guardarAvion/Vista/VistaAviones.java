package com.guardarAvion.Vista;

import com.guardarAvion.ArchivoAviones;
import com.guardarAvion.Avion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class VistaAviones {

    public JButton MostrarAviones;
    public JButton Limpiar;
    public JTextArea textArea1;
    private JPanel panelAviones;
    public ArchivoAviones archivoAviones =  new ArchivoAviones();
    public ArrayList<Avion> aviones = new ArrayList<>();


    public String mostrarAviones () throws IOException {

        String rta;
        aviones = archivoAviones.traerAviones();

        if (aviones != null)
            rta = archivoAviones.mostrarAviones(aviones);
        else
            rta = "No hay aviones para mostrar.";

        return rta;
    }

    public VistaAviones(){
        MostrarAviones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    textArea1.setText(mostrarAviones());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        Limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
            }
        });
    }
    public static void main (String[] args) {

        JFrame frame = new JFrame("Aviones");
        frame.setContentPane(new VistaAviones().panelAviones);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
