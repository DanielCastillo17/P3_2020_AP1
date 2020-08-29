package recusion;

public class Program {
	
public static void main(String[] args) {
	
	    // A. Cantidad de numeros pares e impares
		CantidadNumero x = new CantidadNumero();
		int[] arr = new int[] {3, 6, 9, 12, 15};
		int cantidadPar = x.cantidadPar(arr, 0);
		int cantidadImpar = x.cantidadImpar(arr, 0);
	    System.out.println("Hay " + cantidadPar + " numero par");   
		System.out.println("Hay " + cantidadImpar + " numero impar");
	    
		// B. Dividir dos números 
		Division n = new Division();
		int division = n.division(100, 20);
		System.out.println("La division final es: " + division);
		
		
		// D. Factorial de un numero
		Factorial f = new Factorial();
		int factorial =  f.factorial(5);
		System.out.println("La factorial final es: " + factorial);
			
		
		// C. Potencia de un número
		Potencia p = new Potencia();
		int potencia = p.potencia(4, 4);
		System.out.println("La potencia fianl es: " + potencia);
		

		// E. Sumar numeros en un arreglo 
		SumarArreglo arrA = new SumarArreglo();
		int[] arrSum = new int[] {4, 7, 10, 5, 8};
		int suma = arrA.sumarArr(arrSum, 0);
		System.out.println("La suma final es: " + suma);
		
	}

}
