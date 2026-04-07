package page_3;

import java.util.Scanner;

public class somaConsecutivosII {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        int soma;
        for (int i = 0; i < numero ; i++) {
            soma = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            x += 1;
            for (int j = x; j < y; j++) {
                if (j % 2 != 0){
                    soma += j;

                }
            }
            for (int k = x - 2; k > y; k--) {

                if (k % 2 != 0){
                    soma += k;
                }
            }
            System.out.println(soma);
        }
    }
}
