package ejercicio8;

public class Asignatura {

	
	/*
	 * 8. Crear la clase Asignatura, con los siguientes atributos:
		a. numAlumnos: aleatorio entre 15 y 30, ambos inclusive.
		b. nombre: se pasa por argumento.
		c. mediaAlumnos: número medio de alumnos que hay por clase.
		Observar que algunos de los atributos deben ser static. Posiblemente necesites
		más atributos static que el que pide el enunciado.
	 */
	
	private  byte numAlumnos;
	private String nombre;
	private static float mediaAlumnos;
	private static short cont;
	private static short total;
	
	
	public Asignatura(String nombre) {
		
		this.nombre=nombre;
		numAlumnos = (byte)(15+(Math.random()*16));
		cont++;
		total+=numAlumnos;
		mediaAlumnos = (float) (total/cont)+((float)(total%cont)/cont);
		
	}
	
	public void mostrar() {
		
		System.out.println("Nombre asignatura: "+nombre+" Número de Alumnos: "+numAlumnos+" Media de alumnos: "+mediaAlumnos);
		
	}
	
	public static void main(String[] args) {

		
		Asignatura a1 = new Asignatura("Matemáticas");
		a1.mostrar();
		Asignatura a2 = new Asignatura("Música");
		a2.mostrar();
		Asignatura a3 = new Asignatura("Inglés");
		a3.mostrar();
		Asignatura a4 = new Asignatura("Historia");
		a4.mostrar();
		Asignatura a5 = new Asignatura("Lengua");
		a5.mostrar();
		
		System.out.println("----------------------");
		
		a1.mostrar();
		a2.mostrar();
		a3.mostrar();
		a4.mostrar();
		a5.mostrar();
		
	}

}
