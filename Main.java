package Herencia2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner data = new Scanner (System.in);
		// TODO Auto-generated method stub
		Empresa empresa = new Empresa();
		Frescos frescos = new Frescos();
		Congelados congelados = new Congelados();
		Refrigerados refrigerados = new Refrigerados();
		
		boolean salir = false;
		int opcion;
		
		
		while (!salir) {
			System.out.println("BIENVENIDO AL SISTEMA DE REGISTRO DE PRODUCTOS");
			System.out.println("*****************************************************");
			System.out.println("SELECCIONE EL TIPO DE PRODUCTO QUE DESEA REGISTRAR: ");
			System.out.println("*****************************************************");
			System.out.println("1. Producto Fresco");
			System.out.println("2. Producto Refrigerado");
			System.out.println("3. Producto Congelado");
			System.out.println("3. Salir");
			System.out.println("*****************************************************");
			System.out.println("");
			opcion = data.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("USTED SELECCIONO PRODUCTOS FRESCOS");
				System.out.println("*****************************************************");
				System.out.println("Ingrese la fecha de caducidad: ");
				String fechac = data.next();
				System.out.println("Ingrese el numero de Lote: ");
				int numl = data.nextInt();
				System.out.println("Ingrese la fecha de envasado: ");
				String fechae = data.next();
				System.out.println("Pais de origen : ");
				String pais = data.next();
				System.out.println("*****************************************************");
				System.out.println("");
				
				frescos.setFechacaducidad(fechac);
				frescos.setNumerolote(numl);
				frescos.setFechaenvasado(fechae);
				frescos.setPaisorigen(pais);
				
				System.out.println("Los datos ingresados son: \n");
				frescos.mostrarDatos2();
				System.out.println("*****************************************************");
				System.out.println("");
				break;
				
			case 2: 
				System.out.println("USTED SELECCIONO PRODUCTOS REFRIGERADOS");
				System.out.println("*****************************************************");
				System.out.println("Ingrese la fecha de caducidad: ");
				fechac = data.next();
				System.out.println("Ingrese el numero de Lote: ");
				numl = data.nextInt();
				System.out.println("Ingrese el Codigo de la Organizacion: ");
				int Codo = data.nextInt();
				System.out.println("*****************************************************");
				System.out.println("");
				
				refrigerados.setFechacaducidad(fechac);
				refrigerados.setNumerolote(numl);
				refrigerados.setCodorganismo(Codo);
				
				System.out.println("Los datos ingresados son: \n");
				refrigerados.mostrarDatos3();
				System.out.println("*****************************************************");
				System.out.println("");
				break;
			
			case 3: 
				System.out.println("USTED SELECCIONO PRODUCTOS CONGELADOS");
				System.out.println("*****************************************************");
				System.out.println("Ingrese la fecha de caducidad: ");
				fechac = data.next();
				System.out.println("Ingrese el numero de Lote: ");
				numl = data.nextInt();
				System.out.println("Ingrese la Temperatura recomendada en grados celcius: ");
				int tempr = data.nextInt();
				System.out.println("*****************************************************");
				System.out.println("");
				
				congelados.setFechacaducidad(fechac);
				congelados.setNumerolote(numl);
				congelados.setTemprecomendada(tempr);
				
				System.out.println("Los datos ingresados son: \n");
				congelados.mostrarDatos();
				System.out.println("*****************************************************");
				System.out.println("");
				break;
			
			case 4: 
				System.exit(0);
				break;
			}
			
		}
		
	}

}
