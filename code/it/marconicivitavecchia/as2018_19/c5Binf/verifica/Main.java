
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 Passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(600,400);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder();
		
		
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<html>");
		sb.append("<h1>Formula 1 passion</h1>");
		sb.append("<div style='display:table-row'>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("<div style='display:table'>");
		
		
		// TODO Convertire lo StringBuilder in String
		
		
		// TODO Assegnare correttamente la stringa create a JLabel
		
		super.add(new JLabel(__TODO__));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

