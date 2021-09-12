/*
 *  UCF COP3330 Fall 2021 Exercise 18 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise18;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        System.out.print("Press C to convert from Fahrenheit to Celsius\nPress F to convert from Celsius to Fahrenheit\nYour choice: ");
        Scanner sc = new Scanner(System.in);

        String from =  sc.next().toUpperCase(Locale.ROOT);
        double temp;
        DecimalFormat df = new DecimalFormat("0.##");

        if (from.charAt(0) == 'C') {
            System.out.println("Please enter the temperature in Fahrenheit");
            temp = sc.nextDouble();
            double C = (temp-32) *5/9;
            System.out.println("The temperature in Celsius is "+df.format(C));
        } else if (from.charAt(0) == 'F') {
            System.out.println("Please enter the temperature in Celsius");
            temp = sc.nextDouble();
            double F = (temp*9/5) +32;
            System.out.println("The temperature in Fahrenheit is "+df.format(F));
        }
        sc.close();
    }
}
