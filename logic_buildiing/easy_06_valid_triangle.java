import java.util.*;

public class easy_06_valid_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(isValidTriangleAdd(a, b, c)) System.out.println("Valid");
        else System.out.println("Invalid");
        if(isValidTriangleSubtract(a, b, c)) System.out.println("Valid");
        else System.out.println("Invalid");
        sc.close();
    }

    public static boolean isValidTriangleAdd(int a, int b, int c)
    {
        if(((a + b) < c) || ((a + c) < b) || ((b + c) < a)) return false;
        return true;
    }
    
    public static boolean isValidTriangleSubtract(int a, int b, int c)
    {
        if ((Math.abs(a - b) > c) || (Math.abs(a - c) > b) || (Math.abs(b - c) > a)) return false;
        return true;
    }


}
