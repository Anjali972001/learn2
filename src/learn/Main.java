package learn;

public class Main {
    // Simple method inside the class.

    public static void main(String[] args) {
	sum();
    /*
    Suppose if we  want to repeat the code base again and again then we need to call the method again.
       example - sum();
                 sum(); and these brackets are used to call the method.
     */
    }
    static void sum()
    {
        int a= 10;
        int b = 20;
        int sum= a+b;
        System.out.println("sum of two number is : "+ sum);
    }
}
