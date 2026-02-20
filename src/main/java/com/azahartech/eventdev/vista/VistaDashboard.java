package com.azahartech.eventdev.vista;

import javax.swing.*;
import java.awt.*;

public class VistaDashboard extends JFrame {

        Container dashboard = getContentPane();

        public VistaDashboard() {
            this.setTitle("Dashboard");
            this.setSize(800, 600);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.getContentPane().setBackground(Color.WHITE);
            dashboard.setLayout(new BorderLayout(10, 10));
            dashboard.setBackground(Color.GRAY);
            initUI();
        }

        public void initUI(){
            //BARRA LATERAL

            //JPanel lienzo = new JPanel(new BorderLayout(10,10));
            //this.setContentPane(lienzo);
            //JPanel centro = new JPanel(new GridLayout(10, 1));
            JPanel barraLateral = new JPanel(new GridLayout(10, 1));

            this.setBackground(Color.GRAY);
            JButton catalogoButton = new JButton("Catálogo");
            JButton entradasButton = new JButton("Mis Entradas");
            JButton perfilButton = new JButton("Perfil");
            JButton salirButton = new JButton("Salir");

            barraLateral.add(catalogoButton);
            barraLateral.add(entradasButton);
            barraLateral.add(perfilButton);
            barraLateral.add(salirButton);
            barraLateral.setLayout(new GridLayout(10, 1));


            //dashboard.add(centro, BorderLayout.CENTER);
            dashboard.add(barraLateral, BorderLayout.WEST);

            //dashboard.add(barraLateral, BorderLayout.WEST);

            //BARRA SUR

            JPanel barraEstadoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            JLabel usuarioLabel = new JLabel("Usuario Invitado");
            barraEstadoPanel.add(usuarioLabel);
            dashboard.add(barraEstadoPanel, BorderLayout.SOUTH);

            //ZONA CENTRAL
            JPanel centroPanel = new JPanel();
            centroPanel.setBackground(Color.WHITE);
            dashboard.add(centroPanel, BorderLayout.CENTER);
        }

}

