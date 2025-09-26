package java_teste;
import java.util.Scanner;

public class Aula50 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		for(int i = 0; i < 5; i++) {
			x = sc.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
		
		sc.close();
	}
	
}
