package principal;

public class DNIEliminarElmtoArray {
	
	public static void main(String[] args) {
		
	
		char[] letrasDNI = new char[] { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
			'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
		System.out.println("Valor máximo de int: " + Integer.MAX_VALUE);
        // Mostrar el valor máximo de un long
        System.out.println("Valor máximo de long: " + Long.MAX_VALUE);
        System.out.println("El DNI 'cabe' en un int? Siii");
        int dni=56593950;
        System.out.println(letrasDNI[dni%23]);
        
        // Para eliminar de letrasDNI la letra A hacemos
        for (int contador=0;contador<letrasDNI.length;contador++)
        {
        	if (letrasDNI[contador]=='A')
        	{
        		for(int otroContador=contador;otroContador<letrasDNI.length;otroContador++)
        		{
        			if (otroContador==letrasDNI.length-1)
        				letrasDNI[otroContador]=' ';
        			else
        				letrasDNI[otroContador]=letrasDNI[otroContador+1];
        		}
        	}
        }
        for(char letra: letrasDNI)
        	System.out.print(letra);
	}

}
