import java.util.*;

public class DSA_02_BasicMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getCountDigits(n));
        System.out.println(getCountDigits2(n));
        System.out.println(getReverse(n));
        System.out.println(checkPalindrome(n));
        System.out.println(validAmstrong(n));
        printDivisors(n);
        System.out.println(checkPrime(n));
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
        sc.close();
    }

    public static int getCountDigits(int n)
    {
        int count = 0;
        int temp = n;
        while(temp != 0)
        {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static int getCountDigits2(int n)
    {
        return (int)(Math.log10(n) + 1);
    }
    
    public static int getReverse(int n)
    {
        int rev = 0;
        int temp = n;
        while(temp != 0)
        {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        return rev;
    }

    public static boolean checkPalindrome(int n)
    {
        int rev = getReverse(n);
        if(rev == n) return true;
        return false;
    }

    public static boolean validAmstrong(int n)
    {
        int temp = n;
        int amstrong = 0;
        while(temp != 0)
        {
            int d = temp % 10;
            amstrong += d*d*d;
            temp /= 10;
        }
        if(amstrong == n) return true;
        return false;
    }

    public static void printDivisors(int n)
    {
        for(int i = 1; i*i <= n; i++)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
                if((n / i) != i)
                {
                    System.out.print((n/i) + " ");
                }
            }
        }
        System.out.println();
    }

    public static boolean checkPrime(int n)
    {
        if(n == 1) return false;
        for(int i = 2; i*i <= n; i++)
        {
            if(n % i == 0) return false;
        }
        return true;
    }

    // euclidean algorithm
    // gcd(a,b) = gcd(a-b,b) where a > b
    public static int gcd(int a, int b)
    {
        while(a > 0 && b > 0)
        {
            if(a > b) a = a % b;
            else b = b % a;
        }

        if(a == 0) return b;
        return a;
    }
}
