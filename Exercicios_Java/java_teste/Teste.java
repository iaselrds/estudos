package java_teste;
import java.util.Scanner;
import java.util.Locale;

public class Teste {
	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);
		
		int a, b, c, f;
		double in; 
		String e;
		double resultado;
		double d = 7.0;
		char letra;
		a = 5;
		b = 2;
		c = (int) d;
		
		Scanner sc = new Scanner(System.in);
		
		e = sc.next();
		f = sc.nextInt();
		in = sc.nextDouble();
		letra = sc.next().charAt(1);
		sc.close();
		
		System.out.println(e);
		System.out.println(f);
		System.out.println(in);
		System.out.println(letra);
		
		resultado = (double) a/b;
		System.out.println(resultado);
		System.out.println(c);
	}
}
