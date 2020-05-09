package DeTodo;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String oracion = "La lluvia en Sevilla es una maravilla";
		int cont = 0;
		
		for (int i=0; i<oracion.length(); i++) {
			if (oracion.charAt(i) == 'a' || oracion.charAt(i) == 'e' || oracion.charAt(i) == 'i' || oracion.charAt(i) == 'o' || oracion.charAt(i) == 'u') {
				cont++;
			}
			System.out.println("La cantidad de vocales en la oracion son: "+cont);
		}

	}

}
