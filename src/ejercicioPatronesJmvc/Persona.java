package ejercicioPatronesJmvc;

public class Persona {

	private String nombre;
	private String apellidos;
	private int anyoNacimiento;
	private String ciudad;
	private int telefono;

	public Persona(PersonaBuilder personaBuilder) {
		
		this.nombre = personaBuilder.getNombre();
		this.apellidos = personaBuilder.getApellidos();
		this.anyoNacimiento = personaBuilder.getAnyoNacimiento();
		this.ciudad = personaBuilder.getCiudad();
		this.telefono = personaBuilder.getTelefono();
	
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public int getAnyoNacimiento() {
		return this.anyoNacimiento;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public int getTelefono() {
		return this.telefono;
	}

}
