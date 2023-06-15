package hn.uthestudiantetarea1.aplicacion_calculo_areas;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int opcion = 0;
        Double result = null;
        
        while(opcion != 5) {
        	initMenu();
        	opcion = readKeyboard("");
        	switch(opcion) {
        	case 1: 
        		result = areaCircle(readDoubleKeyboard("Ingrese el radio del círculo"));
        		break;
        	}
        	System.out.println("El resultado es: " + result + "\n");
        }
        
    }
    
    private static int readKeyboard(String message) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(message);
		return keyboard.nextInt();
	}
    
    private static double readDoubleKeyboard(String message) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(message);
		return keyboard.nextDouble();
	}
    
    private static void initMenu() {
    	System.out.println("*** GEOMETRIA ***");
		System.out.println("1. Área de un círculo");
		System.out.println("2. Área de un cuadrado");
		System.out.println("3. Área de un rectángulo");
		System.out.println("4. Área de un triángulo");
		System.out.println("5. SALIR");
		System.out.println("ELIJA UNA OPCIÓN DEL MENÚ:");
	}

	public static Double areaCircle(double radio) {
		Double area = 0.00;
		if(radio == 0) {
			area = null;
			System.err.println("Cuando el radio es 0 no se considera como círculo, se considera como punto.");
		} else if(radio < 0) {
			area = null;
			System.err.println("El radio no puede ser negativo.");
		} else {
			area = 3.1416 * (radio * radio);
		}
    	return area;
    }
}
