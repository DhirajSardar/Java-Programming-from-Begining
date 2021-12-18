 import java.io.*;
 import java.util.Vector;
 import  java.util.Vector.*;
public class Vectors_in_java {
    public static void main(String[] args) {
        int n= 5;
        Vector<Integer> v= new Vector<>(n);
        for (int i= 0;i<n;i++){
            v.add(i);

        }
        System.out.print(v);
        v.remove(0);
        System.out.println();
        System.out.print(v);
        System.out.println();
        // printing the elements one by one
        for (int i=0;i<v.size();i++){
            System.out.print(+v.get(i)+" ");
        }
    }
}
