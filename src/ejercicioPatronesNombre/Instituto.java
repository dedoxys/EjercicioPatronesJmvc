package ejercicioPatronesNombre;


public class Instituto extends CentroEstudios{
	
	private boolean tieneGradoSuperior;
	private boolean tieneGradoMedio;
	
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
