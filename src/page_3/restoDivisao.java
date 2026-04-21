package page_3;

import java.util.Scanner;

public class restoDivisao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x < y) {
            for (int i = x + 1; i < y; i++) {
                if (x < 0) {
                    return;
                } else if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = y + 1; i < x; i++) {
                if (y < 0) {
                    return;
                } else if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
        }
    }
}