package ejercicio8;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		/*  8. El siguiente comando le otorga un número aleatorio entre 0 y
		100, ambos inclusive, a x:
		
 		int max = 100;
 		int x = (int) (Math.random () * (max + 1) );
 		
 		Mostrar el valor de la x. Recalcularla el número de veces necesaria
		hasta que x valga un valor menor que 5. Es decir, repetir el cálculo
		el número de veces necesarias mientras x no sea menor que 5, mientras
		que x sí sea mayor o igual que 5.
		
		 */
		
		int max=100;
		int x;
		
		do {
			
			x = (int) (Math.random () * (max + 1) );
			
			System.out.println("Valor de x: "+x);
			
			
		}while(x>=5);
		
		
		
	}
	
}
