import java.util.Scanner;

public class ContaTerminal {
/*Olá [Nome Cliente], obrigado por criar uma conta em
nosso banco, sua agência é [Agencia], conta [Numero] e seu
saldo [Saldo] já está disponível para saque
 */
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Olá bem vindo ao banco XXXX!!");
    System.out.println("Deseja cria uma conta?");
    System.out.print("Digite 1 para sim e 2 para não: ");
    int resposta = scanner.nextInt();

    if (resposta == 1) {
        System.out.println("Ótimo! Você decidiu criar uma conta conosco.");
        System.out.println("Nós da XXXX Bank garantimos um atendimento de qualidade e um excelente serviço.");
        System.out.println("Para finalizar o processo de abertura de conta, por favor, preencha as seguintes informações:");
        System.out.println("Seu nome e sobrenome: ");
        String nomecliente = scanner.next();
        System.out.println ("O número da sua agência: ");
        int agencia = scanner.nextInt();
        System.out.println ("O número da sua conta: ");
        int conta = scanner.nextInt();
        System.out.println ("Digite o valor inicial para o saldo da conta: ");
        int saldo = scanner.nextInt();

        System.out.println ("Olá " + nomecliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponivel para saque!");

    }
    else{
        System.out.println("Aplicativo encerrado.");
    }

}
}
