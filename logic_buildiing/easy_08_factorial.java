import java.util.*;

public class easy_08_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        System.out.println(factorialRec(n));
        sc.close();
    } 

    public static int factorial(int n)
    {
        int f = 1;
        for(int i = 1; i <= n; i++)
        {
            f *= i;
        }
        return f;
    }

    public static int factorialRec(int n)
    {
        if(n <= 1) return 1;
        return n * factorial(n-1);
    }
}
