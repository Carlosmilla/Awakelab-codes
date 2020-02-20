package Herencia2;

public class Empresa {
	private String Fechacaducidad;
	private int Numerolote;
	
	public Empresa(String fechacaducidad, int numerolote) {
		super();
		Fechacaducidad = fechacaducidad;
		Numerolote = numerolote;
	}

	public Empresa() {
		// TODO Auto-generated constructor stub
	}

	public String getFechacaducidad() {
		return Fechacaducidad;
	}

	public void setFechacaducidad(String fechacaducidad) {
		Fechacaducidad = fechacaducidad;
	}

	public int getNumerolote() {
		return Numerolote;
	}

	public void setNumerolote(int numerolote) {
		Numerolote = numerolote;
	}
	
	

}
