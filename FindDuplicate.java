public class FindDuplicate {
    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,3,2,1};
        sort(arr);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(arr));

    }
    static void sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i] != i+1){
                int correct = arr[i]-1;
                if(arr[i] != arr[correct]){ 
                    sort(arr, i, correct);
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
    }
    static void sort(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        sort(arr);
    }
}
    