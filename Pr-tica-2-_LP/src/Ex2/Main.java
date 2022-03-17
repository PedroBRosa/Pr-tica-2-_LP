package Ex2;

public class Main {
    public static void main(String[] args) {
        int somaDP=0;
        int impar=1;
        int [][] matriz = new int [50][50];
    for(int i = 0;i< matriz.length;i++){
        for (int j = 0;j < matriz[0].length;j++){
            matriz[i][j]=0;
            //definindo a diagonal principal e somando os elementos dela
            if(i==j){
                matriz[i][j]=impar;
                somaDP = somaDP+matriz[i][j];
            }
            System.out.printf("%d\t",matriz[i][j]);
            impar+=2;
        }
        System.out.printf("\n");
    }
        System.out.println("A soma da diagonal princiapal da matriz é = " +somaDP);
    }
}
