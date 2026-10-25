import java.util.Locale;
import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int numeroFuncionario = sc.nextInt();
		double horasTrabalhadas = sc.nextDouble();
		double valorPorHora = sc.nextDouble();
		
		double salario = horasTrabalhadas * valorPorHora;
		
		System.out.printf("O funcionario identificado por n %d, recebeu o total de salario no valor de R$ 1%.2f", numeroFuncionario, salario );
		
		sc.close();
	}

}
