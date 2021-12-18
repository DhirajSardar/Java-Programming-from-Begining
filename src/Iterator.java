
import java.util.*;

public class Iterator {
    public static void main(String[] args) {
        ArrayList<String> myCars =new ArrayList<String>();
        myCars.add("BMW");
        myCars.add("Royce Royal");
        myCars.add("Farari");
        java.util.Iterator<String> it =myCars.iterator();
        System.out.println(it.next());
    }
}
