package less1;

import java.util.Scanner;

public class Z61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] igra = {0, 0};

        for (int i = 1; i < 5; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            igra[0] += a;
            igra[1] += b;
        }
        if (igra[0] > igra[1]) {
            System.out.println(1);
        } else {
            if (igra[0] < igra[1]){
                System.out.println(2);
            } else {
                System.out.println("DRAW");
            }
        }

    }
}
