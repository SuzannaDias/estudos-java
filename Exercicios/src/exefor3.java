import java.util.Locale;
import java.util.Scanner;

public class exefor3 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Locale.setDefault(Locale.US);
int n = sc.nextInt();
double a,b,c;
for (int i = 0; i < n ; i++) {
	a = sc.nextDouble();
	b = sc.nextDouble();
	c = sc.nextDouble();
	double media = ((a * 2) + (b * 3) + (c * 5)) / 10;
	System.out.printf("%.1f%n",media);
}
sc.close();
	}

}
