import javax.swing.*;
import java.awt.*;
import java.util.List;

public class DetaliiDoctor extends JFrame {
  private JLabel pacientiLabel;
  

  public DetaliiDoctor(Doctor doctor) {
	  JPanel panel= new JPanel();
		GridLayout experimentLayout = new GridLayout(0,2);
		panel.setLayout(new GridLayout(0,2));
    setTitle(doctor.getNume());
    setSize(800, 800);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    String pacientiString = "Pacienti: ";
    List<Patient> pacienti = doctor.getPacienti();
    for (Patient  p : pacienti) {
    	pacientiString += p.getNume() + ", ";
    }
    pacientiLabel = new JLabel(pacientiString);

    panel.add(pacientiLabel);
    this.setContentPane(panel);
	this.setVisible(true);
  }
}