package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int menu = 0;
        String nome,cpf;
        int [] poltrona = new int [100];

            System.out.println("============= OPÇÕES DE PAGAMENTO =============");
            System.out.println("1 - Cadastrar Passageiro");
            System.out.println("2 - Check in");
            System.out.println("3 - Cancelar Voo");
            System.out.println("4 - Sair");
            System.out.println("==============================================");
            System.out.println("==Por gentileza escolha uma opção de [1-4]: ==");
            System.out.println("==============================================");
            menu = ler.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Escreva o nome do Passageiro: ");
                    nome = ler.next();
                    System.out.println(nome);

                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("SISTEMA ENCERRADO!");
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }

    }
}
