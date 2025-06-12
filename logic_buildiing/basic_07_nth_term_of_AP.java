import java.util.*;

public class basic_07_nth_term_of_AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(forLoop(a1, a2, n));
        System.out.println(formula(a1, a2, n));
        sc.close();
    }

    public static int forLoop(int a1, int a2, int n)
    {
        int diff = a2 - a1;
        int term = a1;
        for(int i = 0; i < n-1; i++)
        {
            term += diff;
        }
        return term;
    }

    public static int formula(int a1, int a2, int n)
    {
        return (a1) + (n - 1) * (a2 - a1);
    }
}
