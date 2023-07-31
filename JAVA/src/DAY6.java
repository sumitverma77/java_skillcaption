import java.util.Scanner;

public class DAY6 {
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        //Write a Java program that uses a for loop to print out the numbers from 1 to 10.
        System.out.println("Printing number from 1 to 10");
        for (int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
        //Then, write another program that uses a while loop to print out the even numbers between 1 and 20.
        System.out.println("Printing  all even numbers from 1 to 20");
        int i=1;
        while(i<=20)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
            i++;
        }
        //write a program that uses a do-while loop to prompt the user to enter a number between 1 and 10, and keeps prompting until a valid number is entered.
     int val=0;
        do
     {
         System.out.println("Enter a number between 1 and 10");
         val=ss.nextInt();
if(val>0 && val<=10)
 {  System.out.println("You Entered" + val); }
}
while( !(val>0 && val<=10));
}
}