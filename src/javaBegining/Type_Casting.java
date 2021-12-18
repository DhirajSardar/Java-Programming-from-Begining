package javaBegining;

public class Type_Casting {
    public static void main(String[] args) {
        int  a= 1;
        String b= "Dhiraj";
        int c = Integer.parseInt(a+b);
        System.out.println(a+b);
        int num =1000;
        String ram="6868";
        // Type casting of String to integer
        int x =Integer.valueOf(ram);
        System.out.println(x);
        // Typecasting  of integer to String
        String y =String.valueOf(num);
        System.out.println(y);
    }
}
