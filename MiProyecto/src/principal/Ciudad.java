package principal;

public class Ciudad {
	
	private Recurso[] recursos;
	
	public Ciudad(){
		crearRecursos();
		
		for (Recurso recurso : recursos) {
			System.out.println(recurso.toString());
		}
		System.out.println();
		
		
	}
	
	private void cargarRecursos() {
		
		
		
		
	}
	
	/** Provisional para pruebas **/
	private void crearRecursos() {
		
		
		Recurso grano = new Grano(0, 0);
		Recurso carne = new Carne(0, 0);
		Recurso madera = new Madera(0, 0);
		

		recursos = new Recurso[]{grano, carne, madera};
		
	}
}
