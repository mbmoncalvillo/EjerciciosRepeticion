package principal;
import java.util.Scanner;
public class Ejercicio13 {

	/*
	13.	Escribe el códigonecesarioparaintroducirporteclado 17 nombres y sus 17 notas (enterosentre 1 y 10) y unavezintroducidos, 
	nosvisualiceunmenúrepetitivoconlassiguientesopciones:
		1.	Visualizarnombres y susnotas.
		2.	Visualizarsólo el nombredelapersonacon mayor nota.
		3.	Visualizarla media delasnotas.
		4.	Visualizar el númerodevecesqueunnúmeropedidoportecladoapareceenlalista. (Cuántos 8's p.e.)
		5.	Introducidounnombre, quenosmuestresunota. (Controlarmensajede error)
		6.	Introducirnuevasnotas a quienqueramos: Nosapareceránlosnombresuno a uno y nosdarálaopcióndecambiarlanota a esapersona.
		7.	Clasificarde mayor a menor y mostrarporpantalla el listadodelosnombres y lasnotasordenados.
		8.	Salir
	*/
	public static void main(String[] args) {
		//Declaraciones	
		int opc, suma, nota, veces, encontrado, inter;
		String nombre, interNombre;
		String[] nombres = new String[17];
		char respuesta;
		int[] notas = new int[17];
		
		Scanner sc= new Scanner(System.in);
		
		//Introducimoslosdatos
		for (int i =0; i<nombres.length; i++) {
			//Nombres
			System.out.println("Introduce el nombre de la alumna: ");
			nombres[i] =  sc.next();
			//Nota
			System.out.println("Introduce la nota de la alumna");
			notas[i] =  sc.nextInt();
		}
		
		//Repetirhastaquesemarquelaopcióndesalir
		do {
			//Visualizamos el menu
			System.out.println("\n\n*********************MENU*******************************************");
			System.out.println("1. Visualizar nombres y sus notas.");
			System.out.println("2. Visualizar sólo el nombre de la persona con mayor nota.");
			System.out.println("3. Visualizar la media de las notas.");
			System.out.println("4. Visualizar el número de veces que un número pedido por teclado aparece en la lista.");
			System.out.println("5. Introducido un nombre, que nos muestre su nota. (Controlar mensaje de error)");
			System.out.println("6. Introducir nuevas notas a quien queramos: Nos aparecerán los nombres uno a uno y nos dará la opción de cambiar la nota a esa persona.");
			System.out.println("7. Clasificar de mayor a menor y mostrar por pantalla el listado de los nombres y las notas ordenados.");
			System.out.println("8. Salir");
			
			System.out.println("\nIntroduce una de las opciones anteriores (un número):");
			opc=sc.nextInt();
			
			//Operaciones
			switch (opc) {
			case 1:
				visualizarNotasAlumnas(nombres, notas);
				break;
			case 2:
				visualizaAlumnaMayorNota(nombres, notas);
				break;
			case 3:
				System.out.println("\n************* NOTA MEDIA DE LAS ALUMNAS ************************");
				suma=0;
				for(int i=0;i<notas.length;i++) {
					suma+=notas[i];
				}
				System.out.printf("\n La nota media es: %.2f ", (float)suma/notas.length);
				break;
			case 4:
				System.out.println("\n************* NUMERO DE VECES QUE APARECE UNA NOTA ************************");
				System.out.println("Introduce la nota que quieres buscar: ");
				nota=sc.nextInt();
				veces = 0;
				
				//Buscolanotaconunbuclefor-each
				for (int not: notas) {
					if (not==nota) {
						veces++;
					}
				}
				System.out.printf("\n La nota %d aparece %d veces", nota, veces);
				break;
			case 5:
				System.out.println("\n************* CONSULTAR LA NOTA DE UNA ALUMNA ************************");
				System.out.println("Introduce el nombre de la alumna: ");
				nombre=sc.next();
				
				//Buscoennombreen el array
				encontrado = -1;
				for(int i=0;i<nombres.length;i++) {
					if (nombres[i].equalsIgnoreCase(nombre)) {
						encontrado = i;
						break;
					}
				}
				
				//Comprobamossilo ha encontrado
				if (encontrado!=-1)
					System.out.println("La nota de " + nombre + " es " + notas[encontrado]);
				else
					System.out.println("No se ha encontrado la alumna");
				break;
			case 6:
				System.out.println("\n************* CAMBIAR LAS NOTAS DE LAS ALUMNAS ************************");
				
				//Recorremoslasalumnas
				for (int i =0; i<nombres.length; i++) {
					//Nombres
					System.out.println("La alumna " + nombres[i] + " tiene una nota de " + notas[i]);
					System.out.println("¿Quieres cambiar su nota? (S/N)");
					respuesta= sc.next().charAt(0);
					if (respuesta=='S') {
						//Nota
						System.out.println("Introduce la nota de la alumna");
						notas[i] =  sc.nextInt();
					}
				}
				break;
			case 7:
				//Ordenamospor el métododelaburbuja
				for(int i=0; i<notas.length; i++) {
					for(int j =i+1; j<notas.length; j++) {
						if (notas[j]>notas[i]) {
							//Intercambiamoslasnotasparaordenarlas
							inter = notas[j];
							notas[j] = notas[i];
							notas[i] = inter;
							//Intercambiamoslosnombres
							interNombre = nombres[j];
							nombres[j] = nombres[i];
							nombres[i] = interNombre;
						}
					}
				}
				
				System.out.println("***********LISTADO DE NOTAS Y ALUMNAS ORDENADOS DE MAYOR A MENOR***************");
				for(int i=0;i<notas.length;i++) {
					System.out.println("La alumna "+ nombres[i]+ " tiene una nota de "+ notas[i]);
				}
				break;
			case 8:
				System.out.println("AGUR");
				break;
			default:
				System.out.println("La opción introducida no es válida");
				break;
			}
		}while (opc!=8);
		

	}

	public static void visualizaAlumnaMayorNota(String[] nombres, int[] notas) {
		//
		//Declaraciones
		int mayor, indiceMayor;
		
		System.out.println("\n************* ALUMNA CON MAYOR NOTA ************************");
		//
		mayor = -1;
		indiceMayor = -1;
		for(int i=0;i<notas.length;i++) {
			//Siencuentrounanota mayor laguardo
			if (notas[i] >mayor) {
				mayor = notas[i];
				indiceMayor = i;
			}
		}
		System.out.println("La alumna con la nota superior es: " + nombres[indiceMayor]);
		
	}

	public static void visualizarNotasAlumnas(String[] nombres, int[] notas) {
		//VisualizarNotas y Nombras
		System.out.println("\n************* NOTAS DE LAS ALUMNAS ************************");
		for(int i=0;i<nombres.length;i++) {
			System.out.printf("\n La alumna %s tiene una nota de %d ", nombres[i], notas[i]);
		}	
	}
}
