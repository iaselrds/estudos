import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Hello, world!");
		
		int y = 32;
		double x = 10.35784;
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f\n", x);
		System.out.println("Eu tenho " + x + " segundos para terminar isso.");
		System.out.printf("Eu tenho %.2f dias e %d segundos para terminar isso.\n", x, y);

	}

}
