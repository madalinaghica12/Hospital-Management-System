import java.util.*;

public class Sistem {
  private List<Patient> pacienti;
  private List<Doctor> doctori;

  public Sistem() {
    pacienti = new ArrayList<>();
    doctori = new ArrayList<>();
  }
  public List<Patient> getPacienti() {
    return pacienti;
  }

  public void adaugaPacient(Patient pacient) {
    pacienti.add(pacient);
  }
  public void stergePacienti(Patient p)
	{
		pacienti.remove(p);
	}

  public void adaugaDoctor(Doctor doctor) {
    doctori.add(doctor);
  }

  

  public List<Doctor> getDoctori() {
    return doctori;
  }

}
 

    
