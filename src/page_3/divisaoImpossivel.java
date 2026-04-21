package page_3;

import java.util.Scanner;

public class divisaoImpossivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x == 0 || y != 0) {
            double resultado = (double) x / y;
            System.out.println(resultado);
        } else {
            System.out.println("divisao impossivel");
        }
    }
    }
}
