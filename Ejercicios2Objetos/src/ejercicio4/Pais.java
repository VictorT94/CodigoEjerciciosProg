package ejercicio4;

public class Pais {

	String capital;
	int poblacion;
	static String capitales[]= {"Buenos Aires", "Berlín", "Tokyo", "Roma"};

	public Pais(String capital) {
		this.capital = capital;
		poblacion = (int) (Math.random()*10)+1;
		
		
	}
	
	public Pais(int poblacion) {
		//Se puede hacer con un switch case tambien
		capital = capitales[(int)(Math.random()*4)];
		this.poblacion = poblacion;
	}
	
	public void mostrar() {
		
		System.out.println("Capital: "+capital+" Poblacion: "+poblacion);
		
	}
	
	public static void main(String[] args) {

		Pais pais1 = new Pais("Londres");
		Pais pais2 = new Pais("Moscu");
		Pais pais3 = new Pais(13);
		Pais pais4 = new Pais(6);
		
		pais1.mostrar();
		pais2.mostrar();
		pais3.mostrar();
		pais4.mostrar();
	}

}
