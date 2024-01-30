package basics;

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        double celsiusTemperature,F;

        Scanner sc=new Scanner(System.in);
        System.out.print("Set the temperature ( °C ) = ");
        celsiusTemperature=sc.nextDouble();

        F = (celsiusTemperature*9/5)+32;
        System.out.print("Temperature in °F = " +F);

    }
}
