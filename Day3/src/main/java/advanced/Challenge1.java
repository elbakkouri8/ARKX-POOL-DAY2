package advanced;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("write a number : ");
        int N = scanner.nextInt();


        if(N<0)  System.out.println("negative");
        else if(N>0)  System.out.println("positive");
        else System.out.println("zero") ;
    }
}
