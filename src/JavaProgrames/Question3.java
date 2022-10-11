package JavaProgrames;
/*Write a Java programme using the following steps.
        3.1 Declare one instance and one static variable.
        3.2 Declare one instance method.
        3.3 Declare one static method.
        3.4 Call both instance and static variables into both instance and static methods inside the
        print statement.
        3.5 Declare the Main method.
        3.6 Call both instance and static methods into the Main method and run the programme*/


public class Question3 {
    int w = 50;  //instance variable
    static int v = 70;//static variable
    public static void main(String[] args) {
        Question3 pat = new Question3(); //crearted object
        pat.cat();
        dog();

    }
    public void cat() {
        System.out.println(w);
        System.out.println(v);

    }
    public static void dog() {
        Question3 tiger =new Question3();
        System.out.println(tiger.w); //instance variable
        System.out.println(v); // static variable

    }


}
