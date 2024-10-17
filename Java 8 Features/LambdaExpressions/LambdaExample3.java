// Example: Type inference, no need to specify the type of `name`
interface Greet {
    String sayHello(String name);
}

public class LambdaExample3 {
    public static void main(String[] args) {
        Greet greet = name -> "Hi " + name; // No explicit type for 'name'
        System.out.println(greet.sayHello("Sourabh"));
    }
}
