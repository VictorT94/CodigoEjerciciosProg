package ejercicio13;

public class Ejercicio13 {

	public static void main(String[] args) {

		/* 	Calcular, 20 veces, un aleatorio entero entre -2 y 2. Cada vez, calcular 100 partido por
			dicho aleatorio y mostrar el resultado. Emplear try catch para no realizar nunca la
			división por cero. En dicho caso, mostrar un mensaje “División por 0”. 
		*/

		int num;
		
		for(int i=0;i<20;i++) {
			
			num = ((int)(Math.random()*5)-2);
			
			try {
				num = 100/num;

				System.out.println(num);
			}catch (ArithmeticException e) {
				System.out.println("División por 0");
			}
			
			
		}
		
		
		
	}

}
