package main;

public class Ejercicio1 {

	public static void main(String[] args) {
		int personas;
		int dias=0;
		String actividad = null;
		// Pedir el número de personas
		do {
			System.out.println("Cuantas personas sois? ");
			personas = Util.leerInt();
			// Validar que el número es positivo y mayor que cero
			if (personas <= 0) {
				System.out.println("Introduce un número positivo mayor que cero.");
			}
			// Repetir mientras el número no sea válido
		} while (personas <= 0);
		
		do {
		System.out.println("Cuantos dias has utilizado? ");
		dias = Util.leerInt();
		if (dias<0 || dias>7) {
			System.out.println("Tiene que ser un numero de dias coerente a una semana");
		}
		}while (dias<0 || dias>7);
	
	int l=0;
		
		// Procesar cada persona
		double totalGrupo = 0;
		double max = 0;
		double totalCoche = 0, totalBus = 0, totalBici = 0, totalPlancha = 0, totalOrdenador = 0, totalMovil = 0, totalDucha = 0, totalTV = 0;
		// Bucle para cada persona
		for (int j = 1; j <= personas; j++) {
			for(l=1; l<=dias; l++) {
			System.out.println("\nPersona " + j);
			System.out.println("Dia " + l);
			double totalPersona = 0;
			int tipo;
			
			// Bucle para las actividades de cada persona
			do {
				System.out.println("Elige una opcion:\n"
						+ "1. Coche\n2. Autobus\n3. Bicicleta\n4. Plancha\n"
						+ "5. Ordenador\n6. Movil\n7. Ducha caliente\n8. Televisión\n9. FIN");
				tipo = Util.leerInt();
				double resultado = 0;
				// Procesar la opción elegida
				switch (tipo) {
					case 1:
						resultado = coche();
						totalPersona += resultado;
						totalCoche += resultado;
						break;
					case 2:
						resultado = bus();
						totalPersona += resultado;
						totalBus += resultado;
						break;
					case 3:
						resultado = bici();
						totalPersona += resultado;
						totalBici += resultado;
						break;
					case 4:
						resultado = plancha();
						totalPersona += resultado;
						totalPlancha += resultado;
						break;
					case 5:
						resultado = ordenador();
						totalPersona += resultado;
						totalOrdenador += resultado;
						break;
					case 6:
						resultado = movil();
						totalPersona += resultado;
						totalMovil += resultado;
						break;
					case 7:
						resultado = duchaCaliente();
						totalPersona += resultado;
						totalDucha += resultado;
						break;
					case 8:
						resultado = television();
						totalPersona += resultado;
						totalTV += resultado;
						break;
						// Nueva opción para mostrar la actividad que más contamina
						case 9:
						if(max < totalCoche) {
						max = totalCoche;
						 actividad="Coche";}
						else if(max< totalBus) {
						max= totalBus;
						 actividad="Bus";}
						else if(max< totalBici) {
						max= totalBici;
						actividad="Bici";}
						else if(max< totalPlancha) {
						max= totalPlancha;
						actividad="Plancha";}
						else if(max< totalMovil) {
						max = totalMovil;
						actividad="Movil";}
						else if(max< totalOrdenador) {
						max=totalOrdenador;
						actividad="Ordenador";}
						else if(max< totalDucha){
						max=totalDucha;
						actividad="Ducha";}
						else if(max< totalTV) {
						max=totalTV;
						actividad="TV";}
					// Mostrar la actividad que más contamina
					System.out.println("\n La actividad que mas contamina es la " + actividad + " con " + max);
						break;
					// Opción para finalizar las actividades de la persona
						default:
						System.out.println("Opción no válida. Inténtalo de nuevo.");
				}
			}
			// Repetir hasta que la persona elija finalizar
			 while (tipo != 9);
			totalGrupo += totalPersona;
			// Mostrar el total de CO2 emitido por la persona
			System.out.printf("Total CO2 emitido por la persona " + j + " : " + totalPersona + " KG");
			if(totalPersona < 10) {
				System.out.println("\nExcelente, tu huella de carbono es muy baja");
			}
			else if(totalPersona >= 10 && totalPersona <= 30) {
				System.out.println("\nTu huella de carbono es moderada, puedes mejorar");
			}
			else if(totalPersona > 30) {
				System.out.println("\nAtención, tu huella de carbono es muy alta");
			}
		}
		// Mostrar el total de CO2 emitido por el grupo
		System.out.println("\nTotal CO2 emitido por el grupo:" + totalGrupo + "KG");
		// Mostrar la actividad que más contamina del grupo
		System.out.println("\n La actividad que mas contamina es la " + actividad + " con " + max);
		
		}
			}
	

