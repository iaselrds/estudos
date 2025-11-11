//AULA 96 - Boxing, unboxing e wrapper classes
package section10;

public class Lesson96 {
	
	public static void main(String[] args) {
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		int y = (int)obj;
		System.out.println(y);
		
		int z = 40;
		
		Integer num = z;
		
		int w = num * 2;
		
		System.out.println(w);
	}
}
