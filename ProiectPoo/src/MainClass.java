import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		  Sistem sistem = new Sistem();
		  //adaugam un doctor in sistem
		  Doctor doctor = new Doctor("Alexandru Popa", "Cardiologie");
		  //sistem.adaugaDoctor(doctor);
		  Doctor doctor1= new Doctor("Ion Popescu","Neurologie");
		  Doctor doctor2= new Doctor("Mihai Andrei","Oncologie");
		  Patient patient1=new Patient("Maria Pop","1234567812345","Hipotensiune", "Pastile de tensiune","1","22.01.2023","500");
		  Patient p2=(new Patient("Andreea Pop","34567898765","Diabet", "Insulina","7","10.01.2023","200"));
		  sistem.adaugaPacient(patient1);
		 patient1.adaugaDoctori(doctor1);
		 patient1.adaugaDoctori(doctor2);
		  patient1.adaugaDoctori(doctor);
		  p2.adaugaDoctori(doctor1);
		  doctor1.adaugaPacienti(p2);
		  doctor1.adaugaPacienti(patient1);
		 System.out.println(doctor1.prescrieReteta(patient1));
		new PatientInterface(patient1);
		new DoctorInterface();
		new MainInterface();
		
	}
}
