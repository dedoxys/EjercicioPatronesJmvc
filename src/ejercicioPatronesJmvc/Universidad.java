package ejercicioPatronesJmvc;

import java.util.ArrayList;

public class Universidad extends CentroEstudios {

	private boolean regalaMaster;

	public Universidad() throws InterruptedException {
		super();

	}

	public Universidad(String _nombre, String _localidad, int _anyoFundacion, ArrayList<Persona> _alumnos) {
		super(_nombre, _localidad, _anyoFundacion, _alumnos);
	}

	public boolean isRegalaMaster() {
		return this.regalaMaster;
	}

	public void setRegalaMaster(boolean _regalaMaster) {
		this.regalaMaster = _regalaMaster;
	}

}
