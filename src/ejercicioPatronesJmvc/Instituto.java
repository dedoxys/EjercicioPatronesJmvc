package ejercicioPatronesJmvc;

import java.util.ArrayList;

public class Instituto extends CentroEstudios{
	
	
	private boolean tieneGradoSuperior;
	private boolean tieneGradoMedio;
	
	public Instituto() throws InterruptedException {
		super();
	}
	
	public Instituto(String _nombre, String _localidad, int _anyoFundacion, ArrayList<Persona> _alumnos) {
		super(_nombre, _localidad, _anyoFundacion, _alumnos);
	}
	public boolean isTieneGradoSuperior() {
		return this.tieneGradoSuperior;
	}
	public void setTieneGradoSuperior(boolean _tieneGradoSuperior) {
		this.tieneGradoSuperior = _tieneGradoSuperior;
	}
	
	public boolean isTieneGradoMedio() {
		return this.tieneGradoMedio;
	}
	public void setTieneGradoMedio(boolean _tieneGradoMedio) {
		this.tieneGradoMedio = _tieneGradoMedio;
	}
	
}
