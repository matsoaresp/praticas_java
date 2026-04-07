package page_2;

import java.util.Scanner;

public class somaConsecutivos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int soma = 0;
       for (int i = num1; i <= num2; i++) {
           if (i % 2 != 0) {
               soma += i;
           }
       }
        for (int j = num1 - 1; j > num2; j--) {
            if (j % 2 != 0) {
                soma += j;
            }
        }
        System.out.println(soma);
    }
}
