package problem_javaPractice;
import java.math.*;

public class samplePROGRAM {
    public static void main(String[] args) {
        // finding the roots of quadratic equations
        int a,b,c;
        a=7;
        b=3;
        c=4;

        if ((b*b-4*a*c)>0){
            System.out.println("the roots are real and distinct");

        }if ((b*b==4*a*c)){
            System.out.println("the roots are real and perfect root");

        }if ((b*b-4*a*c)<0){
            System.out.println("the roots are imaginary");

        }



    }
}
