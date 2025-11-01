package main;

import java.util.Scanner;
import java.util.Random;

public class RandomSqrtBurbuja {
	public static void ordenaCrecienteConMetodoBurbuja(int[] ArrayAOrdenar) {
    	int contadorPrincipal, contadorSecundario, aux;
   	   	 
    	for (contadorPrincipal = 0; contadorPrincipal < ArrayAOrdenar.length - 1; contadorPrincipal++)
    	{
    		// Comparo cada elemento del array con  los que están a su derecha en el array
	   		// En la iteración 0 comparo con todos
	   		// En la iteración 1 comparto con todos -1, porque el último elemento YA está ordenado, es el MAYOR
	   		// En la iteración 2 comparto con todos -2, porque el último y el penúltimo elementos YA están ordenados
	       	 
	   		for (contadorSecundario = 0; contadorSecundario < ArrayAOrdenar.length - contadorPrincipal - 1; contadorSecundario++)
	   		{	   			
	   			if (ArrayAOrdenar[contadorSecundario + 1] < ArrayAOrdenar[contadorSecundario]) 
	            {
                	aux = ArrayAOrdenar[contadorSecundario + 1];
                	ArrayAOrdenar[contadorSecundario + 1] = ArrayAOrdenar[contadorSecundario];
                	ArrayAOrdenar[contadorSecundario] = aux;
               	 
	           	}
	        }
        	 
    	}
	}
	public static void ordenaDecrecienteConMetodoBurbuja(int[] ArrayAOrdenar) 
	{		
	    int contadorPrincipal, contadorSecundario, aux;
	    
	    for (contadorPrincipal = 0; contadorPrincipal < ArrayAOrdenar.length - 1; contadorPrincipal++) 
	    {
	        
	        for (contadorSecundario = 0; contadorSecundario < ArrayAOrdenar.length - contadorPrincipal - 1; contadorSecundario++) 
	        {
	            
	            // Cambiamos el signo: ahora queremos que los valores más grandes queden al principio
	            if (ArrayAOrdenar[contadorSecundario + 1] > ArrayAOrdenar[contadorSecundario])
	            {
	                aux = ArrayAOrdenar[contadorSecundario + 1];
	                ArrayAOrdenar[contadorSecundario + 1] = ArrayAOrdenar[contadorSecundario];
	                ArrayAOrdenar[contadorSecundario] = aux;
	            }
	        }
	    }
		

	}
	public static void main(String[] args) {
		Random generaAleatorio=new Random();
		int aleatorio=generaAleatorio.nextInt(3); // Genera uno de estos números: 0,1,2 
		System.out.println("primer aleatorio "+aleatorio);
		aleatorio=generaAleatorio.nextInt(3); // Genera uno de estos números: 0,1,2
		System.out.println("segundo aleatorio "+aleatorio);
		aleatorio=generaAleatorio.nextInt(3); // Genera uno de estos números: 0,1,2
		System.out.println("tercer aleatorio "+aleatorio);
		double dAleatorio=generaAleatorio.nextDouble(4);
		System.out.println("cuarto aleatorio "+dAleatorio);
		
		
		System.out.println("El numero pi vale "+Math.PI);
		System.out.println("La raiz cuadrada de 4 vale "+Math.sqrt(4));
		
		int[] arrayDeEnteros= {3,1,-1,5};
		ordenaCrecienteConMetodoBurbuja(arrayDeEnteros);
		
		System.out.println("Ordenado de forma creciente");
		for(int contador=0;contador<arrayDeEnteros.length;contador++)
			System.out.println(arrayDeEnteros[contador]);
		
		ordenaDecrecienteConMetodoBurbuja(arrayDeEnteros);
		System.out.println("Ordenado de forma creciente");
		for(int contador=0;contador<arrayDeEnteros.length;contador++)
			System.out.println(arrayDeEnteros[contador]);
		}

}
