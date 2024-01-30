package advanced;

import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        int f=1,N;
        Scanner scanner = new Scanner(System.in);
        System.out.print("write a number : ");
        N = scanner.nextInt();

        for (int i=1;i<=N;i++){
            f=f*i;
        }
        System.out.print(N + "! =  " + f);
    }
}
