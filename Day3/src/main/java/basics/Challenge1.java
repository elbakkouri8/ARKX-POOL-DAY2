package basics;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Number = ");
        int userNumber=sc.nextInt();

        if(userNumber%2==0){
            System.out.println(userNumber + " is even Number ");
        }
        else System.out.println(userNumber + " is odd Number ");
    }
}
