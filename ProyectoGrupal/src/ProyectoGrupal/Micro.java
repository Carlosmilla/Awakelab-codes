package ProyectoGrupal;


public class Micro extends Carro{
	private int iMicroAnhoFabricacion;
	private String sMicroMarca;
	
	public Micro() {
		
	}
	
	public Micro(int iMicroAnhoFabricacion, String sMicroMarca) {
		super();
		this.iMicroAnhoFabricacion = iMicroAnhoFabricacion;
		this.sMicroMarca = sMicroMarca;
	}
	
	

	public Micro(Integer iOcupantes, String sfechaDeIngreso, Integer iFila, Integer iColumna, int iMicroAnhoFabricacion, String sMicroMarca) {
		super(iOcupantes, sfechaDeIngreso, iFila, iColumna);
		this.iMicroAnhoFabricacion = iMicroAnhoFabricacion;
		this.sMicroMarca = sMicroMarca;
		// TODO Auto-generated constructor stub
	}



	public int getiMicroAnhoFabricacion() {
		return iMicroAnhoFabricacion;
	}

	public void setiMicroAnhoFabricacion(int iMicroAnhoFabricacion) {
		this.iMicroAnhoFabricacion = iMicroAnhoFabricacion;
	}

	public String getsMicroMarca() {
		return sMicroMarca;
	}

	public void setsMicroMarca(String sMicroMarca) {
		this.sMicroMarca = sMicroMarca;
	}
	
	

}
