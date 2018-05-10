package ejercicioPatronesNombre;

import java.util.ArrayList;

public class CentroEstudios {
	

	private String nombre;
	private String localidad;
	private int anyoFundacion;
	private ArrayList<Persona> alumnos;
	
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
