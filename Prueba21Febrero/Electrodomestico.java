package Prueba21Febrero;

import java.util.Scanner;

public class Electrodomestico {
	public static Scanner data = new Scanner(System.in);
	
	public Double dPrecioBase;
	public String sColor;
    public char cConsumoElectrico;
	public double dPeso;

	public final static String colorBase = "blanco";
	public final static char consumoBase = 'F';
	public final static double precioBase = 100.000;
	public final static double pesoBase = 5;
	
	public Electrodomestico() { 
	}
	
	public Electrodomestico(Double dPrecioBase, double dPeso) {
		super();
		this.dPrecioBase = dPrecioBase;
		this.dPeso = dPeso;
	}
	
	public Electrodomestico(Double dPrecioBase, String sColor, char cConsumoElectrico, double dPeso) {
		super();
		this.dPrecioBase = dPrecioBase;
		this.sColor = sColor;
		this.cConsumoElectrico = cConsumoElectrico;
		this.dPeso = dPeso;
	}

	public Double getdPrecioBase() {
		return dPrecioBase;
	}

	public void setdPrecioBase(Double dPrecioBase) {
		this.dPrecioBase = dPrecioBase;
	}

	public String getsColor() {
		return sColor;
	}

	public void setsColor(String sColor) {
		this.sColor = sColor;
	}

	public char getcConsumoElectrico() {
		return cConsumoElectrico;
	}

	public void setcConsumoElectrico(char cConsumoElectrico) {
		this.cConsumoElectrico = cConsumoElectrico;
	}

	public double getdPeso() {
		return dPeso;
	}

	public void setdPeso(double dPeso) {
		this.dPeso = dPeso;
	}

	public char comprobarConsumoEnergetico(char Letra) {
		char arrConsumoE[] = {'A', 'B', 'C', 'D', 'E'};
		boolean bCorrecto = false;
		try {
			for (int i=0; i<arrConsumoE.length; i++) {
				if (Character.toUpperCase(cConsumoElectrico) == arrConsumoE[i]) {
					bCorrecto = true;
					break;
				}
			}
			if (!bCorrecto) {
				return consumoBase;
			} else { 
				return Character.toUpperCase(cConsumoElectrico);
			}
	} catch (Exception e) {
		return consumoBase;
	}
}
	
	public void comprobarColor() {
		
		String arrColor[] = {"Blanco", "Azul", "Rojo", "Negro", "Gris"};
		boolean bEsta = false;
		
		try {
		for (int i=0; i<arrColor.length; i++) {
			
			if (arrColor[i].equalsIgnoreCase(sColor)) {
				bEsta = true;
				System.out.println("Color ingresado es valido");
			} if (bEsta) {
				this.sColor = sColor;
			} else {
				System.out.println("Su color no es reconocido, se le asignara uno por defecto");
				this.sColor = colorBase;
			}
		}
	} catch (Exception e) {
		this.sColor = colorBase;
	}
	}
	
	public double precioFinal() {
		double dSuma = 0;
		double dTotal = 0;
		switch (cConsumoElectrico) {
		case 'A':
			dSuma = dSuma + 100.000;
		case 'B':
			dSuma = dSuma + 80.000;
		case 'C':
			dSuma = dSuma + 60.000;
		case 'D':
			dSuma = dSuma + 50.000;
		case 'E':
			dSuma = dSuma + 30.000;
		case 'F':
			dSuma = dSuma + 10.000;
		} if (dPeso > 0 && dPeso<=19) {
			dTotal = dSuma + 10.000;
		} else if (dPeso > 19 && dPeso<=49) {
			dTotal = dSuma + 50.000;
		} else if (dPeso > 49 && dPeso<=79) {
		    dTotal = dSuma + 80.000;
		} else if (dPeso > 80) {
			dTotal = dSuma + 100.000;
		}
		return dPrecioBase+dTotal;
	}
		
}
	
	
	
	
	
		

	

	
	

