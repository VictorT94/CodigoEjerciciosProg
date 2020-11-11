package ejercicio1;

public class Pelicula {

	
	int duracion;
	String director, titulo;
	
	public Pelicula(String titulo, String director, int duracion) {
		
		this.titulo= titulo;
		this.director= director;
		this.duracion= duracion;
	}
	
	
	
	
	public void mostrar() {
		
		System.out.println("Título: "+titulo+". Duración: "+duracion+" minutos. Director: "+director);
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Pelicula esdla = new Pelicula("Señor de los Anillos","Petter Jackson",194);
		Pelicula matrix = new Pelicula("Matrix","Hermanas Wachwski",150);
		esdla.mostrar();
		matrix.mostrar();

	}

}
