import java.util.*;

public class Patient {
	private String nume;
	private String CNP;
	private String boala;
	private String tratament;
	private List<Doctor>doctors;
	private String prioritate;
	private String externat;
	private String chitanta;
	
	public Patient(String nume,String CNP,String boala,String tratament,String prioritate, String externat,String chitanta)
	{ 
		this.nume=nume;
		this.CNP=CNP;
		this.boala=boala;
		this.tratament=tratament;
		this.prioritate=prioritate;
		this.externat=externat;
		this.chitanta=chitanta;
		this.doctors=new ArrayList<Doctor>();
	}
	public String getExternat() {
		return externat;
	}
	public void setExternat(String externat) {
		this.externat = externat;
	}
public String getCNP() {
		return CNP;
	}
	public void setCNP(String cNP) {
		CNP = cNP;
	}
	public String getChitanta() {
		return chitanta;
	}
	public void setChitanta(String chitanta) {
		this.chitanta = chitanta;
	}
public String getBoala() {
		return boala;
	}

	public void setBoala(String boala) {
		this.boala = boala;
	}

	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	
	public String getTratament() {
		return tratament;
	}

	public void setTratament(String tratament) {
		this.tratament = tratament;
	}
	
	public String getPrioritate() {
		return prioritate;
	}

	public void setPrioritate(String prioritate) {
		this.prioritate = prioritate;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void adaugaDoctori(Doctor d)
	{
		doctors.add(d);
		
	}
	public String toString()
	{
		return nume;
	}
	
}
