package Ex2;

public class Main {
    public static void main(String[] args) {
        int impar=1;
        int [][] matriz = new int [3][3];
    for(int i = 0;i< 3;i++){
        for (int j = 0;j < 3;j++){
            matriz[i][j]=impar;
            impar +=2;
            if(i==j){System.out.println(matriz[i][j]);}
            if(i!=j){
                matriz[i][j] = 0;
                System.out.println(matriz[i][j]);
            }
        }
    }
    }
}
