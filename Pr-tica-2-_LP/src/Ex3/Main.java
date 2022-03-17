package Ex3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] lista = new int[10];
        Random random = new Random();
        for (int i = 0; i<lista.length;i++){
            int preencher = random.nextInt(0,999);
            lista[i] = preencher;
        }
        Arrays.sort(lista);
        for (int i=0;i< lista.length;i++){
            System.out.printf("%d\t",lista[i]);
        }
    }
}
