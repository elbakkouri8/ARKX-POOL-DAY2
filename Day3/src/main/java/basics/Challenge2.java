package basics;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        String firstName,lastName;

        Scanner sc=new Scanner(System.in);
        System.out.print("Your firstname : ");
        firstName=sc.nextLine();
        System.out.print("Your lastname : ");
        lastName=sc.nextLine();
        String fullName =firstName + " " + lastName;
        System.out.print("Your fullname is : " + fullName);
    }
}
