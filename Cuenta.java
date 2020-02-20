package Trabajoenclase2;

public class Cuenta {

	private String titular;
	private int cantidad;
	private int infoop;
	public int resul; 
	
	Cuenta (String titular, int cantidad){
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	Cuenta(){	
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getTitular() {
		return titular;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setinfoop (int infoop) {
		this.infoop = infoop;
	}
	public int getInfoop() {
		return infoop;
	}
	public int getOpcion1() {
		if (infoop <= 0) {
			System.out.println("Valor ingresado no valido");
			System.out.println("Su estado de cuenta sigue siendo: ");
		} else {
		resul = cantidad+infoop;
		}
		return resul;
	}
	public int getOpcion2() {
		if (infoop>cantidad) {
			resul = 0;
		} else {
		resul = cantidad-infoop;
		}
		return resul;
	}
	public String toString() {
		return ("INFORMACION DE SU CUENTA \n Su nombre: " +titular+ "\n Su estado de cuenta: $"+cantidad);
	}

}




