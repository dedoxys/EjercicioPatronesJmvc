package ejercicioPatronesJmvc;

import java.util.ArrayList;

public class CentroEstudiosFactoria {
			
	public static CentroEstudios crearCentroEstudios(String opcion,String _nombre, String _localidad, int _anyoFundacion, ArrayList<Persona> _alumnos) {
		
		if (opcion.equalsIgnoreCase("universidad")) {
			return new Universidad(_nombre,_localidad, _anyoFundacion, _alumnos);
		}else if(opcion.equalsIgnoreCase("instituto")) {
			return new Instituto(_nombre,_localidad, _anyoFundacion, _alumnos);
		}
		
		return null;
	}

}
