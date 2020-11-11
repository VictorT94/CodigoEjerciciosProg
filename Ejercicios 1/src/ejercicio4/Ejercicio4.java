package ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {

		float var1, var2;
		
		var1= 392.578237f;
		var2= 509.371829f;
		
		if(var1<var2) {
			System.out.println("Numeros de menor a mayor "+var1+"\t"+var2);
			
		}else if(var1==var2){
			
			System.out.println("Numeros iguales :"+var1+"="+var2);
			
		}else{
		

			System.out.println("Numeros de menor a mayor "+var2+"\t"+var1);
		}
		
	}

}
