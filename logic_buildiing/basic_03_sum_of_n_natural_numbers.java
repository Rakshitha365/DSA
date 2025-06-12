import java.util.*;

public class basic_03_sum_of_n_natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(iterative_method(n));
        System.out.println(recursive_method(n));
        System.out.println(formula(n));
        sc.close();
    }
    
    public static int iterative_method(int n)
    {
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum += i;
        }
        return sum;
    }
    
    
    public static int recursive_method(int n)
    {
        if(n == 1) return 1;
        return n + recursive_method(n-1);
    }

    public static int formula(int n)
    {
        return (int) (n / 2) * (n + 1);
    }
    
}
