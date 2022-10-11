package JavaProgrames;
/*4. Write a Java programme using the following steps.
        4.1 Declare two instance and two static variables.
        4.2 Declare one instance method.
        4.3 Declare one static method.
        4.4 Call all four instance and static variables into both instance and static methods inside the
        print statement.
        4.5 Declare the Main method.
        4.6 Call both instance and static methods into the Main method and run the programme.*/


public class Question4 {
    int a = 10; //instance variable
    int b = 20; //instance variable
    static int c = 30; //static variable
    static int d = 40; //static variable

    public static void main(String[] args) {
        Question4 van = new Question4();
        van.laxus();
        BMW();
    }

    public void laxus() {
        System.out.println(a);
        System.out.println(b);
        Question4 BMW =new Question4();
        System.out.println(BMW.c);
        System.out.println(BMW.d);
    }

    public static void BMW() {
        Question4 mns = new Question4();
        System.out.println(mns.a);
        System.out.println(mns.b);
        System.out.println(c);
        System.out.println(d);


    }



}