package Herencia1;

public class Persona {

	private String Nombre;
	private String Apellido;
	private int Edad;
	
	public Persona(String nombre, String apellido, int edad) {
		Nombre = nombre;
		Apellido = apellido;
		Edad = edad;
	}

	public String getNombre() {
		return Nombre;
	}


	public String getApellido() {
		return Apellido;
	}

	public int getEdad() {
		return Edad;
	}

	
}
