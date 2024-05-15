import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta: ");
        int conta = input.nextInt();

        System.out.println("Por favor, digite o número da Agencia: ");
        String agencia = input.next();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = input.nextDouble();

        System.out.println("Por favor, digite o  nome do cliente: ");
        String nome = input.next();

        System.out.print("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é: " + agencia);
        System.out.print(", conta: " + conta + " e seu saldo: " + saldo + "já está disponível para saque");

    }

}
