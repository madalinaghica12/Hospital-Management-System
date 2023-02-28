import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class MainInterface extends JFrame {

  private JComboBox<Patient> patientsList;
  private ArrayList<Patient> patients;
  private JComboBox<Doctor> doctorList;
  private ArrayList<Doctor> doctors;

  public MainInterface() {
    setLayout(new FlowLayout());
    setTitle("Main frame");
    setSize(500, 400);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    patients = new ArrayList<Patient>();
    
    //pacienti
    Patient p1=new Patient("Maria Pop","1234567812345","Hipotensiune", "Pastile de tensiune","1","22.01.2023","500");
    Patient p2=(new Patient("Andreea Pop","34567898765","Diabet", "Insulina","7","10.01.2023","200"));
    
    
    //doctori
    Doctor doctor1= new Doctor("Ion Popescu","Neurologie");
	 Doctor doctor2= new Doctor("Mihai Andrei","Oncologie");
    Doctor doctor3 = new Doctor("Alexandru Popa", "Cardiologie");
    Doctor doctor4=new Doctor("Alexandru Doe", "chirurg");
	  //sistem.adaugaDoctor(doctor);
	  
	p1.adaugaDoctori(doctor1);
	p1.adaugaDoctori(doctor2);
	p1.adaugaDoctori(doctor3);
	p1.adaugaDoctori(doctor4);
	p2.adaugaDoctori(doctor3);
	p2.adaugaDoctori(doctor1);
	p2.adaugaDoctori(doctor2);
    patients.add(p1);
    patients.add(p2);
    patientsList = new JComboBox<Patient>();
    for (Patient patient : patients) {
      patientsList.addItem(patient);
    }

    add(patientsList);

    // Adauga un ascultator pentru lista de selectie
    patientsList.addActionListener(e -> {
      // Obtine doctorul selectat
      Patient selectedPatient = (Patient) patientsList.getSelectedItem();
      // Afiseaza lista de pacienti a acestuia intr-un tabel sau intr-o alta interfata
      displayDoctor(selectedPatient);
    });
    doctors = new ArrayList<Doctor>();
    doctors.add(doctor1);
    doctors.add(doctor2);
    doctors.add(doctor3);
    doctors.add(doctor4);
    doctor1.adaugaPacienti(p1);
    doctor1.adaugaPacienti(p2);
    doctor2.adaugaPacienti(p1);
    doctor2.adaugaPacienti(p2);
    doctor3.adaugaPacienti(p1);
    doctor4.adaugaPacienti(p2);
    doctor4.adaugaPacienti(p1);
   
    

    doctorList = new JComboBox<Doctor>();
    for (Doctor doctor : doctors) {
      doctorList.addItem(doctor);
    }

    add(doctorList);
    doctorList.addActionListener(e -> {
        // Obtine doctorul selectat
        Doctor selectedDoctor = (Doctor) doctorList.getSelectedItem();
        // Afiseaza lista de pacienti a acestuia intr-un tabel sau intr-o alta interfata
        displayPatients(selectedDoctor);
      });
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
  }

  private void displayDoctor(Patient patient) {
	 new DetaliiPacienti(patient);
	 
  }
  private void displayPatients(Doctor doctor) {
		 new DetaliiDoctor(doctor);
 
}
}
