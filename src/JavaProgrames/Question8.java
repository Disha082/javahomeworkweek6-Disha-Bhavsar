package JavaProgrames;
//8. Write a program to calculate the area of a triangle.

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int base;
        int height;
        int area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of Triangle:  ");
        base=sc.nextInt();

        System.out.print("Enter the base of Triangle:  ");
        height= sc.nextInt();

        area =(base * height)/2;
        System.out.println("The area of Triangle is "  + area);








    }
}
