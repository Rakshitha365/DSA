import java.util.*;

public class easy_01_sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(iterative(n));
        System.out.println(recursive(n));
        System.out.println(inputString(String.valueOf(n)));
        sc.close();
    }

    public static int iterative(int n)
    {
        int temp = n;
        int d,sum = 0;
        while(temp != 0)
        {
            d = temp % 10;
            sum += d;
            temp = temp / 10;
        }
        return sum;
    }

    public static int recursive(int n)
    {
        if(n == 0) return 0;
        return (n % 10) + recursive(n / 10);
    }

    public static int inputString(String s)
    {
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            sum += s.charAt(i) - '0';
        }
        return sum;
    }
}
