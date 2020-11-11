package prueba1;

public class Prueba1 {
	
	public static void main(String args[]) {
		
		int x=5, y=0, suma;
		suma =x+y;
		System.out.println("Valores: "+x+" + "+y+" = "+suma);
		
		x = x+5;
		
		System.out.println("Valor x ="+x);
		
		x = x+1;	
		
		System.out.println("Valor x = "+x);
		
		x++;
		
		System.out.println("Valor x = "+x);
		
		x-=5; 
		
		System.out.println("Valor x = "+x);
		
		x*=2;
		
		System.out.println("Valor x = "+x);
		
		x/=7; 
		
		System.out.println("Valor x = "+x);
		
		short s = 10, t = 3;
		
		short resto, division;
		
		division =(short)(s/t);
		resto = (short) (s%t);
		
		System.out.println("Division = "+division);
		System.out.println("Resto = "+resto);
		
		
	}
	
}
