package com.azahartech.eventdev.vista;

import javax.swing.*;
import java.awt.*;

public class VistaRegistro extends JFrame {
    Container principal = getContentPane();

    public VistaRegistro() {
        this.setTitle("Registro");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        principal.setLayout(new BorderLayout(10, 10));
        principal.setBackground(Color.GRAY);
        this.initUI();
    }

    public void initUI(){
       //ZONA CENTRAL
        JPanel pnlRegistro = new JPanel();
        pnlRegistro.setLayout(new GridLayout(5, 2, 10, 10));
        JLabel nombre = new JLabel("Nombre Completo: ");
        JLabel email = new JLabel("Email: ");
        JLabel password = new JLabel("Contraseña: ");
        JLabel repetirPassword = new JLabel("Repetir Contraseña: ");
        JLabel edad = new JLabel("Edad: ");
        JTextField txtNombre = new JTextField();
        JTextField txtEmail = new JTextField();
        JTextField txtPass = new JTextField();
        JTextField txtRptPass = new JTextField();
        JTextField txtEdad = new JTextField();
        pnlRegistro.add(nombre);
        pnlRegistro.add(txtNombre);
        pnlRegistro.add(email);
        pnlRegistro.add(txtEmail);
        pnlRegistro.add(password);
        pnlRegistro.add(txtPass);
        pnlRegistro.add(repetirPassword);
        pnlRegistro.add(txtRptPass);
        pnlRegistro.add(edad);
        pnlRegistro.add(txtEdad);
        principal.add(pnlRegistro, BorderLayout.CENTER);

        //ZONA NORTE
        JLabel titulo = new JLabel("REGISTRIO :D");
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        principal.add(titulo, BorderLayout.NORTH);

        //ZONA SUR
        JPanel pnlBotones = new JPanel();
        JButton guardad = new JButton("GUARDAR");
        JButton cancelar = new JButton("CANCELAR");
        cancelar.addActionListener(e -> {
            new VistaLogin().setVisible(true);
            dispose();
        });
        pnlBotones.add(guardad);
        pnlBotones.add(cancelar);
        principal.add(pnlBotones, BorderLayout.SOUTH);
    }
}
