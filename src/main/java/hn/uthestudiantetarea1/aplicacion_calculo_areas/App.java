package hn.uthestudiantetarea1.aplicacion_calculo_areas;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int option = 0;
        Double result = null;
        
        while(option != 5) {
        	initMenu();
        	option = readKeyboard();
        	switch(option) {
        	case 1: 
        		result = areaCircle(readDoubleKeyboard("Ingrese el radio del círculo"));
        		break;
        	case 2: 
        		result = areaSquare(readDoubleKeyboard("Ingrese el lado del cuadrado"));
        		break;
        	case 3: 
        		result = areaRectangle(readDoubleKeyboard("Ingrese la base del rectángulo"), readDoubleKeyboard("Ingrese la altura del rectángulo"));
        		break;
        	case 4: 
        		result = areaTriangle(readDoubleKeyboard("Ingrese la base del triángulo"), readDoubleKeyboard("Ingrese la altura triángulo"));
        		break;
        	case 5: 
        		option = 5;
        		break;
        	default: 
        		option = -1;
        		break;
        	} 
        	if (option != -1 && option != 5) {        		
        		System.out.println("El área es: " + result + "\n");
        	} else if(option == 5) {
        		System.out.println("Adios");
        	} else {
        		System.err.println("Opción invalida");
        	}
        }
        
    }
	private static int readKeyboard() {
		Scanner keyboard = new Scanner(System.in);
		int numero = 0;
		boolean validate = false;
		while(!validate) {
			String input = keyboard.nextLine();
			try {
				numero = Integer.parseInt(input);
				validate = true;
			} catch(NumberFormatException e) {
				System.err.println("Ingrese solo valores numéricos");
			}
		}
		return numero;
	}
    
    private static double readDoubleKeyboard(String message) {
		Scanner keyboard = new Scanner(System.in);
		double numero = 0;
		boolean validate = false;
		while(!validate) {
			System.out.println(message);
			String input = keyboard.nextLine();
			try {
				numero = Double.parseDouble(input);
				validate = true;
			} catch(NumberFormatException e) {
				System.err.println("Ingrese solo valores numéricos");
			}
		}
		return numero;
	}
    
    // Inicializar menú
    private static void initMenu() {
    	System.out.println("*** GEOMETRIA ***");
		System.out.println("1. Área de un círculo");
		System.out.println("2. Área de un cuadrado");
		System.out.println("3. Área de un rectángulo");
		System.out.println("4. Área de un triángulo");
		System.out.println("5. SALIR");
		System.out.println("ELIJA UNA OPCIÓN DEL MENÚ:");
	}
    
    // Función para calcular el área de un triángulo
    public static Double areaTriangle(double base, double altura) {
    	Double area = 0.00;
    	
    	if(base == 0 || altura == 0) {
    		area = null;
    		System.err.println("La base o la altura de un triángulo no pueden ser 0.");
    	} else if(base < 0 ||  altura < 0) {
    		area = null;
    		System.err.println("La base o la altura de un triángulo no pueden ser negativos.");
    	} else {
    		area = base * altura / 2;
    	}
    	return area;
    }
    
    // Función para calcular el área de un rectángulo
    public static Double areaRectangle(double base, double altura) {
    	Double area = 0.00;
    	
    	if(base == 0 || altura == 0) {
    		area = null;
    		System.err.println("La base o la altura de un rectángulo no pueden ser 0.");
    	} else if(base < 0 ||  altura < 0) {
    		area = null;
    		System.err.println("La base o la altura de un réctangulo no pueden ser negativos.");
    	} else {
    		area = base * altura;
    	}
    	return area;
    }
    
    // Función para calcular el área de un cuadrado
    public static Double areaSquare(double lado) {
    	Double area = 0.00;
    	
    	if(lado == 0) {
    		area = null;
    		System.err.println("Los lados de un cuadrado no pueden ser 0.");
    	} else if(lado < 0) {
    		area = null;
    		System.err.println("Los lados no pueden ser negativos.");
    	} else {
    		area = lado * lado;
    	}
    	return area;
    			
    }
    // Función para calcular el área de un círculo
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
