package section17;

import model.entities.Client;

public class Example190 {

    public static void main(String[] args) {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2)); // Resulta em true por comparar o conteúdo de dois objetos
        System.out.println(c1 == c2); // Resulta em false por comparar referências de memória de dois objetos
    }

}
