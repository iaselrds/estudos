// AULA 97 - LAÇO "for each"
package section10;
public class Lesson97 {
	
	public static void main(String[] args) {
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		for(String nome : vect) {
			System.out.println(nome);
		}
	}
}
