import java.util.*;

public class basic_04_swap_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Original before swap");
        System.out.println("a = " + a + ", b = " + b);
        swapWithThirdVariable(a,b);
        arithmeticOperators(a, b);
        XOR(a, b);
        System.out.println("Original before swap");
        System.out.println("a = " + a + ", b = " + b);
        sc.close();
    }

    public static void swapWithThirdVariable(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap");
        System.out.println("a = " + a + ", b = " + b);
    }
    
    
    public static void arithmeticOperators(int a, int b)
    {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap");
        System.out.println("a = " + a + ", b = " + b);
    }
    
    
    public static void XOR(int a, int b)
    {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap");
        System.out.println("a = " + a + ", b = " + b);
    }

    
}
