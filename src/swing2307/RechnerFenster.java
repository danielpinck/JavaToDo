package swing2307;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RechnerFenster extends JFrame implements ActionListener {
    private JPanel hauptPanel;
    private JPanel unterPanelNorth;
    private JPanel unterPanelSouth;
    private JTextField text2; //grafische Elemente
    private JLabel text;
    private JButton button1, button2, button3;
    int counter = 1;
    int multiply = 5;



    public RechnerFenster(String titel) {

        super(titel); // Konstruktor von JFrame
        hauptPanel = new JPanel(); //Neues Panel wird erzeugt
        unterPanelNorth = new JPanel(); //Neues Panel wird erzeugt
        unterPanelSouth = new JPanel(); //Neues Panel wird erzeugt

        unterPanelNorth.setLayout(new GridLayout(1,2)); //Unterpanel layout wird auf Grid gesetzt
        unterPanelSouth.setLayout(new GridLayout(1,2)); //Unterpanel layout wird auf Grid gesetzt

        hauptPanel.setLayout(new BorderLayout()); // Hauptpanel wird auf Borderlayout gesetzt

        //Unterpanels bekommen eine Border
        unterPanelNorth.setBorder(BorderFactory.createLineBorder(Color.black));
        unterPanelSouth.setBorder(BorderFactory.createLineBorder(Color.black));

        text = new JLabel("Pressed " + counter + " times");
        text2 = new JTextField("");


        button1 = new JButton("add 1");
        button2 = new JButton("close");
        button3 = new JButton("reset counter to zero");

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        hauptPanel.add(unterPanelNorth, BorderLayout.NORTH);
        hauptPanel.add(unterPanelSouth, BorderLayout.SOUTH);

        unterPanelNorth.add(text); //Label wird dem Panel zugeordnet
        unterPanelNorth.add(text2); //Textfeld wird dem Panel zugeordnet

        unterPanelSouth.add(button1); //Button wird dem Panel zugeordnet
        unterPanelSouth.add(button3); //Button wird dem Panel zugeordnet
        unterPanelSouth.add(button2); //Button wird dem Panel zugeordnet


        this.add(hauptPanel); // Panel wird dem Fenster zugeordnet

        this.setSize(500, 500);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent a) {


        if(a.getSource() == this.button1) {
            counter++;
            this.text.setText("Pressed " + counter + " times");
            this.text2.setText(counter + " * " + multiply + " = " + counter*multiply);
        }

        if(a.getSource() == this.button3) {
            counter = 0;
            this.text.setText("Pressed " + counter + " times");
            this.text2.setText(counter + " * " + multiply + " = " + counter*multiply);
        }


        if (a.getSource() == this.button2) {
            System.exit(0);

        }

    }
}
