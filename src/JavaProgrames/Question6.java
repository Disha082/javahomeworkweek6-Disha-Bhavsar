package JavaProgrames;
/*6. Write a program to enter any radius value of the circle and find out the
        area.(Formula of Area A=PI*r*r).*/
import java.util.Scanner;

public class Question6 {

            public static void main (String[] args){
                double pi = 3.14, area;
                int radius;
                Scanner mark = new Scanner(System.in);
                System.out.println("Enter radius of circle");
                radius = mark.nextInt();
                area = (radius * radius) * pi;
                System.out.println("Area of circle is   "  +  area);
                mark.close();

            }
        }



