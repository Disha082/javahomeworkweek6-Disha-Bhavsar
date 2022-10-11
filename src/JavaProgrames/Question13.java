package JavaProgrames;
/*Write a Java program that takes three numbers as input to calculate and
        print the average of the numbers*/

import java.util.Scanner;
public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter first number:    ");
        num =sc.nextInt();
        System.out.print("Enter secound number:  ");
        num =sc.nextInt();
        System.out.print("Enter third number:    ");
        num =sc.nextInt();
        System.out.print("Average of 3 numbers:    "+"\t" +(num+num+num)/3);





    }
}
