package advanced;

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        int i=0,N;
        Scanner scanner = new Scanner(System.in);
        System.out.print("write a number : ");
        N = scanner.nextInt();

        while(i<=N){
            System.out.println(N + " * " + i + " = " + N*i);
            i++;
        }
    }
}
