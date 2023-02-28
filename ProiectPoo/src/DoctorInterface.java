import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DoctorInterface extends JFrame {
	private JComboBox<Patient> patientsList;
	 private ArrayList<Patient> patients;
	private JTextField textField;
	private JButton button;
	private JButton adaugaP;
	private JButton ModificaP;
	private JButton stergeP;
	private JList list;

	public DoctorInterface() {
	// Initializam interfata grafica
		setSize(500, 400);
		JPanel panel= new JPanel();
		GridLayout experimentLayout = new GridLayout(0,5);
	setTitle("Actiuni doctor");
	 
	textField = new JTextField(30);
	button = new JButton("Cauta");
	adaugaP = new JButton("Adauga Pacienti");
	stergeP = new JButton("Sterge Pacienti");
	ModificaP = new JButton("Modifica Detalii Pacienti");
	list = new JList();
	panel.add(textField);
	panel.add(button);
	panel.add(adaugaP);
	panel.add(stergeP);
	panel.add(ModificaP);
	panel.add(list);
	
	button.addActionListener(new ActionListener() {
		  @Override
		  public void actionPerformed(ActionEvent e) {
		    String doctorName = textField.getText();
		    Doctor doctor = searchDoctorByName(doctorName);
		    if (doctor != null) {
		      System.out.println(doctor.getPacienti());
		    }
		  }
		}
		);
	adaugaP.addActionListener(new ActionListener() {
		  @Override
		  public void actionPerformed(ActionEvent e) {
			 AdaugaP adg=new AdaugaP();
			 adg.setVisible(true);
		  }
		});
	stergeP.addActionListener(new ActionListener() {
		  @Override
		  public void actionPerformed(ActionEvent e) {
			  StergeP stg=new StergeP();
			  stg.setVisible(true);
			
		  }

		
		});
	this.setContentPane(panel);
	this.setVisible(true);
		}
	
	private Doctor searchDoctorByName(String name) {
		
		return getDoctorByName(name);
		}
	  public Doctor getDoctorByName(String name) {
		  Sistem s=new Sistem();
			 Doctor doctor1= new Doctor("Ion Popescu","Neurologie");
			 Doctor doctor2= new Doctor("Mihai Andrei","Oncologie");
		    Doctor doctor3 = new Doctor("Alexandru Popa", "Cardiologie");
		    Doctor doctor4=new Doctor("Jane Doe", "Surgeon");
		    Patient p1=new Patient("Maria Pop","1234567812345","Hipotensiune", "Pastile de tensiune","1","22.01.2023","500");
		    Patient p2=(new Patient("Andreea Pop","34567898765","Diabet", "Insulina","7","10.01.2023","200"));
		    p1.adaugaDoctori(doctor1);
			p1.adaugaDoctori(doctor2);
			p1.adaugaDoctori(doctor3);
			p1.adaugaDoctori(doctor4);
			p2.adaugaDoctori(doctor3);
			p2.adaugaDoctori(doctor1);
			doctor1.adaugaPacienti(p1);
		    doctor1.adaugaPacienti(p2);
		    doctor2.adaugaPacienti(p1);
		    doctor2.adaugaPacienti(p2);
		    doctor3.adaugaPacienti(p1);
		    doctor4.adaugaPacienti(p2);
		    doctor4.adaugaPacienti(p1);
			s.adaugaDoctor(doctor4);
			s.adaugaDoctor(doctor1);
			s.adaugaDoctor(doctor2);
			s.adaugaDoctor(doctor3);
		    for (Doctor doctor : s.getDoctori()) {
		      if (doctor.getNume().equals(name)) {
		        return doctor;
		      }
		    }
		    // returnarea null daca nu exista un doctor cu numele specificat
		    return null;
		  
	  }
	
}