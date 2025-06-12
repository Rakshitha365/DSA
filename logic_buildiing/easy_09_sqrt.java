import java.util.*;

public class easy_09_sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getSquareRootIter(n));
        System.out.println(getSquareRoot(n));
        System.out.println(getSquareRootPow(n));
        System.out.println(getSquareRootBinarySearch(n));
        sc.close();
    }

    public static int getSquareRootIter(int n)
    {
        int res = 1;
        while(res * res <= n)
        {
            res++;
        }
        return res - 1;
    }

    public static int getSquareRootBinarySearch(int n)
    {
        int low = 1;
        int high = n;
        int res = 1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(mid * mid <= n) 
            {
                res = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }

        return res;
    }

    public static int getSquareRoot(int n)
    {
        int res = (int) Math.sqrt(n);
        return res;
    }
    
    public static int getSquareRootPow(int n)
    {
        return (int) Math.pow(n,0.5);
    }
}
