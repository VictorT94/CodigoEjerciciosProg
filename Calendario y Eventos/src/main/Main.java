package main;

import controlador.ControladorAgenda;
import vista.VistaAgenda;

public class Main {

	public static void main(String[] args) {

		ControladorAgenda cAgenda = new ControladorAgenda();
		
		cAgenda.iniciarAgenda();
		cAgenda.mostrarVistaAgenda();
		cAgenda.mostrarListaAgenda();
		
	}

}
