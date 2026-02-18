package com.azahartech.eventdev.vista;

import javax.swing.*;
import java.awt.*;

public class VistaLogin extends JFrame {

    public VistaLogin() {
        this.setTitle("Acceso a EventDev");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        JPanel principal = new JPanel();
        this.getContentPane().setBackground(Color.WHITE);
        principal.setLayout(new BorderLayout(10, 10));
        principal.setBackground(Color.WHITE);
        this.initUI();
    }
    public void initUI(){
        JPanel pnlFormulario = new JPanel();
        this.setLayout(new GridLayout(2, 2, 10, 10));
    }

}
