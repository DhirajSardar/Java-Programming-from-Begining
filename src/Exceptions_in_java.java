public class Exceptions_in_java {
    public static void main(String[] args) {

        //System.out.println(arr[10]);
        try {
            int arr[]={8,9,10,22};
            System.out.println(arr[9]);
        }
        catch (Exception e){
            System.out.println("something went wrong!!");
        }
        finally {
            System.out.println("Finally,the Try and Catch is completed");
        }

        }
}
