package learn;

import java.util.Scanner;

public class anjali {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name :");
        String name = input.next();
        String answer = myGreet(name);
        System.out.println(answer);


    }
    static String myGreet(String name){
        String greeting = "Hello " + name;
        return greeting;
    }
}
