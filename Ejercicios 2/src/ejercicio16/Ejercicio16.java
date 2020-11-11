package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		/*
		 * 	16. Pedirle números enteros al usuario, hasta que usuario haya escrito 0. Cada vez que
			usuario haya escrito un número, se muestra el total de todos los escritos hasta
			entonces. 
		 */
		
		int num=0, aux;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Introduzca un numero ENTERO (0 para salir):");
			aux = sc.nextInt();
			
			num = num+aux;
			

			System.out.println("Total:"+num);
			
		}while(aux!=0);

		sc.close();
	}

}
