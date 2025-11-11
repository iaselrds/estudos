//AULAS 98 e 99 - Listas, Parte 1 e 2

package section10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson98 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for(String nome : list) {
			System.out.println(nome);
		}
		
		System.out.println(list.indexOf("Anna"));
		list.remove("Anna");

		System.out.println("");
		System.out.println(list.size());
		
		for(String nome : list) {
			System.out.println(nome);
		}
		
		list.remove(1);

		System.out.println("");
		System.out.println(list.size());
		
		for(String nome : list) {
			System.out.println(nome);
		}
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println("");
		System.out.println(list.size());
		
		for(String nome : list) {
			System.out.println(nome);
		}
		
		list.removeIf(x -> x.charAt(0) == 'B');
	
		System.out.println("");
		System.out.println(list.size());
		
		for(String nome : list) {
			System.out.println(nome);
		}
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println("");
		System.out.println(list.size());
		
		for(String nome : list) {
			System.out.println(nome);
		}
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		System.out.println("");
		System.out.println(result.size());
		
		for(String nome : result) {
			System.out.println(nome);
		}
		
		String name = result.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println("");
		System.out.println(name);
		
		String name2 = result.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		
		System.out.println("");
		System.out.println(name2);
	}
}
