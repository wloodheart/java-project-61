package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Cli.welcomeByName(Cli.ask("May I have your name?"));
    }
}
