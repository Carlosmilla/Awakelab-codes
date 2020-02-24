package Prueba21Febrero;

public class Lavadora extends Electrodomestico {

	private Integer iCarga;
	
	public final static Integer cargaBase = 5;
	
	public Lavadora() {}

	public Lavadora(Integer iCarga) {
		super();
		this.iCarga = iCarga;
	}

	public Lavadora(Double dPrecioBase, double dPeso) {
		super(dPrecioBase, dPeso);
		// TODO Auto-generated constructor stub
	}

	public Lavadora(Double dPrecioBase, String sColor, char cConsumoElectrico, double dPeso, Integer iCarga) {
		super(dPrecioBase, sColor, cConsumoElectrico, dPeso);
		this.iCarga = iCarga;
	}

	public Integer getiCarga() {
		return iCarga;
	}

	public void setiCarga(Integer iCarga) {
		this.iCarga = iCarga;
	}

	public double precioFinal() {
		double dPrecioLav = super.precioFinal();
		if (iCarga>30) {
//			System.out.println("\nLa carga de la Lavadora sobrepasa los 30kg, se le agregaran 50.000 al precio final.\n");
			dPrecioLav = dPrecioLav + 50.000;
//			System.out.println("El precio final de la Lavadora sera: "+dPrecioLav);
		}
		return (double) dPrecioLav;
	}
	
}
