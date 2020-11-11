package ejercicio9;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		
		/* 9. El siguiente comando le otorga un número aleatorio entre 0 y
		1000, ambos inclusive, a x:
	
 		int max = 1000;
 		int x = (int) (Math.random () * (max + 1) );
 	
		Tras calcular el valor, mostrar el mensaje “x es grande” si es
		mayor que 500, “x es mediano” si x es menor o igual que 500 y es mayor
		o igual que 200, o “x es pequeño” si x es menor que 200.
		
		*/
		
		int max = 1000;
 		int x = (int) (Math.random () * (max + 1) );
		
		if(x>500) {
			System.out.println(+x+" es Mayor ");
		}else if(x<200) {
			System.out.println(x+" es Menor ");
		}else {
			System.out.println(x+" es Mediano");
		}
		
		
	}

}
