import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int numero_conta;
        String agencia;
        String nome_cliente;
        double saldo; 

        System.out.println("Por favor, digite o número da conta:");
        numero_conta = scan.nextInt();
        scan.nextLine(); //Pega o enter que fica armazenado no buffer após a leitura

        System.out.println("Por favor, digite o número da agência:");
        agencia = scan.nextLine();

        System.out.println("Por favor, informe seu nome:");
        nome_cliente = scan.nextLine();

        System.out.println("Por favor, informe seu saldo:");
        saldo = scan.nextDouble();
        scan.nextLine();

        System.out.println();
        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero_conta + " e seu saldo " + saldo +" já está disponível para saque");
        
        scan.close();
    }
}
