package main;
import java.util.Scanner;
public class TiendaDeFrutas {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int clientes, contador=1, platano=0, platanoTotal=0, cajaPlatano=0, cajaPlatanoTotal=0, manzana=0, manzanaTotal=0, cajaManzana=0, cajaManzanaTotal=0, naranja=0, naranjaTotal=0, cajaNaranja=0, cajaNaranjaTotal=0, totalFruta=0, ultCliente=0;
	String nombre, mejorCliente="";
	
	System.out.println("Introduce la cantidad de clientes que van a registrarse");
	clientes = sc.nextInt();
	//CANTIDAD DE PERSONAS A REGISTRARSE, NO PUEDE SER MENOR O IGUAL A 0
	while(clientes<=0) {
		System.out.println("Los clientes no pueden ser negativos o iguales a 0. \nIntroduce otra cantidad");
		clientes = sc.nextInt();
	}
	//BUCLE HASTA QUE SE REGISTREN TODAS LAS PERSONAS
	while(clientes>=contador) {
		System.out.println("\nIntroduce tu nombre");
		nombre = sc.next();
		System.out.println("Bienvenido " + nombre + ".");
		
		//----PLATANOS----//
		System.out.println("¿Cuántos plátanos quieres pedir?");
		platano = sc.nextInt();
		while(platano<0) {
			System.out.println("La cantidad no puede ser negativa. Introduce la cantidad que desea pedir");
			platano = sc.nextInt();
		}
		totalFruta+=platano;
		//CADA CAJA DE PLATANOS ES DE 25
		while(platano>=25) {
			cajaPlatano++;
			platano-=25;
		}
		//----MANZANAS----//
		System.out.println("¿Cuántos manzanas quieres pedir?");
		manzana = sc.nextInt();
		while(platano<0) {
			System.out.println("La cantidad no puede ser negativa. Introduce la cantidad que desea pedir");
			manzana = sc.nextInt();
		}
		totalFruta+=manzana;
		//CADA CAJA DE MANZANAS ES DE 20
		while(manzana>=20) {
			cajaManzana++;
			manzana-=20;
		}
		//----NARANJAS----/-/
		System.out.println("¿Cuántos naranjas quieres pedir?");
		naranja = sc.nextInt();
		while(naranja<0) {
			System.out.println("La cantidad no puede ser negativa. Introduce la cantidad que desea pedir");
			naranja = sc.nextInt();
		}
		totalFruta+=naranja;
		//CADA CAJA DE NARANJAS SON DE 30
		while(naranja>=30) {
			cajaNaranja++;
			naranja-=30;
		}
		//VERIFICAR SI EL CLIENTE ACTUAL HA COMPRADO MAS FRUTA QUE EL ANTERIOR QUE MAS HABIA COMOPRADO
		if(totalFruta>ultCliente) {
			ultCliente=totalFruta;
			mejorCliente=nombre;
		}
		//SUMAR LA CANTIDAD DE CAJAS DE CADA TIPO Y FRUTAS SUELTAS DE CADA TIPO DE TODOS LOS CLIENTES EN CONJUNTO
		cajaPlatanoTotal+=cajaPlatano;
		cajaManzanaTotal+=cajaManzana;
		cajaNaranjaTotal+=cajaNaranja;
		platanoTotal+=platano;
		manzanaTotal+=manzana;
		naranjaTotal+=naranja;
		
		System.out.println("Cliente " + nombre);
		System.out.println("La cantidad de cajas de plátanos son " + cajaPlatano + " y sueltos " + platano);
		System.out.println("La cantidad de cajas de manzanas son " + cajaManzana + " y sueltos " + manzana);
		System.out.println("La cantidad de cajas de naranaja son " + cajaNaranja + " y sueltos " + naranja);
		//REINICIAR LAS VARIABLES DE CAJAS Y FRUTAS SUELTAS PARA EL SIGUIENTE CLIENTE
		cajaPlatano=0;
		cajaManzana=0;
		cajaNaranja=0;
		platano=0;
		manzana=0;
		naranja=0;
		totalFruta=0;
		
		contador++;
	}
	
	System.out.println("\nLa cantidad de cajas de plátanos son " + cajaPlatanoTotal + " y sueltos " + platanoTotal);
	System.out.println("La cantidad de cajas de manzanas son " + cajaManzanaTotal + " y sueltos " + manzanaTotal);
	System.out.println("La cantidad de cajas de naranaja son " + cajaNaranjaTotal + " y sueltos " + naranjaTotal);
	System.out.println("El mejor cliente es " + mejorCliente);
	
	sc.close();
}

}