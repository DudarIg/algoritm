package less1;

import java.util.Scanner;

public class Z539 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int r;
        int a = in.nextInt();
        if (a % 2 == 0) {
            r = a/2;
        } else {
            r = a;
        }

        System.out.println(r);
    }
}
