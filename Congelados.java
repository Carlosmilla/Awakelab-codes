package Herencia2;

public class Congelados extends Empresa {
	private int Temprecomendada;
	
	public Congelados(String Fechacaducidad, int Numerolote, int Temprecomendad) {
		super (Fechacaducidad, Numerolote);
		this.Temprecomendada = Temprecomendada;
	}

	public Congelados() {
		// TODO Auto-generated constructor stub
	}

	public int getTemprecomendada() {
		return Temprecomendada;
	}

	public void setTemprecomendada(int temprecomendada) {
		Temprecomendada = temprecomendada;
	}
	

	public void mostrarDatos() {
		System.out.println("LOS DATOS DEL PRODUCTO CONGELADO SON:  \nFecha de Caducidad: "+getFechacaducidad()+
				"\nNumero de Lote:  "+getNumerolote()+
				"\nTemperatura Recomendada: "+Temprecomendada+ " Grados Celsius");
	}
	
}
