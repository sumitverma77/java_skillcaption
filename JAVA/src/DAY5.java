import java.util.Scanner;

public class DAY5 {
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        int a,b;
        System.out.println("Enter first Number :");
        a=ss.nextInt();
        System.out.println("Enter seconnd Number :");
        b=ss.nextInt();
        System.out.println("Enter operations (+,-,*,/) :");
        String  operaton;
        operaton=ss.next();
        switch (operaton)
        {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("incorrect operation ! try again ");
        }
    }
}
