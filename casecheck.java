import java.util.Scanner;
public class casecheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Letter: ");
        char ch = input.next().trim().charAt(0);
        // System.out.println(input.next().trim());
        // System.out.println(ch);
        if (ch>= 'a' && ch<= 'z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }

 
        }
    }
//.trim is a function that removes extra leading and trailing spaces
