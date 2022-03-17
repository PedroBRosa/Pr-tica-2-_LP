package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double total=0;
        int menu = 0;
        while (total!=-1){
            System.out.println("Valor da compra: ");
            total = ler.nextInt();
            System.out.println("============= OPÇÕES DE PAGAMENTO =============");
            System.out.println("1 - À Vista");
            System.out.println("2 - Parcelado 2x");
            if(total>=500){System.out.println("3 - Parcelado de 3x até 6x");}
            System.out.println("==============================================");
            if(total>=500) {
                System.out.println("==Por gentileza escolha uma opção de [1-3]: ==");
                menu = ler.nextInt();
            }else {
                System.out.println("==Por gentileza escolha uma opção de [1-2]: ==");
                menu = ler.nextInt();
            }
            System.out.println("==============================================");
            switch (menu){
                case 1:
                    double desconto;
                    desconto = total*0.01;
                    total = total-desconto;
                    System.out.printf("O valor é: %.2f",total);
                    System.out.println("");
                    break;
                case 2:
                    total = total/2;
                    System.out.printf("2x de: %.2f",total);
                    System.out.println("");
                    break;
                case 3:
                    if(total<500){
                        System.out.println("Opção invalida para esse tipo de valor");
                        break;
                    }else{
                        int subMenu = 0;
                        System.out.println("=========== OPÇÕES DE PARCELAMENTO ===========");
                        System.out.println("1 - 3x");
                        System.out.println("2 - 4x");
                        System.out.println("3 - 5x");
                        System.out.println("4 - 6x");
                        System.out.println("==============================================");
                        subMenu = ler.nextInt();
                        switch (subMenu){
                            case 1:
                                total=total/3;
                                System.out.printf("3x de: %.2f" ,total);
                                System.out.println("");
                                break;
                            case 2:
                                total=total/4;
                                System.out.printf("4x de: %.2f",total);
                                System.out.println("");
                                break;
                            case 3:
                                total=total/5;
                                System.out.printf("5x de: %.2f",total);
                                System.out.println("");
                                break;
                            case 4:
                                total=total/6;
                                System.out.printf("6x de: %.2f",total);
                                System.out.println("");
                                break;
                            default:
                                System.out.println("Opção Invalida!");

                        }
                    }

                default:
                    System.out.println("Opção Invalida!");

            }
        }

    }
}
