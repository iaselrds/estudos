package java_teste;
import java.util.Scanner;

public class Aula58b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mask = 32;
		int n = sc.nextInt();
		
		if((n & mask) != 0) {
			System.out.println("Sexto bit é 1.");
		} else {
			System.out.println("Sexto bit é 0.");
		}
		
		sc.close();
	}
	
}
