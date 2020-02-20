package Robots;

import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Robots implements Comparable<Robots> { // implementamos la funcion comparable para comparar los datos mas tarde
	ArrayList<Robots> arrRobots = new ArrayList<Robots>();
	
 private Integer iCantidadRobots;
 private Integer iPorcentajeDeVida;
 public Integer iNumeroRobots;

 
 public void Robots() {
	 
 }

public Integer getiCantidadRobots() {
	return iCantidadRobots;
}




public void setiCantidadRobots(Integer iCantidadRobots) {
	this.iCantidadRobots = iCantidadRobots;
}




public Integer getiPorcentajeDeVida() {
	return iPorcentajeDeVida;
}




public void setiPorcentajeDeVida(Integer iPorcentajeDeVida) {
	this.iPorcentajeDeVida = iPorcentajeDeVida;
}


public Integer getiNumeroRobots() {
	return iNumeroRobots;
}




public void setiNumeroRobots(Integer iNumeroRobots) {
	this.iNumeroRobots = iNumeroRobots;
}

public void ingresarRobot() {
	iNumeroRobots = (int) (Math.random()*6+5); // numero random entre 5 y 10
	System.out.println("Random"+iNumeroRobots);
	for (int i=0; i<iNumeroRobots; i++) {
		Robots robot = new Robots();
		iPorcentajeDeVida = (int) (Math.random()*100-1); // Asigancion de un valor random para la vida, se puede hacer con double igual
		
		robot.setiPorcentajeDeVida(iPorcentajeDeVida); // Seteamos el porcentaje de vida
		robot.setiNumeroRobots(i); // el numero de robot se asigna automatico con la i del for
		
		arrRobots.add(robot); // se le agrega la informacion al Arraylist 
	}
	for (int i = 0; i < arrRobots.size(); i++) {
			System.out.println("Numero de Robot:  "+arrRobots.get(i).getiNumeroRobots()+" , Porcentaje de Vida: " +arrRobots.get(i).getiPorcentajeDeVida()+"%");
	} // impresion de los datos 
		
	}
public void OrdenarArreglo() { // Metodo para ordenar el arreglo menor a mayor
	Collections.sort(arrRobots); // "sort" ordena automaticamente los datos en base al for en este caso
	for (int i = 0; i < arrRobots.size(); i++) {
		System.out.println("Numero de Robot:  "+arrRobots.get(i).getiNumeroRobots()+" , Porcentaje de Vida: " +arrRobots.get(i).getiPorcentajeDeVida()+"%");
	}

}

@Override
public int compareTo(Robots arg0) { // Metodo para comparar, este va ligado al collections.sort, idealmente por visual deberia ir antes del metodo que lo llama
	if (iPorcentajeDeVida < arg0.iPorcentajeDeVida) {
		return -1;
	} if (iPorcentajeDeVida > arg0.iPorcentajeDeVida) {
		return 1;
	}
	return 0;
}

public void mayor50DeVida() { // Metodo para mostrar los mayores a 50 de vida
	Collections.sort(arrRobots); // se usa collections.sort pero no llama al compareTo
	for (int i = 0; i < arrRobots.size(); i++) {
		if (arrRobots.get(i).getiPorcentajeDeVida() > 50) { // Condicion dada = si el porcentaje de vida de la posicion i es mayor a 50 se guarda
			System.out.println("Numero de Robot:  "+arrRobots.get(i).getiNumeroRobots()+" , Porcentaje de Vida: " +arrRobots.get(i).getiPorcentajeDeVida()+"%");
		}
		
	}
}
public void mayoresVidas() { // Metodo para mostrar los 3 con mas vida (solo funcional con el for previo
		Collections.sort(arrRobots); 
			int mayores = arrRobots.size(); // la variable mayores se le asigna todo el espacio del arreglo
			for (int i=1; i<=3; i++) { // pero se le limita hasta la posicion 3
				System.out.println("Numero de Robot:  "+arrRobots.get(mayores -i).getiNumeroRobots()+" , Porcentaje de Vida: " +arrRobots.get(mayores -i).getiPorcentajeDeVida()+"%");
			}// mayores -i establece que las muestras sean de 'abajo hacia arriba' tomando las mayores vidas 
   }					

}



