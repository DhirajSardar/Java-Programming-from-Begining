package javaBegining;

public class Multidimensional_array {
    public static void main(String[] args) {
        int []arr= {3,5,7};
        // creation of multidimensional array
        int [][]Multidimensional_array ={{1,2,4},{5,6,7}};
        for (int i:arr){
            System.out.println(i);
        }
        // Accessing the multidimensional array
        System.out.println(Multidimensional_array[0][2]);
    }
}
