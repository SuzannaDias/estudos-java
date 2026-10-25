import java.util.Locale;
import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A, valorRaio;
		
		valorRaio = sc.nextDouble();
		A= Math.PI * Math.pow(valorRaio, 2);

		System.out.printf("%.4f", A);
sc.close();
	}

}
