
public class Reteta {
	private String medicamente;
	private int doze;
	private String durataTrat;
	
	public Reteta(String medicamente,int doze, String durataTrat)
	{
		this.medicamente=medicamente;
		this.doze=doze;
		this.durataTrat=durataTrat;
	}

	public String getMedicamente() {
		return medicamente;
	}

	public void setMedicamente(String medicamente) {
		this.medicamente = medicamente;
	}

	public int getDoze() {
		return doze;
	}

	public void setDoze(int doze) {
		this.doze = doze;
	}

	public String getDurataTrat() {
		return durataTrat;
	}

	public void setDurataTrat(String durataTrat) {
		this.durataTrat = durataTrat;
	}
	public String toString()
	{
		return "\n"+medicamente +" "+doze+" "+durataTrat;
	}
	
}
