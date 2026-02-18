package com.azahartech.eventdev.vista;

import javax.swing.*;
import java.awt.*;

public class VistaLogin extends JFrame {
    Container principal = getContentPane();
    public VistaLogin() {
        this.setTitle("Acceso a EventDev");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        principal.setLayout(new BorderLayout(10, 10));
        principal.setBackground(Color.GRAY);
        this.initUI();

    }
    public void initUI(){
       //ZONA CENTRAL

        JPanel pnlFormulario = new JPanel();
        pnlFormulario.setLayout(new GridLayout(2, 2, 10, 10));
        JLabel lblEmail = new JLabel("Email:");
        JTextField txtEmail = new JTextField();
        JLabel lblPassword = new JLabel("Contraseña");
        JPasswordField txtPsswd = new JPasswordField();
        pnlFormulario.add(lblEmail);
        pnlFormulario.add(txtEmail);
        pnlFormulario.add(lblPassword);
        pnlFormulario.add(txtPsswd);
        principal.add(pnlFormulario, BorderLayout.CENTER);

        //ZONA NORTE

        JLabel titulo = new JLabel("Bienvenido a EventDev");
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        principal.add(titulo, BorderLayout.NORTH);

        //ZONA SUR

        JPanel pnlbotones = new JPanel();
        pnlbotones.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton btnLogin = new JButton("ENTRAR");
        JButton btnRegistro = new JButton("REGISTRARSE");
        btnRegistro.addActionListener(e -> {
                    new VistaRegistro().setVisible(true);
                    dispose();
                });
        pnlbotones.add(btnLogin);
        pnlbotones.add(btnRegistro);
        principal.add(pnlbotones, BorderLayout.SOUTH);

    }


}
