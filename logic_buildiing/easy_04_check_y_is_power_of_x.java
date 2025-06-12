import java.util.*;

public class easy_04_check_y_is_power_of_x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(isPowerRepeatedMulti(x,y));
        System.out.println(isPowerBinarySearch(x,y));
        System.out.println(isPowerLog(x, y));
        sc.close();
    }

    public static boolean isPowerRepeatedMulti(int x, int y)
    {
        if(x == 1) return (y == 1);
        long pow = 1;
        while(pow < y)
        {
            pow *= x;
        }
        return (pow == y);
    }

    public static boolean isPowerBinarySearch(int x, int y)
    {
        if(x == 1) return (y==1); // if x = 1 and y = 1 then true
        if(y==1) return true;
        long pow = x;
        while(pow < y)
        {
            pow *= pow; // if x = 10 and y = 1000 then pow = 10000
        }
        if(pow == y) return true; // 10000 > 1000
        long low = x, high = pow; // low = 10 and high = 10000
        while(low <= high)
        {
            long mid = low + (high - low) / 2; // 10 + (9900 / 2) = 10 + 4950 = 4960
            long res = (long) Math.pow(x, Math.log(mid) / Math.log(x)); // 
            if(res == y) return true;
            if(res < y) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

    public static boolean isPowerLog(int x, int y)
    {
        if(x == 1) return (y == 1);

        double res = Math.log(y) / Math.log(x);
        double epsilon = 1e-10;
        return Math.abs(res - Math.round(res)) < epsilon;
    } 
}
