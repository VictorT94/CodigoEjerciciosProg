package vista;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VistaAgenda extends JFrame{
	
	private JScrollPane scrollPanel;
	private JTable tablaContactos;
	private JButton jButtonGuardar, jButtonVolver;
	private JPanel panelButton;
	
	public VistaAgenda() {
		
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setName("Agenda");
		this.setResizable(false);
		
		createComponents();
		addComponents();
		
		
	}
	
	private void createComponents() {
		
		tablaContactos = new JTable();
		
		scrollPanel = new JScrollPane(tablaContactos);
		
		jButtonGuardar = new JButton("Guardar");
		
		jButtonVolver = new JButton("Volver");
		
		panelButton = new JPanel();
	}
	
	private void addComponents() {
		
		panelButton.add(jButtonVolver);
		panelButton.add(jButtonGuardar);
		
		this.getContentPane().setLayout(new FlowLayout());
		this.add(panelButton);
		this.add(scrollPanel);
		
	}
	
}
