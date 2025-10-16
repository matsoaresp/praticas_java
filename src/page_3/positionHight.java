package page_3;

import java.util.Scanner;

public class positionHight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int maior = 0;
        int posicao = 0;
        for (int i = 1; i <= 100; i++) {
         int value = sc.nextInt();

         if (value < 0 ) {
             System.out.println("Insira apenas numeros positivos!");
         }
         if (value > maior){
             maior = value;
             posicao = i;
         }

        }
        System.out.println(maior);
        System.out.println(posicao);
        sc.close();
    }
}
