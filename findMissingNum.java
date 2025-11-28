/*Q1 
find the missing number and add it to the array
arr = {3,0,1}
missing number = 2
*/
import java.util.Arrays;
public class findMissingNum {

    public static void main(String[] args){
    int arr[] = {3,0,1};
    int newNum =2;
    findMissing(arr);
    int[] newArr = new  int[arr.length + 1];
    for(int i=0; i<arr.length; i++){
        newArr[i] = arr[i];
    }
    newArr[arr.length] = newNum;
    System.out.println(Arrays.toString(newArr));
    }
};

 void findMissing(int[] newArr){
    int i =0;
    while(i<newArr.length){
         int correct = newArr[i];
            if(arr[i]<arr.length && newArr[i]!= newArr[correct]){
                swap(newArr, i, correct);
            } else{
                i++;
            }
        }
    }

static void swap(int[] arr, int first, int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
}