public class practice_set {
    public static void main(String[] args) {
       String srt1="String is immutable";
       String str2 = new String("String is immutable");
       String str3= new String("Integers are not immutable");
       StringBuffer str4= new StringBuffer("Integers are not immutable");

       int result;
        result = srt1.compareTo(str2);
        System.out.println(result);

    result = str2.compareTo(str3);
        System.out.println(result);
        // compareToIgnoreCase
        result = srt1.compareToIgnoreCase(str2);
        System.out.println(result);
        boolean result1 =srt1.contentEquals(str2);
        System.out.println(result1);
        boolean result2 =srt1.contentEquals(str3);
        System.out.println(result2);
        int hashcode = str2.hashCode();
        System.out.println(hashcode);
        System.out.println( str3.indexOf('o'));

    }
}