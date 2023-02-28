import java.util.ArrayList;
import java.util.List;

public class Doctor {
	private String nume;
	private String specializare;
	private List<Patient>patients;
	
	public Doctor(String nume, String specializare)
	{
		this.nume=nume;
		this.specializare=specializare;
		this.patients=new ArrayList<Patient>();
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getSpecializare() {
		return specializare;
	}

	public void setSpecializare(String specializare) {
		this.specializare = specializare;
	}

	
	public void adaugaPacienti(Patient p)
	{
		patients.add(p);
		
	}
	public void stergePacient(Patient p)
	{
		patients.remove(p);
	}
	public List<Patient> getPacienti() {
		return patients;
	}

	public void modificaInfPacient(Patient p,String nume,String CNP,String boala,String tratament,String prioritate, String externat)
	{
		p.setNume(nume);
		p.setBoala(boala);
		p.setTratament(tratament);
		p.setCNP(CNP);
		p.setPrioritate(prioritate);
		p.setExternat(externat);
	}
	public Reteta prescrieReteta(Patient patient)
	{
		String medicamente=patient.getTratament();
		int doze=medicamente.length();
		String durataTrat = medicamente.length()+" de zile";
		return new Reteta(medicamente,doze,durataTrat);
	}
	public String toString()
	{
		return  nume ;
	}
}
