package JavaProgrames;
/*5. Write a program for a calculator with addition, subtraction, multiplication
        and division methods all with parameters and use string concatenation
        methods.(Note: Two static and Two instance methods.)*/

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        Question5 obj = new Question5();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:  ");
        int a = sc.nextInt();

        System.out.println("Enter second number:  ");
        int b = sc.nextInt();

        obj.addition(a, b);
        obj.subtraction(a, b);
        multiplication(a, b);
        divison(a, b);
    }

    public void addition(int a, int b) {
        System.out.println("Addition of two number is :" + (a + b));
    }

    public void subtraction(int a, int b) {
        int x = a - b;
        System.out.println("Sutraction :" + x);
    }

    public static void multiplication(int a, int b) {
        int i = a * b;
    }

    public static void divison(int a, int b) {
        int z = a / b;
        System.out.println("division  : " + z);
    }
    }







