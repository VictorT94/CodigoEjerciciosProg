package ejercicio14Mal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio14Mal {

	public static void main(String[] args) {

	/*	Crear tres variables enteras, una de valor 100 y las otras las especifica el usuario.
		Mostrar los 3 valores y la media de las tres. 
	*/	
		
		int var1=100, var2=0, var3;
		Scanner sc = new Scanner(System.in);
		boolean valido=true;
		int i=0;
		do {
			System.out.println("Introduzca un número ENTERO");
			
				
				if(i==0) {
					
					try{
					System.out.println("Entra");
					var2 = sc.nextInt();
					i++;
					
					}catch(InputMismatchException e) {
						
						System.out.println("No era un número entero, vas a tener que repetir");
						var2=0;
						System.out.println(var2);
						
					}
				}else if(i==1){
					
					var3 = sc.nextInt();
					i++;
					
					}
					
			
			System.out.println(i);
			
			
		}while(i!=2);

		
		
		
	}

}
