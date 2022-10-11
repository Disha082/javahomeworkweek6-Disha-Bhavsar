package JavaProgrames;


import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number");
        a = input.nextInt();
        for (int i=0; i<10; i++){
            System.out.println(a + "*"+(i+1)+ "="+(a*(i+1)));
    }
    }
}
