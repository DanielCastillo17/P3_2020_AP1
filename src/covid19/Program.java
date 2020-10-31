package covid19;

import java.io.*;

public class Program {
	
public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 1. Agregar pacientes de un .txt
		Red arr = new Red();
		ListaSintoma li = new ListaSintoma();
		BufferedReader bf = new BufferedReader(new FileReader("datos.txt"));
		int cantPaciente = Integer.parseInt(bf.readLine());
		String[] arrPaciente;
		String[] Sintoma;
		
		for (int i = 0; i < cantPaciente; i++)
		{
			arrPaciente = bf.readLine().split(", ");
			Paciente paciente = new Paciente(arrPaciente[0], Integer.parseInt(arrPaciente[1]));
			int cantSintomas = Integer.parseInt(arrPaciente[2]);
			for (int j = 0; j < cantSintomas; j++) {
				Sintoma = bf.readLine().split(", ");
				Sintoma sintoma = new Sintoma(Sintoma[0]);
				paciente.agregarSintoma(sintoma);
			}
			arr.añadirPaciente(paciente);
		}
		
		// Mostrar los que no estan en la lista 
		System.out.println("------ Pacientes registrados ------");
		arr.mostrarRed(arr.root);
		
		// 3. Mostrar sintomas de pacientes
		System.out.println("------ Sintomas del paciente ------");
		int codigoPacienteBuscar = 5;
		Paciente p = arr.buscador(codigoPacienteBuscar);
		System.out.println("Los sintomas del paciente " + p.nombre + " son:");
		p.mostrarSintomas(p.listaSintomas);
		
		// 4. Pagar el precio por los sintomas
		System.out.println("------ Precio a pagar ------");
		arr.totalPagar(arr.root);
		
		// 5. Requerimientos varios
		System.out.println("------ Informacion del sistema ------");
		
		System.out.println("El promedio de pago de los pacientes es: " + arr.promedio / arr.cont);
		
		
		
	}

}
