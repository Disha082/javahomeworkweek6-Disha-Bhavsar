package JavaProgrames;
/*Write a Java program to add two binary numbers.
        Input Data:
        Input first binary number: 10
        Input second binary number: 11
        Expected Output:
        Sum of two binary numbers: 101*/

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        String num1 = "10";
        String num2 = "11";
        String sum;

        int a1 = Integer.parseInt(num1,2); //converting binary string to binary number using java API
        int a2 = Integer.parseInt(num2,2);//converting binary string to binary number using java API
        int total = a1 + a2;// performing sum of two binary numbers
        sum = Integer.toBinaryString(total);//converting binary number to binary string java API

        System.out.println("sum of two binary number:  " +  sum);



    }
}
