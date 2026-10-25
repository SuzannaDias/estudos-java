import java.util.Locale;
import java.util.Scanner;

public class exe6 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Locale.setDefault(Locale.US);

double A, B, C;
double triangulo;
double circulo;
double trapezio;
double quadrado;
double retangulo;


A = sc.nextDouble();
B = sc.nextDouble();
C = sc.nextDouble();

triangulo = (A * C ) / 2;
circulo = Math.PI * Math.pow(C , 2);
trapezio = ((A + B) * C) / 2.0;
quadrado = B * B;
retangulo = A * B;


System.out.printf("Triangulo: %.3f%n ", triangulo);
System.out.printf("Circulo: %.3f%n", circulo);
System.out.printf("Trapezio: %.3f%n", trapezio);
System.out.printf("Quadrado %.3f%n", quadrado);
System.out.printf("Retangulo: %.3f%n", retangulo);

sc.close();
	}

}
