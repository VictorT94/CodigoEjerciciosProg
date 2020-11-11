package ejercicio7;

public class Ejercicio7 {

	public static void main(String[] args) {
	/* 7. El siguiente comando le otorga un número aleatorio entre 0 y 3,
	ambos inclusive, a x: 
	
	int max = 3;
 	int x = (int) (Math.random () * (max + 1) );
 	
 	Mostrar el valor de la x. Recalcularla el número de veces necesaria
	hasta que x valga 3.*/

		
		
		int max = 3;
		int x;
		do {
			x = (int) (Math.random () * (max + 1) );
		
			System.out.println("Valor de x = "+x);
	 	
		}while(x!=3);
		
	}
	
	
	
}
