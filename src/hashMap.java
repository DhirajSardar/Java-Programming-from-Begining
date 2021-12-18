import java.util.HashMap;
import java.util.SortedMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities =new HashMap<String,String>();
        capitalCities.put("kathmandu","Nepal");
        capitalCities.put("Tokyo","Japan");
        capitalCities.put("Dhaka","Bangladesh");
        capitalCities.put("New Delhi","India");
        //Accessing the elements in Hashmap
        System.out.println(capitalCities.get("kathmandu"));
        System.out.println(capitalCities);
        System.out.println("The key of the given hashmap is:");
        System.out.println(capitalCities.keySet());
        System.out.println("The values of key is :");

        System.out.println(capitalCities.values());
        System.out.println("The length of the capitalcities is :"+capitalCities.size());
    }
}
