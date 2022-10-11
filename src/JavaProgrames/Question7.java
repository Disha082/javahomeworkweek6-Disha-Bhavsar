package JavaProgrames;
/*Write a program to insert any temperature value in degree Fahrenheit and
        convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        float temp;
        System.out.println("Enter the Fahrenheit temperature");
        Scanner sc = new Scanner(System.in);
        temp=sc.nextFloat();
        temp=((temp-32)*5)/9;
        System.out.println("Temperture in celsius   "  + temp);
    }
}
