package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		/*	Crear tres variables enteras, una de valor 100 y las otras las especifica el usuario.
		Mostrar los 3 valores y la media de las tres. 
	*/	
		
		int var1=100, var2, var3;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número ENTERO");
		
		var2 = sc.nextInt();
		
		System.out.println("Introduce otro número ENTERO");
		
		var3 = sc.nextInt();
		
		
		System.out.println("Tus valores dados son: "+var1+", "+var2+", "+var3);
		
		System.out.println("La media de los 3 valores es: "+(var1+var2+var3)/3);
		
		
	}

}
