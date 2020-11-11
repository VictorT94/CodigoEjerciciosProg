package ejercicio2;

import java.util.Scanner;

public class Alumno {

	int prog, marcas, sistemas;
	
	public Alumno() {
		
		prog =(int) (Math.random()*11);
		marcas=(int) (Math.random()*11);
		sistemas= 20;
		
	}
	
	
	public void mostrar() {
		
		System.out.print("P: ");
		if(prog==20)
			System.out.print("No Calificado");
		else
			System.out.print(prog);
		
		System.out.print(" SI: ");
		if(sistemas==20)
			System.out.print("No Calificado");
		else
			System.out.print(sistemas);
		
		System.out.print(" LM: ");
		if(marcas==20)
			System.out.print("No Calificado");
		else
			System.out.print(marcas);
		
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {

		
		Alumno al1 = new Alumno();
		al1.mostrar();
		Alumno al2 = new Alumno();
		al2.mostrar();
		Alumno al3 = new Alumno();
		al3.mostrar();
		Alumno al4 = new Alumno();
		al4.mostrar();
	}

}
