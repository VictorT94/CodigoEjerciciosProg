package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeerAgenda {
	
	private static File file = new File("./src/archivo.mio");
	
	
	
	
	
	
	public static void cargarAgenda(ArrayList<String> agendaRaw) {

		ArrayList<String> arrayList = agendaRaw;
		String var = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			while((var = br.readLine())!=null) {
				arrayList.add(var);
			}

			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	

}
