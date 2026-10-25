import java.util.Scanner;

public class exec2 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int x;
x = sc.nextInt();

if( x % 2 == 0) {
	System.out.print("Par");
}
else {
	System.out.println("Impar");
}

sc.close();
	}

}