	private static double coche() {
		float distancia;
		// Pedir la distancia recorrida en kilómetros
		// Validar que la distancia es positiva
		do {
			System.out.println("¿Cuantos kilometros tienes recorridos? ");
			distancia = Util.leerFloat();
			if (distancia < 0) System.out.println("No se permiten valores negativos.");
		} while (distancia < 0);
		double totalc = distancia * 0.21;
		System.out.println(totalc +" KG");
		return totalc;
	}

	private static double bus() {
		float distancia;
		// Pedir la distancia recorrida en kilómetros
		// Validar que la distancia es positiva
		do {
			System.out.println("¿Cuantos kilometros tienes recorridos? ");
			distancia = Util.leerFloat();
			if (distancia < 0) System.out.println("No se permiten valores negativos.");
		} while (distancia < 0);
		double totalb = distancia * 0.10;
		System.out.printf(totalb + " KG");
		return totalb;
	}

	private static double bici() {
		float distancia;
		// Pedir la distancia recorrida en kilómetros
		// Validar que la distancia es positiva
		do {
			System.out.println("¿Cuantos kilometros tienes recorridos? ");
			distancia = Util.leerFloat();
			if (distancia < 0) System.out.println("No se permiten valores negativos.");
		} while (distancia < 0);
		double totalbc = distancia * 0;
		System.out.printf( totalbc + "KG" );
		return totalbc;
	}

	private static double plancha() {
		int i;
		// Preguntar si se ha utilizado la plancha (1=si, 0=no)
		// Validar que la respuesta es 0 o 1
		do {
			System.out.println("¿Has utilizado la plancha (1=si 0=no)?");
			i = Util.leerInt();
			if (i != 0 && i != 1) System.out.println("Solo 1 (sí) o 0 (no).");
		} while (i != 0 && i != 1);
		double totalp = 0;
		// Si se ha utilizado, pedir las horas de uso y calcular el CO2 emitido
		// Si no, el CO2 emitido es 0
		if (i == 1) {
			float horas;
			do {
				System.out.println("¿Cuantas horas se utilizo? ");
				horas = Util.leerFloat();
				if (horas < 0) System.out.println("No se permiten valores negativos.");
			} while (horas < 0);
			totalp = horas * 0.70;
			System.out.printf(totalp + "KG");
		} else {
			System.out.println("No lo utilizaste");
		}
		return totalp;
	}

	private static double ordenador() {
		float horas;
		// Pedir las horas de uso del ordenador
		// Validar que las horas son positivas
		do {
			System.out.println("¿Cuantas horas se utilizo? ");
			horas = Util.leerFloat();
			if (horas < 0) System.out.println("No se permiten valores negativos.");
		} while (horas < 0);
		double totalo = horas * 0.08;
		System.out.printf(totalo +" KG");
		return totalo;
	}

	private static double movil() {
		float horas;
		// Pedir las horas de uso del móvil
		// Validar que las horas son positivas
		do {
			System.out.println("¿Cuantas horas se utilizo? ");
			horas = Util.leerFloat();
			if (horas < 0) System.out.println("No se permiten valores negativos.");
		} while (horas < 0);
		double totalm = horas * 0.02;
		System.out.printf(totalm + " KG");
		return totalm;
	}

	private static double duchaCaliente() {
		int duchas;
		// Pedir el número de duchas calientes de 7 minutos
		// Validar que el número es positivo
		do {
			System.out.println("¿Cuántas duchas calientes de 7 minutos has tomado hoy? ");
			duchas = Util.leerInt();
			if (duchas < 0) System.out.println("No se permiten valores negativos.");
		} while (duchas < 0);
		double total = duchas * 0.875;
		System.out.printf(total + " KG");
		return total;
	}


	private static double television() {
		float horas;
		// Pedir las horas de uso de la televisión
		// Validar que las horas son positivas
		do {
			System.out.println("¿Cuántas horas has visto la televisión? ");
			horas = Util.leerFloat();
			if (horas < 0) System.out.println("No se permiten valores negativos.");
		} while (horas < 0);
		double total = horas * 0.096;
		System.out.printf(total + " KG");
		return total;
	}
}
