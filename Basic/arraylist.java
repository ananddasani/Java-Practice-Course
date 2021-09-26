import java.util.ArrayList;

public class arraylist {
    public static void main(String [] args ){
        //arraylist is the dynamic array we need not to specify the size of the array it grows and shrinks accordingly with requierment
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(12);
        arr.add(52);
        arr.add(42);
        arr.add(92);
        arr.add(62);
        arr.add(72);
        arr.add(92);
        arr.add(2);
        arr.add(1);

        System.out.println(arr);//this is going to return the array

        int [] arr1 = {1,2,3,4,5,6,8};
        for (int i : arr1) {
            System.out.println(i);

        }

    }
}
