import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PatientInterface extends JFrame {
  private JLabel dataExternareLabel;
  private JLabel chitantaLabel;
  private JLabel doctoriLabel;
  private JLabel tratamentLabel;

  public PatientInterface(Patient pacient) {
    setTitle("Actiuni pacient");
    setSize(500, 400);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    dataExternareLabel = new JLabel("Data externare: " + pacient.getExternat().toString());
    chitantaLabel = new JLabel("Chitanta: " + pacient.getChitanta());
    tratamentLabel= new JLabel("Tratament:"+pacient.getTratament());

    String doctoriString = "Doctori: ";
    List<Doctor> doctori = pacient.getDoctors();
    for (Doctor d : doctori) {
      doctoriString += d.getNume() + ", ";
    }
    doctoriLabel = new JLabel(doctoriString);

    add(dataExternareLabel, BorderLayout.NORTH);
    add(chitantaLabel, BorderLayout.EAST);
    add(doctoriLabel, BorderLayout.SOUTH);
    add(tratamentLabel,BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}