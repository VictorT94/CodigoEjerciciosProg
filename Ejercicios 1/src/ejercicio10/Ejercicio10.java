package ejercicio10;

public class Ejercicio10 {

	public static void main(String[] args) {

		/* 10. El siguiente comando le otorga un número aleatorio entre 1 y
		12, ambos inclusive, a x:
		
 		int max = 12, min = 1;
 		int x = (int) (min + (Math.random () * (max – min + 1) ) );
 		
 		Tras calcular el valor, mostrar el mensaje, empleando switch case,
		de cual es el mes que ha salido. Por ejemplo, 1 -> “Enero”, 2 ->
		“Febrero”, etc.
		
		*/

		
		int max = 12, min = 1;
 		int x = (int) (min + (Math.random () * (max-min + 1) ) );
		
 		switch(x) {
 			case 1:
 				System.out.println("Enero");
 				break;
 			case 2:
 	 			System.out.println("Febrero");
 	 			break;
 			case 3:
 	 			System.out.println("Marzo");
 	 			break;
 			case 4:
 	 			System.out.println("Abril");
 	 			break;
 			case 5:
 	 			System.out.println("Mayo");
 	 			break;
 			case 6:
 	 			System.out.println("Junio");
 	 			break;
 			case 7:
 	 			System.out.println("Julio");
 	 			break;
 			case 8:
 	 			System.out.println("Agosto");
 	 			break;
 			case 9:
 	 			System.out.println("Septiembre");
 	 			break;
 			case 10:
 	 			System.out.println("Octubre");
 	 			break;
 			case 11:
 	 			System.out.println("Noviembre");
 	 			break;
 			case 12:
 	 			System.out.println("Diciembre");
 	 			break;
 			default:
 				System.out.println("Algo ha salido mal");
 		}
		
	}

}
