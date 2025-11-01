package principal;

import java.util.Scanner;

public class EjemploUsoUtilBasico {

	public static void main(String[] args) {
	
		double miNumeroDouble;
		System.out.println("Introduce un número (puede llevar decimales (Ejemplo 5.3)):");
		miNumeroDouble=Util.leerDouble();
		
		char letra;
		System.out.println("Introduce un carácter");
		letra=Util.leerChar();
		
		int miNumeroEntero;
		System.out.println("Introduce un número sin decimales");
		miNumeroEntero=Util.leerInt();
		
		String texto;
		System.out.println("Introduce un texto");
		texto=Util.introducirCadena();
		
	}

}
