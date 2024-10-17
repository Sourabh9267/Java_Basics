// Example: Single parameter, no parentheses required
interface Greet {
    String sayHello(String name);
}

public class LambdaExample1 {
    public static void main(String[] args) {
        Greet greet = name -> "Hi " + name;
        System.out.println(greet.sayHello("Sourabh"));
    }
}
