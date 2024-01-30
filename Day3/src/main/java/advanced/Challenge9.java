package advanced;

import java.util.Scanner;

public class Challenge9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("write the year : ");
        int year = scanner.nextInt();

        if(year%4 == 0) System.out.println(year + "year is a leap year");
        else{ System.out.println(year + "year is not a leap year");}
    }
}
