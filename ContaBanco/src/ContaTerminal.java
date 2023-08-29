import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numeroConta;
        String agenciaConta;
        String nomeConta;
        Double saldoConta;

        System.out.println("Por favor,Insira o nome do Cliente!");
        nomeConta = ler.nextLine();
        System.out.println(nomeConta);



        System.out.println("Por favor,Insira o nº da conta!");
        numeroConta = ler.nextInt();
        System.out.println(numeroConta);

        System.out.println("Por favor, Insira o Nº da agência!");
        agenciaConta = ler.next();
        System.out.println(agenciaConta);

        System.out.println("Por favor, Insira o Saldo!");
        saldoConta = ler.nextDouble();
        System.out.println(saldoConta);


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %2f já esta disponivel para saque.", nomeConta, agenciaConta, numeroConta, saldoConta);
    }
}
