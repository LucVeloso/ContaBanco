import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ContaTerminal conta = new ContaTerminal();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        conta.setClientName(scanner.nextLine());

        System.out.print("Informe a agencia: ");
        conta.setAgency(scanner.nextLine());

        System.out.print("Informe a conta: ");
        conta.setNumber(Integer.parseInt(scanner.nextLine()));

        System.out.print("Informe o saldo da conta: ");
        conta.setBalance(Float.parseFloat(scanner.nextLine()));

        System.out.println(conta.greetings());

        scanner.close();
    }
}
