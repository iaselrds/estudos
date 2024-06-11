import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o primeiro parâmetro: ");
        int primeiroNumero = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Insira o segundo parâmetro: ");
        int segundoNumero = entrada.nextInt();

        try{

            contar(primeiroNumero, segundoNumero);

        }catch(ParametrosInvalidosException e){

            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");

        } 

    }

    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException{
        if(segundoNumero < primeiroNumero){
            throw new ParametrosInvalidosException();
        } 

        int contagem = segundoNumero - primeiroNumero;

        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número "+ i);
        }
    }

    
}
