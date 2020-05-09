package Ciclos;

import java.util.Scanner;

public class Ejercicio6 {
    private static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		
		int iNum;
		
		do {
			System.out.println("Ingrese un numero mayor o igual que 0");
			iNum = scan.nextInt();
		} while (iNum<=0);
		
		System.out.println(+iNum);

	}

}
