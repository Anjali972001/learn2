package learn;

import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
    int ans = sum2();
        System.out.println("Sum of two number is:  "+ ans);
    }
    static int sum2()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = input.nextInt();
        System.out.println("Enter the number : ");
        int b = input.nextInt();
        int sum= a+b;
        return sum;// return means function ends

    }
}
