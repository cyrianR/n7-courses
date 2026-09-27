package projetIDM.EUTinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfaceSwing extends JPanel {

	final private JButton bA = new JButton("Afficher csv");
	final private JButton bB = new JButton("Effectuer calcul");
	final private JButton bC = new JButton("Réfléchir");
	final private JButton bQ = new JButton("Quitter");
	
	public InterfaceSwing() {
		super();
		
		JFrame fenetre = newJFrame("Fenêtre");

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(bA);
		panel.add(bB);
		panel.add(bC);
		panel.add(bQ);
		
		fenetre.add(panel, BorderLayout.CENTER);
		fenetre.setBounds(100, 100, 500, 70);
		fenetre.setVisible(true);

		this.bQ.addActionListener(new ActionQuitter());

	}
	
	public class ActionQuitter implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			System.exit(0);
		}
	}

	public static JFrame newJFrame(String titre) {
		JFrame fenetre = new JFrame(titre);
		fenetre.pack();
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return fenetre;
	}

	public static void main(String[] args) {
		new InterfaceSwing();
		System.out.println("La fenêtre s'affiche !");
	}

}

