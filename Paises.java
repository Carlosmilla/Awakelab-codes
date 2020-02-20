package Arraylist;

public class Paises {

	public String Pais;
	public String Capital;

	
	public Paises(String pais, String capital) {
		super();
		this.Pais = pais;
		this.Capital = capital;
	}
	
	public Paises () {	
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public String getCapital() {
		return Capital;
	}

	public void setCapital(String capital) {
		Capital = capital;
	}

	
//	public void mostrarInfo() {
//		System.out.println("Los datos ingresados son: \n"
//				+ "Pais: "+this.Pais+
//				"\nCapital: "+this.Capital);
//	}
	
    public String toString() {
    	return   "\nPais: "+this.Pais+
				"\nCapital: "+this.Capital;
    }
	
    public String infoSeleccionada() {
    	return "\nEl pais en esa posicion es: "+this.Pais+
    			"\nSu capital es: "+this.Capital;
//    }
//    public static Paises[] removerElemento(Paises[] infor, int i) {
//    	System.arraycopy(infor, i+1, Pais,i, infor.length - 1 - i);
//    	return infor;
//    }
    
}
}
