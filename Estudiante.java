package Herencia1;

public class Estudiante extends Persona {

	private int Codigoestudiante;
	private float Notafinal;
	
	public Estudiante (String Nombre,String Apellido,int Edad, int Codigoestudiante,float Notafinal) {
		super(Nombre, Apellido, Edad);
		this.Codigoestudiante = Codigoestudiante;
		this.Notafinal = Notafinal;
	}
	
	public void mostrarDatos() {
		System.out.println("Su nombre: "+getNombre()+
		" \nSu Apellido: "+getApellido()+
		"\nSu Edad: "+getEdad()+
		"\nSu Codigo de Estudiante: "+Codigoestudiante+
		"\nSu Nota Final: "+Notafinal);
	}
		
	
	
}
