
import java.util.Arrays;

public class bubblesortalgo {
    public static void main(String[] args){

        int[] arr = {5,4,3,2,1}; 
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        for(int i=0; i<arr.length; i++)
        swapped=false;
        {
            for(int j=1; j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }

            /*if you did not swap for the particular 
             value of i that means that the array is sorted 
             then no need to check the rest of the array
            */
            }
        }
    }

}
/*We need 2 pointers i and j 
 Since i will the fixed the pointer and the first 
 element of the array so it is initialized as 0 and
 j will the moving pointer and second element of the arrat
 so it is initialized as 1
 the swapping will be done if the first element is greater than 
 second element
 */
