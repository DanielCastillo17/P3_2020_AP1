
public class Metodo {
	
	public Metodo() {
		
	}
	
	int promedio (Estudiante[] est) {
		
		int promedio = 0;
		
		for (int i = 0; i <= est.length - i; i++) {
			promedio += est[i].valor;
		}
		
		promedio = promedio / est.length;
		
		return promedio; 
	}
	
	int mejorValor (Estudiante[] est) {
		
		int mejorValor = 0;
		
		for (int i = 0; i <= est.length -1; i++) {
			
			if (est[i].valor > mejorValor) {
				mejorValor = est[i].valor;
			}
		}
		
		return mejorValor;
	}

}
