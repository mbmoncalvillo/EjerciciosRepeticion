package main;

public class Fibonacci {

	public static void main(String[] args) {
		
		ObtenerFibonacci(10);
	}
	public static void ObtenerFibonacci(int numero)
	{
		System.out.print("0 1 ");
		// 0 1 1 2 3 5 8
		int uno=0;
		int dos=1;
		for (int contador=1; contador <=numero;contador++)
		{
			int siguiente=obtenerSiguiente(uno,dos);
			uno=dos;
			dos=siguiente;
			System.out.print(siguiente+" ");
			
		}
			
	}
	public static int obtenerSiguiente(int uno,int dos)
	{
			return uno+dos;
	
	}

}
