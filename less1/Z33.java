package less1;

import java.util.Scanner;

public class Z33 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int v = a + b - 1;

        int an = v - a;
        int bn = v - b;
        System.out.print(an+" ");
        System.out.println(bn);

    }
}
