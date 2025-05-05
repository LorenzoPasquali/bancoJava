import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomePessoa  = "Lorenzo";
        String tipoConta = "Corrente";
        int operacao = 0;
        double saldoAtual= 2500;

        System.out.println("Dados iniciais: ");
        System.out.println("nome:  " + nomePessoa);
        System.out.println("saldo atual:  " + saldoAtual);
        System.out.println("Tipo de conta:  "+ tipoConta);

        while (operacao != 4){
            System.out.println("----Operacoes----");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Receber valor ");
            System.out.println("3 - Transferir Valor");
            System.out.println("4 - Sair");
            System.out.println("Escolher uma opcao:  ");
            operacao = scanner.nextInt();

        if( operacao == 1){
            System.out.println("o Saldo atual é: $"+ saldoAtual);
        }
        if (operacao == 2){
            System.out.println("Insira o valor recebido: ");
            double receberValor = scanner.nextDouble();
            saldoAtual = saldoAtual + receberValor;
            System.out.println("o Saldo atualizado é: $"+ saldoAtual);
        }
            if (operacao == 3 ) {
                System.out.println("Insira o valor transferido: ");
                double transfereValor = scanner.nextDouble();
                saldoAtual = saldoAtual - transfereValor;

                if (saldoAtual < 0) {
                    System.out.println("transferencia negada, nao contem limite bruxu");
                }
                else {
                System.out.println("o Saldo atualizado é: $"+ saldoAtual);

                }
            }
            if (operacao > 4) {
                System.out.println("operacao invalida.");
            }

        }
    }
}
