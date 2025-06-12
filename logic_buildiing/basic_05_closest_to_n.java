import java.util.*;

public class basic_05_closest_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(closestToN(n, m));
        System.out.println(basedOnQuotient(n, m));
        sc.close();
    }

    public static int closestToN(int n, int m)
    {
        int closest = 0;
        int minDiff = Integer.MAX_VALUE;
        for(int i = n - m; i <= n + m; i++)
        {
            if(i % m == 0)
            {
                int diff = Math.abs(n - i);
                if((diff < minDiff) || (diff == minDiff && Math.abs(i) > Math.abs(closest)))
                {
                    closest = i;
                    minDiff = diff;
                }
            }
        }
        return closest;
    }

    public static int basedOnQuotient(int n, int m)
    {
        int q = n / m;
        int n1 = m * q;
        int n2 = (n * m) > 0 ? m * (q+1) : m * (q-1);
        if(Math.abs(n - n1) < Math.abs(n - n2)) return n1;
        return n2;
    }
}
