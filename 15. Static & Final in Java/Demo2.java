package StaticFinal;

public class Demo2 {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.PI);

        final int a;
        a = 10; //This is allowed only once, if you declare a variable then it will be initialized once
        System.out.println(a);
    }
}

class Random {
    final double PI;

    Random() {
        this.PI = 3.14;
    }
}

class Mathematics {
    static final double PI = 3.14;

    // static {
    //     PI = 3.14;
    // }
}