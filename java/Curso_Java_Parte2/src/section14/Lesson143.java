// AULA 143 - Exceções

package section14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson143 {
	
	public static void main(String[] args) {
		
		method1();	
		System.out.println("End of program!");
		
	}
	
	public static void method1() {
		System.out.println("***METHOD 1 START***");
		method2();
		System.out.println("***METHOD 1 END***");
	}
	
	public static void method2() {
		
		System.out.println("***METHOD 2 START***");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			for(int i = 0; i < vect.length; i++) {
				System.out.println(vect[i]);
			}
			
			System.out.println("O vetor de strings tem "+ vect.length +" posições");
			int position = sc.nextInt();
			System.out.println(vect[position - 1]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
		} catch(InputMismatchException e){
			System.out.println("Invalid input!");
			e.printStackTrace();
			sc.next();
		}
		
		sc.close();
		System.out.println("***METHOD 2 END***");
	}
	
}
