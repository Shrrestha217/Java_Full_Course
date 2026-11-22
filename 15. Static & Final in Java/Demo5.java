package StaticFinal;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}

//Run code in the terminal with command:
// javac Demo5.java
// java StaticFinal.Demo5 arg1 arg2 arg3