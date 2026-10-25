import java.util.Locale;
import java.util.Scanner;

public class Exe1 {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int x, y, soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.print("Soma = " + soma);
		
		sc.close();
	}
}
