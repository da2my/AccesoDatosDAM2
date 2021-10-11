package gestionFicheros.texto.practica1.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gestionFicheros.texto.practica1.controller.ListPersonasMadrid;
import gestionFicheros.texto.practica1.model.GestionPersonas;
import gestionFicheros.texto.practica1.model.Persona;

public class RegistroPersonasGUI implements ActionListener {

  static JButton button = new JButton();
  
  public RegistroPersonasGUI() {
    // TODO Auto-generated constructor stub
    JFrame frame = new JFrame();
    
    button = new JButton("Incluir en Registro");
    button.addActionListener(this);

    JPanel panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
    panel.setLayout(new GridLayout(0, 1));
    panel.add(button);
    

    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Registro personas");
    frame.pack();
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    new RegistroPersonasGUI();



  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
//  GestionPersonas gPersonasMadrid = new GestionPersonas(new File(".\\archivoPersona.txt"));
//  gPersonasMadrid.crearPersona(new Persona("Adriana", "Mera", 42, 156, 57));
  JFrame frame1 = new JFrame();
  
  JPanel panel = new JPanel();
  panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 70, 200));
  panel.setLayout(new GridLayout(0, 1));
  
  frame1.add(panel, BorderLayout.CENTER);
  frame1.pack();
  frame1.setVisible(true);
  }

}
