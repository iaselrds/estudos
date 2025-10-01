package section10;
import java.util.Scanner;
import java.util.Locale;

public class Aula90 {
	
	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		
		double heightSum = 0;
		for(int i = 0; i < n; i++) {
			System.out.printf("Person %d: %.2f.%n", i + 1, vect[i]);
			heightSum += vect[i];
		}
		
		double heightAvg = heightSum/n;
		
		System.out.printf("%nAverage height: %.2f.%n", heightAvg);
		sc.close();
	}

}
