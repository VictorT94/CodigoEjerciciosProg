package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

	/*	12. Preguntarle al usuario un número par entero entre 2 y 80000, ambos inclusive. Repetir
		la pregunta hasta que haya dado la respuesta correcta. Mostrarla. Mostrar también el
		número que sea la primera cifra distinta de cero del anterior, y los resultados de
		multiplicar sucesivamente por 4 dicho número 5 veces.
	*/
		
		Scanner sc = new Scanner(System.in);
		int num;
				
		do {
			
			System.out.println("Introduzca número par entero entre 2 y 80000, ambos inclusive: ");
			num = sc.nextInt();			
			
		}while((num>80000)||(num<2));
		
		System.out.println("Ha introducido "+num);

		int aux = 10000;
		
		while((num/aux)==0) {

			aux/=10;
		}
		
		num = num/aux;

		System.out.print(num);
		
		for(int i=0;i<5;i++) {
			num*=4;
			System.out.print("\t"+num);
		}
		
		sc.close();
	}
}
