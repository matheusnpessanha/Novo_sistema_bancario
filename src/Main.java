import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do cliente? ");
        String nome = scanner.nextLine();
        String tipoConta = "Conta Corrente";
        //double saldoInicial = 2500;
        double saldo = 2500;
        int operacao = 0;



        System.out.println("********************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("\n********************************************");

        String menu = """
                Operações: 
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - sair
                Digite a operação desejada: 
                
                """;

        while (operacao != 4) {
            System.out.println(menu);
            operacao = scanner.nextInt();

            if (operacao == 1){
                System.out.println("O saldo atual: " + saldo);
            } else if (operacao == 2){
                System.out.println("Digite o valor a ser recebido: ");
                double valorRecebido = scanner.nextDouble();
                saldo += valorRecebido;
                System.out.println("Saldo atualizado: " + saldo);
            } else if (operacao == 3) {
                System.out.println("Digite o valor que deseja transferir: ");
                double transferencia = scanner.nextDouble();
                    if (transferencia > saldo) {
                        System.out.println("Não poderá transferir esse valor, valor acima do saldo em conta.");
                    } else {
                        saldo -= transferencia;
                        System.out.println("Saldo atual: " + saldo);
                    }
            } else if (operacao != 4){
                System.out.println("Operação inválida!");
            }

        }













    }
}