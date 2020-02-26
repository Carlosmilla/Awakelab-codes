package ProyectoGrupal;

public class Guanaco extends Carro {

	protected Double dRangoDeTiro;
	protected String sColor;
	
	public Guanaco () {}

	public Guanaco(Double dRangoDeTiro, String sColor) {
		super();
		this.dRangoDeTiro = dRangoDeTiro;
		this.sColor = sColor;
	}

	public Guanaco(Integer iOcupantes, String sfechaDeIngreso, Integer iFila, Integer iColumna, Double dRangoDeTiro, String sColor) {
		super(iOcupantes, sfechaDeIngreso, iFila, iColumna);
		this.dRangoDeTiro = dRangoDeTiro;
		this.sColor = sColor;
	
	}

	public Double getdRangoDeTiro() {
		return dRangoDeTiro;
	}

	public void setdRangoDeTiro(Double dRangoDeTiro) {
		this.dRangoDeTiro = dRangoDeTiro;
	}

	public String getsColor() {
		return sColor;
	}

	public void setsColor(String sColor) {
		this.sColor = sColor;
	}
	
	
}
