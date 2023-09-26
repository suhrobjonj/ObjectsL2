
public class Student {


    // instance variables
    private String name;
    private double height;


    // constructor
    public Student(String n, double h) {
        name = n;
        height = h;
    }


    // method that introduces the Student
    public void introduce() {


        if (height >= 5.8) {
            System.out.println("Hello my name is " + name + ", I am " + height + "ft tall, and I am a jock!");
        } else {
            System.out.println("Hello my name is " + name + ", I am " + height + "ft shwort :(");
        }
    }


}
