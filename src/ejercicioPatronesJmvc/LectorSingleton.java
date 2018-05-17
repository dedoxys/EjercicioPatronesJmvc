package ejercicioPatronesJmvc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class LectorSingleton {
	
	private static LectorSingleton instance;
	
	private LectorSingleton() {
		
	}
	
	public static LectorSingleton getInstance() throws InterruptedException {

		if (instance == null) {
			instance = new LectorSingleton();
		}

		return instance;
	}
	
	public ArrayList<String> leerFichero(String ruta) {
		
		ArrayList<String> fichero = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
			String line;
			while ((line = br.readLine()) != null) {
				fichero.add(line);
			}
		} catch (Exception e) {
			System.err.println(e);
		}

		return fichero;
	}

}
