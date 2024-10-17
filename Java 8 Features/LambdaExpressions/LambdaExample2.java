// Example: Single return statement, no curly braces needed
interface Greet {
    String sayHello(String name);
}

public class LambdaExample2 {
    public static void main(String[] args) {
        Greet greet = name -> "Hi " + name;
        System.out.println(greet.sayHello("Sourabh"));
    }
}
