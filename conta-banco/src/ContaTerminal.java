import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Digite o numero da agencia: ");
        int accountAgency = scanner.nextInt();

        System.out.println("Digite o nome do cliente: ");
        String clientName = scanner.next();
        
        Conta TestAcount = new Conta(accountNumber, accountAgency, clientName);

        System.err.println(TestAcount.confirmAccountCreation());

        scanner.close();
    }
}
