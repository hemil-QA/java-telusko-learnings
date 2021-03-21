
interface Phone {
    void call();

    static void message() {
        System.out.println("sent");
    }
}

class AndroidPhone implements Phone {

    @Override
    public void call() {
        System.out.println("Calling");
    }
}

public class LambdasAndStreams {

    public static void main(String[] args) {
        Phone p = new AndroidPhone();
        p.call();
        Phone.message();
    }
}
