import javax.swing.*;
import java.awt.*;
import java.util.List;

public class DetaliiPacienti extends JFrame {
  private JLabel dataExternareLabel;
  private JLabel chitantaLabel;
  private JLabel doctoriLabel;
  private JLabel boalaLabel;
  private JLabel prioritateLabel;
  private JLabel tratamentLabel;
  private JLabel cnpLabel;
  private JLabel numeLabel;

  public DetaliiPacienti(Patient pacient) {
	  JPanel panel= new JPanel();
		GridLayout experimentLayout = new GridLayout(0,2);
		panel.setLayout(new GridLayout(0,2));
    setTitle(pacient.getNume());
    setSize(800, 800);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    dataExternareLabel = new JLabel("Data externare: " + pacient.getExternat().toString());
    chitantaLabel = new JLabel("Chitanta: " + pacient.getChitanta());
    tratamentLabel= new JLabel("Tratament: "+pacient.getTratament());
    boalaLabel=new JLabel("Boala: "+pacient.getBoala());
    prioritateLabel=new JLabel("Prioritate: "+pacient.getPrioritate());
    cnpLabel=new JLabel("CNP: "+pacient.getCNP());
    numeLabel=new JLabel("Nume: "+pacient.getNume());

    String doctoriString = "Doctori: ";
    List<Doctor> doctori = pacient.getDoctors();
    for (Doctor d : doctori) {
      doctoriString += d.getNume() + ", ";
    }
    doctoriLabel = new JLabel(doctoriString);

    panel.add(cnpLabel);
    panel.add(prioritateLabel);
    panel.add(chitantaLabel);
    panel.add(boalaLabel);
    panel.add(dataExternareLabel);
    panel.add(tratamentLabel);
    panel.add(doctoriLabel);
    this.setContentPane(panel);
	this.setVisible(true);
  }
}