package javaBegining;

import javax.xml.transform.Source;

public class Array {
    public static void main(String[] args) {
        char [] array={'a','b','c','d','e','f','g'};
        char [] destination=new char[10];
        // copying the elements of array
        System.arraycopy(array,0,destination,1,5);
        System.out.println(new String(destination));
        int flag = 3;
        for (int i =0;i<array.length;i++){
            if (flag==i){
                for (int j=i+1;j<array.length-1;j++){
                    array[i]=array[j];
                    i++;
                }
                System.out.println(array);
            }
        }


    }

}
