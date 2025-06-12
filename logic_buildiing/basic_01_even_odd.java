import java.util.*;

class basic_01_even_odd
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(method_1(n));
        System.out.println(method_2(n));
        System.out.println(method_3(n));
        sc.close();
    }

    public static boolean method_1(int n) {
        if(n % 2 == 0) return true;
        return false;
    }
    
    public static boolean method_2(int n) {
        if((n & 1) == 0) return true;
        return false;
    }
    
    public static boolean method_3(int n) {
        if(n == (n >> 1) << 1) return true;
        return false;
    }
}