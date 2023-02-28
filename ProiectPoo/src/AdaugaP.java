import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class AdaugaP extends JFrame {
	
	
	
public AdaugaP() {
	setTitle("Second Frame");
    setSize(570, 300);
   
	  JPanel panel1= new JPanel();
	  GridLayout experimentLayout = new GridLayout(0,2);
	  JTextField nameField= new JTextField(30);
	  JTextField cnpField= new JTextField(15);
	  JTextField prioritateField = new JTextField(3);
	  JTextField externatField= new JTextField(15);
	  JTextField chitantaField= new JTextField(15);
	  JTextField boalaField= new JTextField(15);
	  JButton Save= new JButton("SAVE");
	  JTextField tratamentField= new JTextField(15);
	  JLabel label1 = new JLabel ("Nume:");
		panel1.add(label1);
	  panel1.add(nameField);
	  JLabel label2 = new JLabel ("CNP:");
		panel1.add(label2);
	  panel1.add(cnpField);
	  JLabel label3 = new JLabel ("Prioritae:");
		panel1.add(label3);
	  panel1.add(prioritateField);
	  JLabel label4 = new JLabel ("Externat:");
		panel1.add(label4);
	  panel1.add(externatField);
	  JLabel label5 = new JLabel ("Chitanta:");
		panel1.add(label5);
	  panel1.add(chitantaField);
	  JLabel label6 = new JLabel ("Boala:");
		panel1.add(label6);
	  panel1.add(boalaField);
	  JLabel label7 = new JLabel ("Tratament:");
		panel1.add(label7);
	  panel1.add(tratamentField);
	  panel1.add(Save);
	  Save.addActionListener(new ActionListener() {
		  @Override
		  public void actionPerformed(ActionEvent e) {
			  Sistem s=new Sistem();
		    Patient patient=new Patient(nameField.getText(), cnpField.getText(),boalaField.getText(), tratamentField.getText(), prioritateField.getText(),externatField.getText(),chitantaField.getText());
		    s.adaugaPacient(patient);
	  		System.out.println(s.getPacienti());
		  }
		}
		);
	  
	  this.setContentPane(panel1);
		this.setVisible(true);
}
}
