import java.util.*;

public class easy_03_primality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrimeSchoolMethod(n));
        sc.close();
    }

    public static boolean isPrimeSchoolMethod(int n)
    {
        if(n <= 1) return false;

        for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeAdvancedSchoolMethod(int n)
    {
        if(n <= 1) return false;

        for(int i = 2; i*i <= n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }


    public static boolean isPrime6k1(int n)
    {
        if(n == 2 || n == 3) return true;
        if( n <= 1 || n % 2 == 0 || n % 3 == 0) return false;
        for(int i = 5; i*i <= n; i += 6)
        {
            if(n % i == 0 || n % (i+2) == 0)
            {
                return false;
            }
        }
        return true;
    }

}
