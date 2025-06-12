public class Euclidean {
    public static int GCD(int a, int b)
    {
        int res = helper(a,b);
        return res;
    }
    public static int helper(int a, int b)
    {
        if(b == 0)
        {
            return a;
        }
        return helper(b, a % b);
    }
    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println(GCD(a,b));
    }
}

/*
 * NOTE: GCD(a,b) * LCM(a,b) = a * b
 * Steps:
 * 1. if b = 0, return a
 * 2. otherwise compute GCD(b,a mod b)
 */