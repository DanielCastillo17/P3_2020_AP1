
public class Program {
	
  public static void main (String[] args ) {
		
		Estudiante[] est = new Estudiante[5];
		Metodo met = new Metodo();
		
		est[0] = new Estudiante();
		est[0].nombre = "felipe";
		est[0].valor = 500;
		
		est[1] = new Estudiante();
		est[1].nombre = "camilo";
		est[1].valor = 800;
		
		est[2] = new Estudiante();
		est[2].nombre = "sebastian";
		est[2].valor = 400;
		
		est[3] = new Estudiante();
		est[3].nombre = "pedro";
		est[3].valor = 700;
		
		est[4] = new Estudiante();
		est[4].nombre = "sergio";
		est[4].valor = 1000;
		
		int promedio =  met.promedio(est);
		int mejorValor = met.mejorValor(est);
		
		System.out.println("Promedio de los valores: " + promedio);
		System.out.println("Estudiante con mejor valor: " + mejorValor);
		System.out.println("La diferencia entre el mejor valor y el promeido es: " + (promedio - mejorValor));
	}
	
}
