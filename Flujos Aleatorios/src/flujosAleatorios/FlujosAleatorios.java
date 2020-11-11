package flujosAleatorios;

public class FlujosAleatorios {

	public static void main(String[] args) {

		
	int c;
	
	for(int i=0;i<4;i++) {
		
		System.out.print(i+"\t");
		
		
		
	}
	System.out.println();
		
	for(int i=0;i<7;i++) {
		System.out.println("Hola");
	
		
	}
		
	int max=20;
	int ale=0;
	
	while(!(ale>15)) {
		
		ale =(int)(Math.random()*(max+1));
		
		System.out.print(ale+" ");
	}
		
		
		
	}

}
