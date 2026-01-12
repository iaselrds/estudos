//AULA 185 - Introdução aos Generics

package section17;

import java.util.Scanner;

import model.services.PrintService;

public class Lesson185 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<Integer>();
		
		System.out.println("How many values?");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		
		System.out.println("First: " + ps.first());
		
		sc.close();
		
	}
}
