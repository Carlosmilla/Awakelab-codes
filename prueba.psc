Algoritmo sin_titulo
	definir opcion3 Como Entero
	escribir "Menu de Funciones"
	escribir ""
	escribir "     1.  Secuencial"
	escribir "     2.  Condicional Si entonces"
	escribir "     3.  Condicional Si entonces anidado"
	escribir "     4.  Condicional Segun"
	escribir "     5.  Repetitiva Mientras"
	escribir "     6.  Repetitiva Repetir"
	escribir "     7.  Repetitiva Para"
	escribir "     8.  Arreglo Simple"
	escribir "     9.  Arreglo Bidimensional"
	escribir "     10. Salir"
	escribir ""
	escribir "selecione una opcion del 1 al 10"
	leer op
	limpiar pantalla
	
	segun op hacer
		1: 
			escribir "ingrese primer numero"
			leer n1
			escribir "ingrese segundo numero"
			leer n2
			escribir "ingrese tercer numero"
			leer n3
			Limpiar Pantalla
			prom<-(n1+n2+n3)/3
			escribir "el promedio es: ",prom, ""
			
		2:  escribir "ingrese su nombre"
			leer nombre
			escribir "ingrese su genero: 1 para masculino y 2 para femenino"
			leer genero
			si genero<>1 o genero<>2 entonces
				escribir "genero ingresado no valido"
			FinSi
			si genero=1 entonces
				escribir ,nombre, " usted ira al servicio de hombres"
				sino 
					escribir ,nombre, " usted ira al servicio de damas"
				FinSi
				
		3:  escribir "ingrese su nombre"
			leer nombre
			escribir "ingrese su genero: 1 para masculino y 2 para femenino"
			leer genero
			si genero<>1 y genero<>2 entonces
				escribir "genero ingresado no es valido"
			FinSi
			escribir "seleccione servicio que desea utilizar: 1 banio o 2 ducha"
			leer opb
			si opb<>1 y opb<>2 Entonces
				Escribir "opcion ingresada no es valida"
			FinSi
			si genero=1 y opb=1 Entonces
				escribir ,nombre," usted debe pagar $250 e ira al servicio de hombres"
				si genero=1 y opb=2 Entonces
					Escribir ,nombre, " debe pagar $2500 e ira al servicio de duchas masculinas"
					si genero=2 y opb=1 entonces
						escribir ,nombre," usted debe pagar $250 e ira al servicio de damas"
						si genero=2 y opb=2 Entonces
							escribir ,nombre," usted debe pagar $2500 e ira al servicio de duchas femeninas"
						FinSi
					FinSi
				FinSi
			FinSi
			
		4: escribir "ingrese un numero del 1 al 10"
			leer num
			si num<1 y num>10 entonces 
				escribir "numero ingresado no es valido"
			FinSi
			segun num hacer
				1: escribir "el numero ingresado es uno"
				2: escribir "el numero ingresado es dos"
				3: escribir "el numero ingresado es tres"
				4: escribir "el numero ingresado es cuatro"
				5: escribir "el numero ingresado es cinco"
				6: escribir "el numero ingresado es seis"
				7: escribir "el numero ingresado es siete"
				8: escribir "el numero ingresado es ocho"
				9: escribir "el numero ingresado es nueve"
				10: escribir "el numero ingresado es diez"
			FinSegun
			
		5:  definir n Como Entero
			escribir "ingrese un numero" 
			leer n
			aux=0
			suma=0
			mientras n<>0 hacer
				escribir "ingrese otro numero"
				leer n
				aux=aux+1
				suma=suma+n
			FinMientras
			prom=suma/aux
			escribir "los cantidad de numeros ingresados diferentes de cero son: ",aux, "" 
			escribir "el promedio de los numeros es: ",prom, ""
		6: definir nom Como Caracter 
 			Repetir
				escribir "ingrese nombre con J"
				leer nom
				aux=aux+1
			Hasta Que nom="Juan" o nom="juan" o nom="JUAN"
			escribir "ganaste"
			Escribir "cantidad de intentos: ",aux, ""
			
		7:  definir nombres Como Caracter
			definir aux como entero
			aux<-10-1
			dimension nombres[10]
			para i<-1 hasta 10 con paso 1 hacer 
				Escribir "ingrese su nombre"
				leer nombre
				nombres[i]<-nombre
			FinPara
			para i<-1 hasta 10-1 con paso 1 hacer
				si nombres[i]=nombres[aux] entonces
					aux<-i
			    finsi
			FinPara
			escribir "los nombres que se repiten son: ", nombres[aux], ""
			
			
		8:  escribir "ingrese la cantidad de talentos digitales a considerar"
			leer n
			dimension talentos[n]
			para i<-1 hasta n con paso 1 hacer
				escribir "ingrese nombre del TD ",[i], ""
				leer TD
				talentos[i]<-TD
			FinPara
			para i<-1 hasta n con paso 1 hacer
				escribir "los nombres son: ",talentos[i], ""
			FinPara
			
		9:  escribir "ingrese total de los alumnos"
			leer total
			dimension alumno[5,total]
			para i<-1 hasta 5 con paso 1 Hacer
				para j<-1 hasta total con paso 1 Hacer
					
				FinPara
			FinPara
	FinSegun
FinAlgoritmo
