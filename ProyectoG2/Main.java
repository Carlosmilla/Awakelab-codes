package ProyectoG2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner data = new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean bCondicion = true;
		boolean bCondicion2 = true;
		Integer iColumnaHuevo = null;
		Integer iFilaHuevo = null;
		
		ArrayList <Carro> arrCarro = new ArrayList<Carro>();
		
//		for (int i=1; i<=3; i++) {
//			Carro oCarroMicro = new Micro();		
//				int iFilaRandomMicro = (int) (Math.random()*12)+0;
//				int iColumnaRandomMicro = (int) (Math.random()*14)+0;
//				arrCarro.add(oCarroMicro);
//		}
		
//		for (int i=1; i<=5; i++) {
//			Carro oCarroGuanaco = new Guanaco();
//			int iFilaRandomGuanaco = (int)(Math.random()*14)+0;
//			int iColumnaRandomGuanaco = (int)(Math.random()*13)+0;
//			arrCarro.add(oCarroGuanaco);
//		}
//		
//		for (int i=1; i<=10; i++) {
//			Carro oCarroPatrulla = new Patrulla();
//			int iFilaRandomPatrulla = (int)(Math.random()*14)+0;
//			int iColumnaRandomPatrulla = (int)(Math.random()*14)+0;
//			arrCarro.add(oCarroPatrulla);
//		}
		
		Tablero tablero = new Tablero();
		
		tablero.matrizTablero();
		
		do {
			do {
			System.out.println("Ingrese fila");
			iFilaHuevo = data.nextInt();
			if(iFilaHuevo<0 || iFilaHuevo>14) {
				bCondicion = false;
			} else {
				bCondicion = true;
			}
		} while (!bCondicion);
		bCondicion = false;
        do {
        	System.out.println("Ingrese Columna");
        	iColumnaHuevo = data.nextInt();
        	if (iColumnaHuevo<0 || iColumnaHuevo>14) {
        		bCondicion = false;
        	} else {
        		bCondicion = true;
        	}
        } while (!bCondicion);
        	
        tablero.calcularPuntaje(iFilaHuevo, iColumnaHuevo);
       
        System.out.println("Desea continuar? (1) SI");
        int iOpcion = data.nextInt();
        if (iOpcion != 1) {
        	bCondicion2 = false;
        }
        
	   } while (bCondicion2);
	
	System.out.println("GAME OVER");

}
}

