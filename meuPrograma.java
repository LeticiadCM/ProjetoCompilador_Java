import java.util.Scanner;
public class MainClass{ 
	public static void main(String args[]){
 		Scanner scanner = new Scanner(System.in);
		int  a;
		int  b;
		int  c;
		double  d;
		d = 2.5;
		System.out.println("Programa Teste");

		System.out.println("Digite A");

		a = scanner.nextInt();
		System.out.println("Digite B");

		b = scanner.nextInt();
		
		if (a<b){
		  c = a-b;
 		}
		else {
		  c = a*b;
		}

		
		do {
		  c = a+b;
 		} while (a<b);

    }
}
