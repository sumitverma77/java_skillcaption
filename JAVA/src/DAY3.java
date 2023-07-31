import java.util.Scanner;

public class DAY3 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        System.out.print("Enter your age");
        int age = ss.nextInt();
        ss.nextLine(); // Consume the newline character

        System.out.print("Enter your name: ");
        String name = ss.next();

        System.out.println("Hello, "+name+"! You are " +age+" years old.");
        ss.close();
    }
}