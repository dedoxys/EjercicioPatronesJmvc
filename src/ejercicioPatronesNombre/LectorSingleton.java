package ejercicioPatronesNombre;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LectorSingleton {

	public ArrayList<String> leerFichero(String ruta) {

		try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
			String line;
			while ((line = br.readLine()) != null) {
				// process the line.
			}
		} catch (Exception e) {
			System.err.println(e);
		}

		return null;
	}

}
