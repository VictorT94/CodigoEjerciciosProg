package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*  Preguntarle al usuario si desea ver un número par o impar. Volver a realizarle la
			pregunta si no responde correctamente. Mostrarle un entero aleatorio entre 0 y 20
			que cumpla dicha condición. 
		 */
		
		boolean valido = false;
		
		Scanner sc = new Scanner(System.in);
		
		do{
		
		System.out.println("Desea ver un número par (p) o impar (i).");
		String res = sc.next();
		
		//Pongo ignoreCase porque me da igual que escriban en mayuscula o minuscula, entiendo que es una respuesta correcta.
		
		if(res.equalsIgnoreCase("p")) {
			
			//He excluido tanto el 0 como el 20 (al considerar que "entre ellos" no les incluye)
			valido = true;
			int var = (int) ((Math.random()*9)+1);
			
			System.out.println("Numero par: "+(var*2));
			
		}else if(res.equalsIgnoreCase("i")) {

			valido = true;
			int var = (int) (Math.random()*10);
			
			System.out.println("Numero impar: "+((var*2)+1));
			
		}
		
		
		}while(!valido);
		
		sc.close();
		
	}

}
