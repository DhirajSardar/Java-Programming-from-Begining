package javaBegining;
// What is method loading?
// Method Overloading is the way in which 2 or more than 2 method are created of same name with different argument and
//or parameters with same or different date types.
public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading addition = new MethodOverloading();

        // This is for method 1
       Integer d= addition.add(45,67);
        System.out.println(d);
        // This is for method 2
        Integer e = addition.add(45,89,56);
        System.out.println(e);
    }
    // This is method 1
    public Integer add(Integer a, Integer b){
        Integer result =a+b;
        return result;

    }
    // This  is method 2
    public Integer add(Integer a, Integer b, Integer c){
        Integer result = a+b+c;
        return result;
    }
}