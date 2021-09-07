package less1;

import java.util.Scanner;

public class Z149 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] mass = new int[n];

        for (int i=0; i< mass.length; i++){
            mass[i] = in.nextInt();
        }

        for (int i = mass.length-1; i>=0; i--) {
            System.out.print(mass[i]+" ");
        }

    }
}
