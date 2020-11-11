package ejercicio7;

public class Aleatorios {
	
	
	/*
	 * 7. Crear la clase Aleatorios, con los siguientes atributos:
		a. aleatorio: aleatorio entre 10 y 20, ambos inclusive.
		b. total: total de los valores de los atributos aleatorio.
		c. contador: número de objetos de la clase Aleatorios.
		d. mediaAleatorios: valor medio del atributo aleatorio.
		Observar que algunos de los atributos deben ser static
	 */
	
	private byte aleatorio;
	private static int total;
	private static short contador;
	private static float mediaAleatorios;

	
	public Aleatorios() {
		
		aleatorio = (byte)(10+(Math.random()*11));
		total+=aleatorio;
		contador++;
		mediaAleatorios = (float) (total/contador)+((float)(total%contador)/contador);	
		
	}
	
	
	public void mostrar() {
		
		System.out.println("Numero aleatorio: "+aleatorio+" Total valores: "+total+" Contador aleatorios: "+contador+" Media aleatorios: "+mediaAleatorios);
		
	}
	
	
	public static void main(String[] args) {
		
		Aleatorios al1 = new Aleatorios();
		al1.mostrar();
		Aleatorios al2 = new Aleatorios();
		al2.mostrar();
		Aleatorios al3 = new Aleatorios();
		al3.mostrar();
		Aleatorios al4 = new Aleatorios();
		al4.mostrar();
		Aleatorios al5 = new Aleatorios();
		al5.mostrar();
		
		System.out.println("-----------");
		
		al1.mostrar();
		al2.mostrar();
		al3.mostrar();
		al4.mostrar();
		al5.mostrar();
		
	}

}
