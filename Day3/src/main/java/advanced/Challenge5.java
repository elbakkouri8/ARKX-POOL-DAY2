package advanced;

import java.util.Random;
import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = -1;

        Random random = new Random();
        int number = random.nextInt(11);

        while(number!=N){
            System.out.print("Guess the Number : ");
            N = scanner.nextInt();
            if(N>number) System.out.println("Less than that : ");
            if(N<number) System.out.println("More than that : ");
        }
        System.out.println(number + " is correct");
    }
}
