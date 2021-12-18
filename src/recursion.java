public class recursion {
    public static void main(String[] args) {
        print(0);
    }
    static void print(int n){

        if(n==5){
            System.out.print(5);
        }
        System.out.println(n);
        print(n+1);
    }
}
