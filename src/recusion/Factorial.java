package recusion;

public class Factorial {
	
	int factorial (int numero) 
	{
		if (numero == 1) {
			return 1;
		}
		return numero * factorial(numero -1);
	}

}
