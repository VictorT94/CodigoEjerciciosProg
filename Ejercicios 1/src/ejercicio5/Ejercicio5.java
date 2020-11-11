package ejercicio5;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		short var1, var2, var3;
		
		
		var1= 30;
		var2= 10;
		var3= 20;
		
		
		if(var1<var2){
			
			if(var2<var3){
				
				System.out.println("La menor: "+var1);
				System.out.println("El mayor:"+var3);
			}
			else {
				
				if(var3<var1) {
					
				System.out.println("La menor: "+var3);
				System.out.println("La mayor: "+var2);
				
				}
				else {
					System.out.println("La menor: "+var1);
					System.out.println("La mayor: es "+var2);
				}
			}
		}
		else {
			
			if(var2<var3){
				System.out.println("La menor es: "+var2);
				if(var1<var3){
					System.out.println("La mayor es: "+var3);
				}
				else {
					System.out.println("La mayor: es "+var1);
				}
				
			}
			else {
				System.out.println("La menor es: "+var3);
				System.out.println("La mayor es: "+var1);
			}
		}
		
		
	}

}
