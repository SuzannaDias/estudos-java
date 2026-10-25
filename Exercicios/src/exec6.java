import java.util.Locale;
import java.util.Scanner;

public class exec6 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Locale.setDefault(Locale.US);

double x = sc.nextDouble();

if( x < 0.0 ||  x > 100.00 ) {
	System.out.println("Fora de intervalo");
}
else if (x <= 25.00) {
	System.out.println (" Intervalo (0,25)");

}
else if ( x <= 50.00) {
	System.out.println("Intervalo (25,50)");

}
else if ( x <= 75.00) {
	System.out.println("Intervalo (50,75)");
}
else {
	System.out.println (" Intervalo (75,100)");

}

sc.close();
	}

}
