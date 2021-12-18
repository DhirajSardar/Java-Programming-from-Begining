public class user_defined_function {
    public static void main(String[] args) {
        try {
            // to use the exceotion we have to create the object of exception class
            // throw an exception
            throw  new Myexception();

        }
        catch (Myexception ex){
            System.out.println("caught");
            System.out.println(ex.getMessage());

        }
    }
}
// class for contoining exception
class Myexception extends Exception{

}
