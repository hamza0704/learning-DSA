import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);    
        list.add(5);    
        list.add(6);
        list.add(7);
        list.contains(3); // Check if the list contains the element 3
        System.out.println(list);
        System.out.println("Size of the list: " + list.size());
    }
}
