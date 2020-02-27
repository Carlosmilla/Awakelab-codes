package ProyectoG2;

import java.util.Date;
import java.util.Scanner;

public class Guanaco extends Carro{
	public static Scanner data = new Scanner (System.in);
	
	protected Integer iRangoDeTiro;
	protected String sColor;
	
	public Guanaco() {
		super();
		agregarParametros();
	}
	
	public Guanaco(Integer iRangoDeTiro, String sColor) {
		super();
		this.iRangoDeTiro = iRangoDeTiro;
		this.sColor = sColor;
	}
	
	public Guanaco(Integer iCantidadOcupantes, Integer iFila, Integer iColumna, Date dFechaIngreso) {
		super(iCantidadOcupantes, iFila, iColumna, dFechaIngreso);
		// TODO Auto-generated constructor stub
	}

	public Integer getiRangoDeTiro() {
		return iRangoDeTiro;
	}

	public void setiRangoDeTiro(Integer iRangoDeTiro) {
		this.iRangoDeTiro = iRangoDeTiro;
	}

	public String getsColor() {
		return sColor;
	}

	public void setsColor(String sColor) {
		this.sColor = sColor;
	}

	public void agregarParametros() {
		System.out.println("Ingrese Rango de Tiro");
		this.iRangoDeTiro= data.nextInt();
		System.out.println("Ingrese Color del Guanaco");
		this.sColor= data.nextLine();
	}
	
	

} 
