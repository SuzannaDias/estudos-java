import java.util.Scanner;

public class exefor4 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
for (int i = 0; i < n; i++) {
	double num = sc.nextDouble();
	double den = sc.nextDouble();
	
	if(den != 0) {
		 double divisao = num / den;
		 System.out.printf("%.1f%n", divisao);

	}
	else {
		System.out.println("Divisão impossivel");

	}

}	


sc.close();
	}

}
