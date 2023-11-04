package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String ask(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.next();
    }

    public static void welcomeByName(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
