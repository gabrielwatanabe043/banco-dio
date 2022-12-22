import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        System.out.println("Por favor, digite o número da Agência !");
        Scanner sc = new Scanner(System.in);
        String agencia = sc.nextLine();
        conta.escolherAgencia(agencia);

        System.out.println("Por favor, digite o número da Conta!");
        sc = new Scanner(System.in);
        int numero = sc.nextInt();
        conta.escolherNumero(numero);

        System.out.println("Por favor, seu nome!");
        sc = new Scanner(System.in);
        String nome = sc.nextLine();
        conta.escolherNome(nome);

        System.out.println("Por favor, digite seu saldo!");
        sc = new Scanner(System.in);
        double saldo = sc.nextDouble();
        conta.escolherSaldo(saldo);

        System.out.println(
                "Olá " + conta.nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia
                        + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque");
    }
}
