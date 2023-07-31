import java.util.Scanner;

public class DAY4 {
    public static void main(String[] args) {
        int a,b;
       Scanner ss= new Scanner(System.in);
        System.out.println("Enter first number");
       a=ss.nextInt();
        System.out.println("Enter second number");
       b=ss.nextInt();
        System.out.println("greater number is " + (a>b ? a:b ));
    }
}
