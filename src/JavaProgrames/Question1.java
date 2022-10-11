package JavaProgrames;

public class Question1 {
    //instance variable
    /*1.1 Declare two instance variables.
 1.2 Declare one instance method.
 1.3 Call both instance variables into the instance method inside the print statement.
 1.4 Declare the Main method.
 1.5 Call the above instance method into the Main method and Run the programme.*/
    int x= 20;
    int z= 30;
    public static void main (String [] args) {
        Question1 dmb =new Question1(); //object
        dmb.y();
    }
    public void y (){
        System.out.println(x);
        System.out.println(z);
    }

}
