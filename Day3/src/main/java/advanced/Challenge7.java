package advanced;


import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a single character :");
        char c = sc.next().charAt(0);

        switch (c){
            case 'a','e','u','i','o' :
                System.out.println( c + " is a vowel"); break;
            default: System.out.println( c + " is a consonant");
        }
    }
}
