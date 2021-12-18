package problem_javaPractice;

public class ASCII_Character_in_java {
    public static void main(String[] args) {
        // code is here below for ascii code
        char x =65;
        int i,j,key;
        for (j=2;j<16;j++){
            // this block is for printing the product of j and 16nnnnnnnnnnnnnnnnnnnnnnnnnnnn
            System.out.print(j*16+":");
            for (i=0;i<16;i++){
                //this block is for printing the character
                key = j*16+i;
                System.out.print((char)key+"\t");

            }
            System.out.println();
        }

    }
}
