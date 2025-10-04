
import java.util.Arrays;

public class Changeval {
    public static void main(String[] args) {
        
        int[] arr = {1,3,6,8,9};
        change(arr);
        System.out.println(Arrays.toString(arr)); 
    }
    static void change(int[] nums){
        nums[0] = 10;
        
    }
}
