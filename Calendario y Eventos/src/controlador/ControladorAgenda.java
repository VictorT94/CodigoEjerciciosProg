package controlador;

import java.util.ArrayList;

import modelo.LeerAgenda;
import vista.VistaAgenda;

public class ControladorAgenda {
	
	
	private VistaAgenda vistaAgenda;
	private ArrayList<String> agendaRaw;
	
	public ControladorAgenda() {
		
		agendaRaw = new ArrayList<>();
		
		
	}
	
	
	public void iniciarAgenda() {
		
		vistaAgenda = new VistaAgenda();
		
		LeerAgenda.cargarAgenda(agendaRaw);
		
	}
	
	public void mostrarVistaAgenda() {
		
		vistaAgenda.setVisible(true);
		
	}
	
	public void mostrarListaAgenda() {
		
		for (String string : agendaRaw) {
			System.out.println(string);
			String var[]= string.split("\t");

			for (String string2 : var) {
				System.out.println(string2);
			}
			
		}
		
		
	}
	
	

}
