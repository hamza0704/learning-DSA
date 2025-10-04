import java.util.ArrayList;
public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;//works as an index value
    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    } 
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    private void resize(){
        int[] temp = new int[data.length * 2];
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull(){
        return size == data.length;
    }
    public int remove(){
        return data[--size];
        
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public  void set(int index, int value){
         data[index] = value;
    }
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        for(int i = 0; i<14; i++){
            list.add(2*i);
        }
        System.out.println(list);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("sdfdvdzgv");
    }
}
