import java.util.*;

public class easy_10_Sum_of_Squares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfSquares(n));
        System.out.println(sumOfSquaresFormula(n));
        sc.close();
    }

    public static int sumOfSquares(int n)
    {
        int res = 0;
        for(int i = 1; i <= n; i++)
        {
            res += Math.pow(i,2);
        }
        return res;
    }

    public static int sumOfSquaresFormula(int n)
    {
        return ((n*(n+1)/2)*(((2*n) + 1)/3));
    }
}
