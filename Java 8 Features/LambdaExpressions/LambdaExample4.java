// Example: Single statement, no `{}` or `return`
interface Greet {
    String sayHello(String name);
}

public class LambdaExample4 {
    public static void main(String[] args) {
        Greet greet = name -> "Hi " + name; // Single expression
        System.out.println(greet.sayHello("Sourabh"));
    }
}
