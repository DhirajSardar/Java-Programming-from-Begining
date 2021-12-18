import  java.util.HashSet;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> myhashSet= new HashSet<>();
        System.out.println("HashSet is the collection of the unique elements in set.Though 98 is repeated twice we the hash set repeat for one time only");
        myhashSet.add(78);
        myhashSet.add(72);
        myhashSet.add(48);
        myhashSet.add(98);
        myhashSet.add(90);
        System.out.println(myhashSet);

        System.out.println(myhashSet.clone());
        // To check wheather 98 is present in the Hashset or not
        System.out.println(myhashSet.contains(98));
        myhashSet.stream().limit(10);

    }
}
