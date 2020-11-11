package ejercicio6;

public class Persona {
	
	/*
	 * 6. Crear la clase Persona, con los siguientes atributos:
		a. Altura: aleatorio entre 1.55 y 1.95, el primero inclusive, el segundo no.
		b. numPersonas: número de objetos que se han creado de la clase Persona.
		c. totalAlturas: la suma de todas las alturas de todos los objetos que se han
		creado de la clase Persona.
		Observar que los atributos numPersonas y totalAlturas son static
	 */
	
	private float altura ;
	private static short numPersonas;
	private static double totalAlturas=0; 
	
	
	public Persona() {
		
		altura = (float) (1.55+(Math.random()*0.4));
		numPersonas++;
		totalAlturas+=altura;
	}
	
	public void mostrar() {
		
		System.out.println("Altura de la persona: "+altura+" Numero de personas: "+numPersonas+" Total Alturas: "+totalAlturas);
		
	}
	

	public static void main(String[] args) {

		Persona p1 = new Persona();
		p1.mostrar();
		Persona p2 = new Persona();
		p2.mostrar();
		Persona p3 = new Persona();
		p3.mostrar();
		Persona p4 = new Persona();
		p4.mostrar();
		System.out.println("-----------------------");
		p1.mostrar();
		p2.mostrar();
		p3.mostrar();
		p4.mostrar();
		
	}

}
