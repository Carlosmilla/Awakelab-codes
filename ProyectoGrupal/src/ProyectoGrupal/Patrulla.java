package ProyectoGrupal;
import java.util.*;
public class Patrulla {

	Scanner sc=new Scanner(System.in);
	String sNombre;
	Integer iArmadura; //entre 1 y 5
	
	
	
	public Patrulla() {
		super();
	}
	
	
	public Patrulla(String sNombre, Integer iArmadura) {
		super();
		this.sNombre = sNombre;
		this.iArmadura = iArmadura;
	}
	

	public void ingreseNombre() {
		System.out.printf("\nIngrese nombre: ");
		sNombre=sc.nextLine();
	
	}
	
	public void ingreseNivelArmadura() {
		
		boolean salir=false;
		do {
			System.out.printf("\nNivel de Armadura");
			iArmadura=sc.nextInt();
			if(iArmadura>0 && iArmadura<6) {
				salir=true;
			}else {
				System.out.printf("\n\"El nivel de armadura tiene que estar entre 1 y 5\"");
				salir=false;
			}
		}while(salir);
	}
	
	
}
