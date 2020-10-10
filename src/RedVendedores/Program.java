package RedVendedores;
	
	import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;

	public class Program {

		public static void main(String[] args) throws NumberFormatException, IOException {
			// TODO Auto-generated method stub
			Red camilo = new Red();

			BufferedReader bf = new BufferedReader(new FileReader(
					"C:\\Users\\HP\\eclipse-workspace\\ProgramingIII\\src\\RedVendedores\\DatosVendedores.txt"));

			String[] arrDatosVendedorRight;
			String[] arrDatosVendedorLeft;

			int cantVendedoresRight = Integer.parseInt(bf.readLine());
			for (int i = 0; i < cantVendedoresRight; i++) {
				arrDatosVendedorRight = bf.readLine().split(",");
				Vendedor vendedorRight = new Vendedor(Integer.parseInt(arrDatosVendedorRight[0]),
						Float.parseFloat(arrDatosVendedorRight[1]));
				camilo.agregarVendedorRight(vendedorRight);
			}
				int cantVendedoresLeft = Integer.parseInt(bf.readLine());
				for (int j = 0; j < cantVendedoresLeft; j++) {
					arrDatosVendedorLeft = bf.readLine().split(",");
					Vendedor vendedorLeft = new Vendedor(Integer.parseInt(arrDatosVendedorLeft[0]),
							Float.parseFloat(arrDatosVendedorLeft[1]));
					camilo.agregarVendedorLeft(vendedorLeft);
		
					
				}
				
				camilo.ejecutarMetodos();
			
			Float saldoTotalRed = camilo.saldoTotalRed;
			System.out.println("El saldo total de la red es : $ " + saldoTotalRed);

			Vendedor vendedorSaldoMayor = camilo.saldoMayor();
			System.out.println("El vendedor con mayor saldo es: " + vendedorSaldoMayor.id);

			Vendedor vendedorSaldoMenor = camilo.saldoMenor();
			System.out.println("El vendedor con menor saldo es: " + vendedorSaldoMenor.id);

		}

     }
	
	