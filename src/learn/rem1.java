package learn;

import java.util.Scanner;

public class rem1 {
    public static void main(String[] args) {
     rem1();
    }
    // taking input from the user.
     static void rem1()
     {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number : ");
         int a = input.nextInt();
         System.out.print("Enter the number : ");
         int b = input.nextInt();
         int sum = a + b;
         System.out.println("the sum of two number is : "+ sum);
     }
}
