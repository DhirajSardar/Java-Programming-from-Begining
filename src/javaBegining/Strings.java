package javaBegining;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String str ="Hello";
        String str1 = "Hell";
        System.out.println(str.toUpperCase());
        System.out.println(str.indexOf('l'));
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.compareTo(str1));
        System.out.println(str1.contentEquals(str));
        System.out.println(str1);
    }
}
