package Herencia2;

public class Refrigerados extends Empresa{
	private int Codorganismo;

	public Refrigerados(String fechacaducidad, int numerolote, int codorganismo) {
		super(fechacaducidad, numerolote);
		Codorganismo = codorganismo;
	}

	public Refrigerados() {
		// TODO Auto-generated constructor stub
	}

	public int getCodorganismo() {
		return Codorganismo;
	}

	public void setCodorganismo(int codorganismo) {
		Codorganismo = codorganismo;
	}
	
	public void mostrarDatos3() {
		System.out.println("LOS DATOS DEL PRODUCTO REFRIGERADO SON:  \nFecha de Caducidad: "+getFechacaducidad()+
				"\nNumero de Lote:  "+getNumerolote()+
				"\nEl Codigo del organismo de supervision es: "+Codorganismo);
	}

}
