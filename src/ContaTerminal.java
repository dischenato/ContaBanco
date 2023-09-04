import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Por gentileza digite seu nome completo:");
        String nomeCompleto = terminal.nextLine();

        String[] nomeSobrenome = nomeCompleto.split(" ");
        String nome = nomeSobrenome[0];
        String sobrenome = nomeSobrenome[nomeSobrenome.length - 1];

        System.out.println("Olá, " + nomeCompleto + "." + " Boas-vindas ao Conect Bank!");

        System.out.println("Digite o número da agência para continuar!:");
        String agencia = terminal.next();

        System.out.println("Informe o numero da conta desejada!:");
        int numero = terminal.nextInt();

        System.out.println("Digite o saldo inicial que deseja disponibilizar!:");
        float saldo = terminal.nextFloat();

        System.out.println("Olá " + nome + " " + sobrenome +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero +
                " e seu saldo " + saldo + " já está disponível para saque");

        terminal.close();
    }
}

