import java.util.*;

public class basic_02_multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        iterative(n);
        recursive(n,1);
        sc.close();
    }

    public static void iterative(int n)
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
    
    public static void recursive(int n, int i)
    {
        if(i == 11)
        {
            return;
        }
        System.out.println(n + " * " + i + " = " + (n*i));
        recursive(n,i+1);
    }
}
