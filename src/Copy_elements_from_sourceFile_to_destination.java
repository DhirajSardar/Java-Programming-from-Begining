
import java.util.ArrayList;
import java.util.Collections;

public class Copy_elements_from_sourceFile_to_destination {
    public static void main(String[] args) {


        ArrayList<String> destination_list;
        destination_list = new ArrayList<>();
        destination_list.add("Ram");
        destination_list.add("Aman");
        destination_list.add("Jilani");
        destination_list.add("Mustafa");

        System.out.println("This is the destination list:");
        for (String s : destination_list) {
            System.out.println(s);
        }
        //  creating the source list
        ArrayList<String> source_list =new ArrayList<>();
        source_list.add("Hey");
        source_list.add("Baby");
        source_list.add("Burn");
// copying the elements in destination list
        Collections.copy(destination_list,source_list);
        System.out.println("This is the modified destination list");
        // printing the modified  destination list

        for (String s : destination_list) {
            System.out.println(s);
        }


    }
}
