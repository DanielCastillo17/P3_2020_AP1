package recusion;

public class SumarArreglo {
	
     int sumarArr (int[] arr, int posicion) {
		
		if (posicion < arr.length) {
			return arr[posicion] + sumarArr(arr, posicion + 1);
		}
		
		return 0;
	}

}
