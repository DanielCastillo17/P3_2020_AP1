package recusion;

public class Division {
	
	int division(int dividendo, int divisor) {
		if (divisor > dividendo) {
			return 0;
		}
		return 1 + division(dividendo - divisor, divisor);
	}

}
