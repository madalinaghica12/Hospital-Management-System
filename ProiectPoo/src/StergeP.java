import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class StergeP extends JFrame {
	
	
	
public StergeP() {
	setTitle("Second Frame");
    setSize(570, 300);
   
	  JPanel panel1= new JPanel();
	  GridLayout experimentLayout = new GridLayout(0,2);
	  JTextField nameField= new JTextField(30);
	  JButton Sterge= new JButton("sterge");
	  JLabel label1 = new JLabel ("Nume:");
		panel1.add(label1);
	  panel1.add(nameField);
	  panel1.add(Sterge);
	  Sterge.addActionListener(new ActionListener() {
		  @Override
		  public void actionPerformed(ActionEvent e) {
			  Sistem s=new Sistem();
			  Patient p1=new Patient("Maria Pop","1234567812345","Hipotensiune", "Pastile de tensiune","1","22.01.2023","500");
			    Patient p2=(new Patient("Andreea Pop","34567898765","Diabet", "Insulina","7","10.01.2023","200"));
			    s.adaugaPacient(p2);
			    s.adaugaPacient(p1);
			 String patientName = nameField.getText();
			    Patient patient = (Patient) searchPatientByName(patientName);
		   if(patient.getNume()==p1.getNume())
	  		{
			   s.stergePacienti(p1);
			   System.out.println(s.getPacienti());
			  
	  		}
		   else
		   {
			   if(patient.getNume()==p2.getNume())
		  		{
				   s.stergePacienti(p2);
				   System.out.println(s.getPacienti());
				  
		  		}

		   }
		  }
		}
		);
	  
	  this.setContentPane(panel1);
		this.setVisible(true);
}
private Patient searchPatientByName(String patientName) {
	Sistem s=new Sistem();
	 Doctor doctor1= new Doctor("Ion Popescu","Neurologie");
	 Doctor doctor2= new Doctor("Mihai Andrei","Oncologie");
    Doctor doctor3 = new Doctor("Alexandru Popa", "Cardiologie");
    Doctor doctor4=new Doctor("Jane Doe", "Surgeon");
    Patient p1=new Patient("Maria Pop","1234567812345","Hipotensiune", "Pastile de tensiune","1","22.01.2023","500");
    Patient p2=(new Patient("Andreea Pop","34567898765","Diabet", "Insulina","7","10.01.2023","200"));
	doctor1.adaugaPacienti(p1);
    doctor1.adaugaPacienti(p2);
    doctor2.adaugaPacienti(p1);
    doctor2.adaugaPacienti(p2);
    doctor3.adaugaPacienti(p1);
    s.adaugaPacient(p2);
    s.adaugaPacient(p1);
	 for (Patient patient : s.getPacienti()) {
	      if (patient.getNume().equals(patientName)) {
	        return patient;
	      }
	    }
	    // returnarea null daca nu exista un doctor cu numele specificat
	    return null;
	}
}