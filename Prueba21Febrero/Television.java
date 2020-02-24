package Prueba21Febrero;

public class Television extends Electrodomestico {

	private double dResolucion;
	private boolean bSintonizadorTDT;
	
	static final double resolucionBase = 20;
	static final boolean sintonizadorBase = false;
	
	public Television() {}
	
	
	public Television(Double dPrecioBase, double dPeso) {
		super(dPrecioBase, dPeso);
		// TODO Auto-generated constructor stub
	}
	
	public Television(Double dPrecioBase, String sColor, char cConsumoElectrico, double dPeso, double dResolucion, boolean bSintonizadorTDT) {
		super(dPrecioBase, sColor, cConsumoElectrico, dPeso);
		this.dResolucion = dResolucion;
		this.bSintonizadorTDT = bSintonizadorTDT;
	}

	
	public double getdResolucion() {
		return dResolucion;
	}

	public void setdResolucion(double dResolucion) {
		this.dResolucion = dResolucion;
	}

	public boolean isbSintonizadorTDT() {
		return bSintonizadorTDT;
	}

	public void setbSintonizadorTDT(boolean bSintonizadorTDT) {
		this.bSintonizadorTDT = bSintonizadorTDT;
	}

	public double precioFinal() {
		double dPrecioTel = super.precioFinal();
		if (dResolucion > 40) {
			dPrecioTel = dPrecioTel*1.30;
//			System.out.println("\nLa Resolucion supera las 40 pulgadas, se le cobrara un 30% mas.\n");
		}
		if (bSintonizadorTDT) {
			dPrecioTel = dPrecioTel+50.000;
//			System.out.println("La television posee sintonizador tdt, se le sumaran 50.000 a la cuenta\n");
		}
//		System.out.println("El precio a pagar por el televisor es: "+dPrecioTel);
		return dPrecioTel;
	}
	

	
}
