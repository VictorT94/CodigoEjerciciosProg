package ejercicio5;

public class Autobus {

	/*
	 * 5. Crear la clase Autobús, con los siguientes atributos:
		a. numLínea: aleatorio entre 1 y 100, ambos inclusive.
		b. matrícula: se pasa por argumento.
		c. numAutobuses: número de objetos que se han creado de la clase Autobús
		Observar que el atributo numAutobuses es static.
	 */
	
	public static int numAutobuses=0;
	private byte numLinea =0;
	private String matricula;
	
	public Autobus(String matricula) {
		
		this.matricula = matricula;
		numLinea = (byte)((Math.random()*99)+1);
		numAutobuses++;
	}
	
	public void mostrar() {
		System.out.println("Numero de linea: "+numLinea+" Matricula: "+matricula+" Numero de Autobuses; "+numAutobuses);
	}
	
	public static void main(String[] args) {

		
		Autobus autobus1 = new Autobus("731213d");
		autobus1.mostrar();
		Autobus autobus2 = new Autobus("318237c");
		autobus2.mostrar();
		Autobus autobus3 = new Autobus("731092f");
		autobus3.mostrar();
		Autobus autobus4 = new Autobus("381273p");
		autobus4.mostrar();
		System.out.println("-----------------");
		autobus1.mostrar();
		autobus2.mostrar();
		autobus3.mostrar();
		autobus4.mostrar();

	}

}
