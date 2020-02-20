package Arraylist;

import java.util.*;

public class Main {
	static ArrayList <Paises> infor = new ArrayList<Paises>();
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		
		int opcion;
		
		
		System.out.println("Ingrese la cantidad de paises que desea registrar: ");
		int cantpais = Integer.parseInt(data.nextLine()); // USA ESTA LINEA PARA QUE NO SE REPLIQUEN
		
		for (int i=0;i<cantpais;i++) {
			infor.add(new Paises()); // ASIGNA EL ESPACIO EN EL OBJETO PAISES
			System.out.println("\nIngrese el pais en la posicion: "+(i));
			infor.get(i).setPais(data.nextLine()); // USA ESTA LINEA PA SCANEAR EN UN ARRAYLIST
			System.out.println("\nIngrese la capital del pais "+(i));
			infor.get(i).setCapital(data.nextLine());
			
		}
		do { 
			
		System.out.println("Que desea hacer?");
		System.out.println("\n1. Ver datos");
		System.out.println("\n2. Mostrar un dato en especifico");
		System.out.println("\n3. Modificar un dato");
		System.out.println("\n4. Eliminar un dato");
		System.out.println("\n5. Salir");
		opcion = Integer.parseInt(data.nextLine());
		
		switch (opcion) {
		case 1: 
	        for (int i=0; i<cantpais; i++) {
	        	System.out.println("Los datos son: ");
			    System.out.println(infor.get(i).toString()); // LLAMA EL METODO PA MOSTRAR LOS DATOS /*
		    }
	        break;
		case 2:
		    for (int i=0; i<cantpais; i++) {
			    System.out.println("\nIngrese la posicion del elemento que desea ver: "
					    + "\n(La maxima posicion que puede solicitar es: "+(cantpais-1)+")");
			    int solicitud = Integer.parseInt(data.nextLine());
			    System.out.println(infor.get(solicitud).infoSeleccionada());
		    }
		    break;
		case 3:
	        for (int i=0; i<cantpais; i++) {
	    	    System.out.println("Que elemento (posicion) desea modificar: "
	    	    		+ "\n(La maxima posicion que puede modificar es: "+(cantpais-1)+")");
	    	    int mod = Integer.parseInt(data.nextLine());
	    	    System.out.println(infor.get(mod).infoSeleccionada());
	    	    System.out.println("\nIngrese el nuevo Pais: ");
	    	    infor.get(mod).setPais(data.nextLine());	
	        	System.out.println("\nIngrese la nueva Capital: ");
	    	    infor.get(mod).setCapital(data.nextLine());
	       }
    	    for (int i=0; i<cantpais; i++) {
    	    System.out.println("\nLos datos ahora son: ");
	        System.out.println(infor.get(i).toString());
    	   }
	        break;
	     case 4:
	    	for (int i=0; i<cantpais; i++) {
	    		System.out.println("\nQue elemento (posicion) desea eliminar: "
	    	    		+ "\n(La maxima posicion que puede eliminar es: "+(cantpais-1)+")");
	    	    int elim = Integer.parseInt(data.nextLine());
	    	    System.out.println("\nSe eliminara: ");
	    	    System.out.println(infor.get(elim).infoSeleccionada());
	    	    infor.remove(elim);
	    	}
	    	for (int i=0; i<cantpais; i++) {
	    	System.out.println("\nLos datos ahora son: ");
    	    System.out.println(infor.get(i).toString());
	    	}
	    	break;
	     case 5: 
	    	 System.exit(1);
	    	 break;
	    }
	} while (opcion != 5);

}
}
