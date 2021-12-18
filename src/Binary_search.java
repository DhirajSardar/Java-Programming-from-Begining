import java.util.ArrayList;
import java.util.Collections;

public class Binary_search {
    public static void main(String[] args) {
        ArrayList<Integer> Number = new ArrayList<>();
        Number.add(78);
        Number.add(90);
        Number.add(89);
        Number.add(34);
        Number.add(38);
        Collections.sort(Number);
        System.out.println(" Sorting in the ascending order");
        for (int i=0;i<Number.size();i++){
            System.out.println(Number.get(i));
        }

        System.out.println("Doing the binary search which will return the position of the number  after sorting the number");
        System.out.println("The index of the 34 is " +Collections.binarySearch(Number,90));

    }
}
