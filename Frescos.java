package Herencia2;

public class Frescos extends Empresa{
	private String Fechaenvasado;
	private String Paisorigen;
	
	public Frescos(String Fechacaducidad, int Numerolote, String Fechaenvasado, String Paisorigen) {
		super (Fechacaducidad, Numerolote);
		this.Fechaenvasado = Fechaenvasado;
		this.Paisorigen = Paisorigen;
	}

	public Frescos() {
		// TODO Auto-generated constructor stub
	}

	public String getFechaenvasado() {
		return Fechaenvasado;
	}

	public void setFechaenvasado(String fechaenvasado) {
		Fechaenvasado = fechaenvasado;
	}

	public String getPaisorigen() {
		return Paisorigen;
	}

	public void setPaisorigen(String paisorigen) {
		Paisorigen = paisorigen;
	}
	public void mostrarDatos2() {
		System.out.println("LOS DATOS DEL PRODUCTO FRESCO SON:  \nFecha de Caducidad: "+getFechacaducidad()+
				"\nNumero de Lote:  "+getNumerolote()+
				"\nFecha de Envasado: "+Fechaenvasado+
				"\nPais de origen: "+Paisorigen);
	}
	
}
