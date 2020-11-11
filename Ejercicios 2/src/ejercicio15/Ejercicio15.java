package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*
		 *  Crear tres variables con decimales, cuyos valores los especifica el usuario. Mostrar el
		 *	mayor de los tres. 
		 */

		
		Scanner sc = new Scanner(System.in);
		
		double num1, num2, num3, mayor;
		
		
		System.out.println("Introduce un NUMERO: ");
		
		num1 = sc.nextDouble();
		
		System.out.println("Un segundo NUMERO: ");
		
		num2 = sc.nextDouble();
		if(num2>num1) {
			mayor=num2;
		}else {
			mayor=num1;
		}
		
		System.out.println("Un tercer NUMERO: ");
		
		num3 = sc.nextDouble();
		if(num3>mayor)
			mayor=num3;
		
		sc.close();
		
		System.out.println("El mayor de los 3 es: "+mayor);
		
		
	}

}
