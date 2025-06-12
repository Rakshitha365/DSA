import java.util.*;

public class easy_02_reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(iterative(n));
        System.out.println(recursive(n, 0));
        System.out.println(inputString(String.valueOf(n)));
        sc.close();
    }

    public static int iterative(int n)
    {
        int temp = n;
        int d,rev = 0;
        while(temp != 0)
        {
            d = temp % 10;
            rev = rev * 10 + d;
            temp /= 10;
        }
        return rev;
    }

    public static int recursive(int n, int rev)
    {
        if(n == 0) return rev;
        return recursive(n / 10, rev * 10 + (n % 10));
    }

    public static int inputString(String n)
    {
        int rev = 0;
        for(int i = n.length() - 1; i >= 0; i--)
        {
            rev = rev * 10 + (n.charAt(i) - '0');
        }

        return rev;
    }
}
