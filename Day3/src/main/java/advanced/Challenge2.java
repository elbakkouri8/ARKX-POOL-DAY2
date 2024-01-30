package advanced;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("write a number of day (1-7) : ");
            N = scanner.nextInt();
        }while (N<1 ||N>7);

        switch (N){
            case 1: System.out.println("Monday ");break;
            case 2: System.out.println("Tuesday ");break;
            case 3: System.out.println("Wednesday ");break;
            case 4: System.out.println("Thursday ");break;
            case 5: System.out.println("Friday ");break;
            case 6: System.out.println("Saturday ");break;
            case 7: System.out.println("Sunday ");break;
        }
    }
}
