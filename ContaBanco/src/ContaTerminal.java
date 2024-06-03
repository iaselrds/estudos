import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agenciaNumero;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o seu ID: ");
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        agenciaNumero = scanner.nextLine();

        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, nos informe o valor que será depositado inicialmente: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaNumero + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque!");

        scanner.close();
    }
}
