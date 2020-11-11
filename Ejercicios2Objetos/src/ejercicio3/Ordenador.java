package ejercicio3;

public class Ordenador {
	
	String oS, fabricante;
	int ram;
	static int ramValue[] = {8,16,32,64};
	
	public Ordenador(String oS, String fabricante) {
		
		this.oS=oS;
		this.fabricante=fabricante;
		ram= ramValue[((int)(Math.random()*4))];
		//Siento ponerte esto asi pero no se me ha ocurrido otra forma, salvo meter algun que otro if para filtrar 
		//valores que no quiero
	}
	
	public Ordenador( String fabricante) {
		oS = "Windows";
		this.fabricante=fabricante;
		//otra forma de hacerlo diferente por si la otra no fuese valida ya que uso un recurso que no se ha explicado aún
		int aux = ((int)(Math.random()*4));
		
			switch(aux){
			
			case 0:
				ram = 8;
				break;
			case 1:
				ram = 16;
				break;
			case 2:
				ram = 32;
				break;
			case 3:
				ram = 64;
				break;
			
			}
		
		
		
	}

	public void mostrar() {
		
		System.out.println("Sistema Operativo: "+oS+" Fabricante: "+fabricante+" RAM:"+ram+" GB");
	}
	
	
	public static void main(String[] args) {

		Ordenador ord1 = new Ordenador("Dell");
		Ordenador ord2 = new Ordenador("Intel");
		Ordenador ord3 = new Ordenador("Linux","Toshiba");
		Ordenador ord4 = new Ordenador("Mackintos","Apple");
		
		ord1.mostrar();
		ord2.mostrar();
		ord3.mostrar();
		ord4.mostrar();

	}

	
	
}
