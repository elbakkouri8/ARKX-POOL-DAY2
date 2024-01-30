package advanced;

import java.util.Scanner;

public class Challenge10 {
    public static void main(String[] args) {

        int l=0;
        int r=1;
        int t;

        System.out.print(l + " " + r );

        for(int i=0;i<8;i++){
            t=l+r;
            System.out.print(" " + t);
            l=r;
            r=t;
        }
    }
}
