package Prueba21Febrero;

public class Main1 {

	public static void main(String[] args) {
      Electrodomestico electrolista[] = new Electrodomestico[10]; 
      Television tele = new Television();
      Lavadora lava = new Lavadora();
      Electrodomestico electro = new Electrodomestico();
      
      double dTotalElectrodomesticos = 0;
      double dTotalLavadoras = 0;
      double dTotalTelevisiones = 0;
      
      double dPrecioPrueba = (int)(Math.random()*150000+1);
      double dPesoPrueba = (int)(Math.random()*100000+1);
      double dResolucionPrueba = (int)(Math.random()*80+1);
      int iCargaPrueba = (int) (Math.random()*60 + 1);
      
		
      electrolista[0] = new Electrodomestico(dPrecioPrueba, "Verde", 'B', dPesoPrueba);
      electrolista[1] = new Television(dPrecioPrueba, null, 'A', dPesoPrueba, dResolucionPrueba, true);
      electrolista[2] = new Lavadora(dPrecioPrueba, "negro", 'C', dPesoPrueba, iCargaPrueba);
      electrolista[3] = new Electrodomestico(dPrecioPrueba, "rojo", 'B', dPesoPrueba);
      electrolista[4] = new Television(dPrecioPrueba, null, 'A', dPesoPrueba, dResolucionPrueba, false);
      electrolista[5] = new Lavadora(dPrecioPrueba, "Blanco", 'C', dPesoPrueba, iCargaPrueba);
      electrolista[6] = new Electrodomestico(dPrecioPrueba, "gris", 'B', dPesoPrueba);
      electrolista[7] = new Television(dPrecioPrueba, "azul", 'A', dPesoPrueba, dResolucionPrueba, true);
      electrolista[8] = new Lavadora(dPrecioPrueba, "azul", 'C', dPesoPrueba, iCargaPrueba);
      electrolista[9] = new Lavadora(dPrecioPrueba, null, 'C', dPesoPrueba, iCargaPrueba);
      
      for (int i=0; i<electrolista.length; i++) {
    	  
    	  if (electrolista[i] instanceof Electrodomestico) {
    		  dTotalElectrodomesticos = dTotalElectrodomesticos + electrolista[i].precioFinal();
    	  } if (electrolista[i] instanceof Television) {
    		  dTotalTelevisiones = dTotalTelevisiones + electrolista[i].precioFinal();
    	  } if (electrolista[i] instanceof Lavadora) {
    		  dTotalLavadoras = dTotalLavadoras + electrolista[i].precioFinal();
    	  }
      }
      Double dValorFinal = dTotalElectrodomesticos+dTotalLavadoras+dTotalTelevisiones;
    	  
      System.out.println("*************************************************************************");
      System.out.println("\nEl precio total de los electrodomesticos es: $"+dTotalElectrodomesticos+"\n");
      System.out.println("\nEl precio total de los Televisores es: $"+dTotalTelevisiones+"\n");
      System.out.println("\nEl precio total de las Lavadoras es: $"+dTotalLavadoras+"\n");
      System.out.printf("\nEl valor total es: $%.0f",dValorFinal);
      System.out.println("\n");
      System.out.println("*************************************************************************");
	}


}