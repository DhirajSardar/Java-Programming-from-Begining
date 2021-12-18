  import java.util.Collections;
import java.util.ArrayList;

public class practice_inJava {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
           items.add("Banana");
           items.add("PineApple");
           items.add("Apple");
           // Adding the elements
           Collections.addAll(items,"Ram","Shyam","Raju");
          for (int i =0;i<items.size();i++){
              System.out.print("\t"+items.get(i));
          }
          // Sorting the arraylist in the ascending order
        Collections.sort(items);
          // for printing the sorted arraylist
        System.out.println();
        System.out.print("This the sorted arraylist in the ascending order");
        for (int i=0;i<items.size();i++){
            System.out.print("\t"+items.get(i));
        }
         // sortting the arraylist in the reverse style
        System.out.println();
        Collections.sort(items,Collections.reverseOrder());
        System.out.print("This is the sorted items in the reverse order");
        System.out.println();
        for (int i=0; i<items.size();i++){
            System.out.print("\t"+items.get(i));
        }

    }
}
