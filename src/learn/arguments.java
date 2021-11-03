package learn;

public class arguments {
    public static void main(String[] args) {
     int ans = sum(12,14);
        System.out.println(ans);
    }
    // pass the value of the number when calling the number.
    static int sum(int a , int b)
    {
        int c= a+b;
        return c;
    }
}
