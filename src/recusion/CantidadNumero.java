package recusion;

public class CantidadNumero {
	
     int cantidadPar (int[] arr, int posicion) {
		
		int cantPar = 0;
		
		if (posicion == arr.length) {
			return 0;
		}
		
		if (arr[posicion] % 2 == 0) {
			cantPar ++;
			return cantPar;
		}
		
		return cantidadPar(arr, posicion + 1);
	}
	
	int cantidadImpar (int[] arr, int posicion) {
		
		
		return cantidadPar(arr, posicion + 1);
	}

}
