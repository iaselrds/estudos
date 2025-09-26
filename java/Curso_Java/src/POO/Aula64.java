package POO;
import java.util.Scanner;

public class Aula64 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double xa, xb, xc, ya, yb, yc, px, py = 0;
		double areaX, areaY = 0;
		
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		
		px = (xa + xb + xc)/2;
		
		areaX = Math.sqrt(px*(px - xa)*(px - xb)*(px - xc));
		
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();		
		
		py = (ya + yb + yc)/2;
		
		areaY = Math.sqrt(py*(py - ya)*(py - yb)*(py - yc));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
				
		sc.close();
	}
}
