package java_teste;
import java.util.Scanner;

public class Teste2{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		String a, b, c;
		
		x = sc.nextInt();
		sc.nextLine();
		a = sc.nextLine();
		b = sc.nextLine();
		c = sc.nextLine();
		
		sc.close();
		
		System.out.println(x);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}