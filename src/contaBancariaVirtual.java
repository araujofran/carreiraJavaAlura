import java.util.Scanner;

public class contaBancariaVirtual {

    public static void main(String[] args) {

        final int SENHA_CORRETA = 123;
        final int MAX_TENTATIVAS = 3;
        double saldo = 2500;

        String cliente = "Fabio Araujo";
        Scanner sc = new Scanner(System.in);

        int tentativas = 0;
        boolean autenticado = false;
        String resposta = "S";

        while (tentativas < MAX_TENTATIVAS ) {
            System.out.printf("Digite sua senha de 3 digitos: %n");
            int senhaDigitada = sc.nextInt();

            if (senhaDigitada == SENHA_CORRETA) {
                autenticado = true;
                break;
            }while (resposta.equalsIgnoreCase("S"));

            tentativas++;
            System.out.printf(
                    "Senha incorreta! Tentativa %d de %d.%n",
                    tentativas, MAX_TENTATIVAS
            );
        }

        if (!autenticado) {
            System.out.println("Conta Bloqueada! Excedeu 3 Tentativas.");
            System.out.println("Procure um banco mais próximo para desbloquear sua conta.");
            return;
        }
        do {
            // MENU
            System.out.println("----------------------------------------------------------------------------------");
            System.out.printf("Seja Bem Vindo, %s ao Banco Virtual Fran.%n", cliente);
            System.out.println("O que deseja fazer Hoje?");
            System.out.println("1- Consultar Saldo.");
            System.out.println("2- Receber Valor.");
            System.out.println("3- Transferir Valor.");
            System.out.println("4- Sair.");
            System.out.println("----------------------------------------------------------------------------------");

            int opcaoMenu = sc.nextInt();
            if (opcaoMenu == 1) {
                System.out.printf("Saldo Atual: R$%.2f.%n", saldo);
            } else if (opcaoMenu == 2) {
                System.out.printf("Quanto deseja receber?%n");
                double receberValor = sc.nextDouble();
                saldo += receberValor;
                System.out.printf("Saldo Atual: R$%.2f.%n", saldo);

            } else if (opcaoMenu == 3) {
                System.out.printf("Quanto deseja transferir?%n");
                double transferirValor = sc.nextDouble();
                if(transferirValor>saldo){
                    System.out.printf("Saldo Insuficiente.%nO seu valor atual é de %.2f.%n",saldo);
                }else {
                    saldo -= transferirValor;
                    System.out.printf("Saldo Atual: R$%.2f.%n", saldo);
                }

            } else if (opcaoMenu == 4) {
                System.out.printf("Até Logo!!!%n");
                break;
            } else{
                System.out.printf("Opção Invalida!");
                return;
            }
            System.out.printf("Quer continuar?(S/N)");
            sc.nextLine();
            resposta = sc.nextLine();
        }while (resposta.equalsIgnoreCase("S"));
    }
}

