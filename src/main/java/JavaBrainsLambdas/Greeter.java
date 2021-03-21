package JavaBrainsLambdas;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting greeting = new HelloWorldGreeting();
        greeter.greet(greeting);

        Greeting greetingFunction = () -> System.out.println("Hey");
        MyLambda m = (int a, int b) -> a + b;
        m.foo(3, 4);

        //inner class implementation
        Greeting myLambdaGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hey Awesome Person");
            }
        };

        myLambdaGreeting.perform();
        greeter.greet(greetingFunction);
        greeter.greet(myLambdaGreeting);
    }




    interface MyLambda {
        int foo(int a, int b);
    }
}
