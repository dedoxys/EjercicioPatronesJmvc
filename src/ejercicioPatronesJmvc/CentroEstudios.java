package ejercicioPatronesJmvc;

import java.util.ArrayList;

public class CentroEstudios {
	

	private String nombre;
	private String localidad;
	private int anyoFundacion;
	private ArrayList<Persona> alumnos;
	private LectorSingleton ls;
	
	public CentroEstudios() throws InterruptedException {
		
		this.ls = LectorSingleton.getInstance();
	}
	
	public CentroEstudios(String _nombre, String _localidad, int _anyoFundacion, ArrayList<Persona> _alumnos) {
		this.nombre = _nombre;
		this.localidad = _localidad;
		this.anyoFundacion = _anyoFundacion;
		this.alumnos = _alumnos;
	}
	
	public LectorSingleton getLs() {
		return this.ls;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String _nombre) {
		this.nombre = _nombre;
	}
	
	public String getLocalidad() {
		return this.localidad;
	}
	public void setLocalidad(String _localidad) {
		this.localidad = _localidad;
	}
	
	public int getAnyoFundacion() {
		return this.anyoFundacion;
	}
	public void setAnyoFundacion(int _anyoFundacion) {
		this.anyoFundacion = _anyoFundacion;
	}
	
	public ArrayList<Persona> getAlumnos() {
		return this.alumnos;
	}
	public void setAlumnos(ArrayList<Persona> _alumnos) {
		this.alumnos = _alumnos;
	}
	
	
}
