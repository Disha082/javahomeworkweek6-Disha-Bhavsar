package JavaProgrames;
/* 14.Write a Java program to print the area and perimeter of a rectangle.
        Test Data:
        Width = 5.5 Height = 8.5
        Expected Output:
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20*/

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width;
        double height;
        double area;
        double perimeter;

        System.out.println("Enter Width of Rectangle:   ");
        width =sc.nextDouble();
        System.out.println("Enter height of Rectangle:   ");
        height =sc.nextDouble();

        area=width * height;
        perimeter= 2*(width + height);

        System.out.println("The Area of Rectangle is:  " + area);
        System.out.println("The Perimeter of Rectangle is:  "    + perimeter);



            }




    }

