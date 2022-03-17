package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int menu = 0;
        String nome, cpf;
        int numVoo,numPoltrona;
        boolean[] poltrona = new boolean[100];
        for(int i=0;i<poltrona.length;i++){
            poltrona[i]=true;
        }
        while (menu != 4) {
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
                    System.out.println("============= CADASTRAR PASSAGEIRO =============");
                    System.out.println("Escreva o nome do Passageiro: ");
                    nome = ler.next();
                    System.out.println("Escreva o CPF do Passageiro: ");
                    cpf = ler.next();
                    System.out.println("Escreva o numero do voo do Passageiro: ");
                    numVoo = ler.nextInt();
                    System.out.println("CADASTRO REALIZADO COM SUCESSO" );
                    break;
                case 2:
                    System.out.println("============= CHECK IN =============");
                    System.out.println("Escreva o CPF do Passageiro: ");
                    cpf = ler.next();
                    System.out.println("Escreva o numero do voo do Passageiro: ");
                    numVoo = ler.nextInt();
                    System.out.println("Escreva o numero da Poltrona : ");
                    numPoltrona = ler.nextInt();
                    while(poltrona[numPoltrona-1]==false){
                        System.out.println("Poltrona já ocupada, Escolha outra ");
                        numPoltrona = ler.nextInt();
                        if(poltrona[numPoltrona-1]==true){
                            poltrona[numPoltrona-1]=false;
                            break;
                        }
                    }
                    poltrona[numPoltrona-1]=false;
                    System.out.println("CHECK IN FEITO");
                    break;
                case 3:
                    System.out.println("============= CANCELAR VOO =============");
                    System.out.println("Escreva o CPF do Passageiro: ");
                    cpf = ler.next();
                    System.out.println("Escreva o numero do voo do Passageiro: ");
                    numVoo = ler.nextInt();
                    System.out.println("Escreva o numero da Poltrona : ");
                    numPoltrona = ler.nextInt();
                    poltrona[numPoltrona-1]=true;
                    System.out.println("== CANCELAMENTO REALIZADO COM SUCESSO ==");
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
}
