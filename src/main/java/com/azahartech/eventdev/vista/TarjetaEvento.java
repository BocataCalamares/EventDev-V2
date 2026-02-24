package com.azahartech.eventdev.vista;

import javax.swing.*;
import java.awt.*;

public class TarjetaEvento extends JPanel {

    public TarjetaEvento(String titulo, String fecha, String precio){
        JLabel textLabel = new JLabel();
        this.setLayout(new BorderLayout(10, 10));

        this.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        JTextArea infoText = new JTextArea("Descripcion " + fecha);

        JButton comprarButton = new JButton("Comprar - [" + precio + "]");

        JLabel tituloLabel = new JLabel(titulo);

        tituloLabel.setFont(new Font("Arial", Font.BOLD, 18));
        tituloLabel.setHorizontalAlignment(SwingConstants.CENTER);


        this.add(infoText, BorderLayout.CENTER);
        this.add(comprarButton, BorderLayout.SOUTH);
        this.add(tituloLabel, BorderLayout.NORTH);
    }

}
