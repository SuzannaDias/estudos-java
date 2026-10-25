import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, quant1, quant2;
		double preco1, preco2, valorAPagar;
		
		cod1= sc.nextInt();
		quant1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		quant2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		valorAPagar = preco1 * quant1 + preco2 *quant2;
		
		System.out.printf("Valor a pagar R$ %.2f%n", valorAPagar);
		
		sc.close();
		
	}

}
