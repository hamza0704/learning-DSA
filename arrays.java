import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Now you can use 'in' to read input, e.g.:
        // int x = in.nextInt();
        // String s = in.nextLine();
        // int[] rno = new int[5];
        // int[] rno2 = {23,44,56,77,88};
        // String[] arr = new String[4];
        // System.err.println(arr[0]);
        int[] arr= new int[5];
        arr[0] = 10;
        arr[1] = 20;    
        arr[2] = 30;    
        arr[3] = 40;
        arr[4] = 50;
        System.out.println(arr[3]);
        for (int i =0; i<arr.length; i++){
            arr[i]= in.nextInt();
        }
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }       
    }
}
