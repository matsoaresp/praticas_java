package page_3;

import java.util.Scanner;

public class seqNumSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        while (m > 0 && n > 0) {
            int soma = 0;

            if (m < n) {
                int i = m;
                while (i <= n) {
                    System.out.print(i + " ");
                    soma += i;
                    i++;
                }
            }
            else {
                int i = n;
                    while (i <= m) {
                        System.out.print(i + " ");
                        soma += i;
                        i++;


                    }
            }
            System.out.println("Sum=" + soma);
            m = sc.nextInt();
            n = sc.nextInt();

        }
    }
}
