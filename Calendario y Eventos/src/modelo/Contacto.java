package modelo;

public class Contacto {
	
	
	private String nombre, ciudad, grupo;
	private int telefonoFijo, telefonoMovil;
	
	public Contacto(String nombre,String ciudad, String grupo, int fijo, int movil ) {
		
		this.nombre=nombre;
		this.ciudad=ciudad;
		this.grupo=grupo;
		telefonoFijo = fijo;
		telefonoMovil = movil;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(int telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public int getTelefonoMovil() {
		return telefonoMovil;
	}

	public void setTelefonoMovil(int telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}
	

	
	
}
