import java.util.Scanner;
public class datatypes {
    public static void main(String[] args){
        int age = 25; //integer datatype
        System.out.println(age);
        double salary = 5348.5885; //double datatype
        System.out.println(salary);
        char initial = 'A'; //character datatype
        System.out.println(initial);
        Scanner rollno1 = new Scanner(System.in);//taking input in java
        System.out.println("enter your rollno: ");
        int rollno = rollno1.nextInt();
        System.out.println("your roll number is: " + rollno);
    }
}
 