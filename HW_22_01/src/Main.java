import java.util.Scanner;

public class Main {
    public static void main(String... args) {

    Scanner scanner = new Scanner(System.in);
    String word = "ехала";
    System.out.println("Привет! Введи свой текст: ");

    String answer = scanner.nextLine();
    answer = answer.replaceFirst(word, "pizza");
    answer = answer.replace(word, "");

    System.out.println(answer);

    }
}



