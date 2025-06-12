// package patterns;
import java.util.*;
public class DSA_01_Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern_1(n);
        System.out.println();
        pattern_2(n);
        System.out.println();
        pattern_3(n);
        System.out.println();
        pattern_4(n);
        System.out.println();
        pattern_5(n);
        System.out.println();
        pattern_6(n);
        System.out.println();
        pattern_7(n);
        System.out.println();
        pattern_8(n);
        System.out.println();
        pattern_9(n);
        System.out.println();
        pattern_10(n);
        System.out.println();
        pattern_11(n);
        System.out.println();
        pattern_12(n);
        System.out.println();
        pattern_13(n);
        System.out.println();
        pattern_14(n);
        System.out.println();
        pattern_15(n);
        System.out.println();
        pattern_16(n);
        System.out.println();
        pattern_17(n);
        System.out.println();
        pattern_18(n);
        System.out.println();
        pattern_19(n);
        System.out.println();
        pattern_20(n);
        System.out.println();
        pattern_21(n);
        System.out.println();
        pattern_22(n);
        sc.close();
    }

    public static void pattern_1(int n)
    {
        /* for n = 4;
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern_2(int n) {
        /* for n = 4
         * *
         * * *
         * * * *
         * * * * *
         */

        for(int i = 1; i <= n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    
    public static void pattern_3(int n) {
        /* for n = 4
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         */

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    
    public static void pattern_4(int n) {
        /* for n = 4
         * 1
         * 2 2
         * 3 3 3
         * 4 4 4 4
         */

        for(int i = 1; i <= n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
    
    public static void pattern_5(int n) {
        /* for n = 4
         * * * * *
         * * * *
         * * *
         * *
         */

        for(int i = 0; i <= n; i++)
        {
            for(int j = 0; j < (n-i); j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void pattern_6(int n) {
        /*
         * for n = 4
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern_7(int n) {
        /*
         * for n = 4
         *       * 
         *     * * *
         *   * * * * *
         * * * * * * * *
         */

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*(i) - 1; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    
    
    public static void pattern_8(int n) {
        /*
         * for n = 4
         * * * * * * * *
         *   * * * * *
         *     * * *
         *       * 
         */

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 2*(i-1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*(n-i) + 1; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    
    
    public static void pattern_9(int n) {
        /*
         * for n = 4
         *       * 
         *     * * *
         *   * * * * *
         * * * * * * * *
         * * * * * * * *
         *   * * * * *
         *     * * *
         *       * 
         */

        pattern_7(n);
        pattern_8(n);
    }

    public static void pattern_10(int n) {
        /*
         * for n = 4
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         */

        pattern_2(n);
        pattern_5(n-1);
    }

    public static void pattern_11(int n) {
        /*
         * for n = 4
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         */

        int start = 1;
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) start = 1;
            else start = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = start ^ 1;
            }
            System.out.println();
        }
    }
    
    
    public static void pattern_12(int n) {
        /*
         * for n = 4
         * 1             1
         * 1 2         2 1
         * 1 2 3     3 2 1
         * 1 2 3 4 4 3 2 1
         */

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            for(int k = 0; k < 4*(n-i); k++)
            {
                System.out.print(" ");
            }
            for(int l = i; l >= 1 ; l--)
            {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
    
    
    public static void pattern_13(int n) {
        /*
         * for n = 4
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         */

        int ele = 1;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++)
            {
                System.out.print(ele + " ");
                ele++;
            }
            System.out.println();
        }
    }
    
    
    public static void pattern_14(int n) {
        /*
         * for n = 4
         * A
         * A B
         * A B C
         * A B C D
         */

        for(int i = 0; i < n; i++)
        {
            for(char ch = 'A'; ch <= 'A' + i; ch++)
            {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }
    
    
    public static void pattern_15(int n) {
        /*
         * for n = 4
         * A B C D
         * A B C
         * A B
         * A
         */

        for (int i = 0; i < n; i++) {
            for(char ch = 'A'; ch <= 'A' + n - i - 1; ch++)
            {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    
    
    public static void pattern_16(int n) {
        /*
         * for n = 4
         * A
         * B B
         * C C C
         * D D D D
         */

        for (int i = 0; i < n; i++) {
            char initial = (char)('A' + i);
            for(int j = 0; j <= i; j++)
            {
                System.out.print(initial + " ");
            }
            System.out.println();
        }
    }
    
    
    public static void pattern_17(int n) {
        /*
         * for n = 4
         *       A
         *     A B A
         *   A B C B A
         * A B C D C B A
         */

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < 2*(n-i-1); j++)
            {
                System.out.print(" ");
            }
            for(char c = 'A'; c <= 'A' + i; c++)
            {
                System.out.print(c + " ");
            }
            for(char ch = (char)('A' + i - 1); ch >= 'A' && i != 0; ch--)
            {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    
    
    public static void pattern_18(int n) {
        /*
         * for n = 4
         * D
         * C D
         * B C D
         * A B C D
         */

        for (int i = 0; i < n; i++) {
            char initial = (char)('A' + (n-i-1));
            for(int j = 0; j <= i; j++)
            {
                System.out.print(initial + " ");
                initial = (char) (initial + 1);
            }
            System.out.println();
        }
    }
    public static void pattern_19(int n) {
        /*
         * for n = 4
         * * * * * * * * *
         * * * *     * * *
         * * *         * *
         * *             *
         * *             *
         * * *         * *
         * * * *     * * *
         * * * * * * * * *
         */

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n-i; j++)
            {
                System.out.print("* ");
            }
            for(int k = 0; k < 4*(i) && i != 0; k++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < n-i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            for(int k = 0; k < 4*(n-i-1) && i != n-1; k++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern_20(int n) {
        /*
         * for n = 4
         * *             *
         * * *         * *
         * * * *     * * *
         * * * * * * * * *
         * * * *     * * *
         * * *         * *
         * *             *
         */

        for (int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            for(int k = 0; k < 4*(n-i-1); k++)
            {
                System.out.print(" ");
            }
            for(int l = 0; l <= i; l++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print("* ");
            }
            for(int k = 0; k < 4*(i); k++)
            {
                System.out.print(" ");
            }
            for(int l = 1; l <= n-i; l++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern_21(int n) {
        /*
         * for n = 4
         * ****
         * *  *
         * *  *
         * ****
         */

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
            {
                if(i == 0 || i == n-1 || j == 0 || j == n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern_22(int n) {
        /*
         * for n = 4
         * 4 4 4 4 4 4 4
         * 4 3 3 3 3 3 4
         * 4 3 2 2 2 3 4
         * 4 3 2 1 2 3 4
         * 4 3 2 2 2 3 4
         * 4 3 3 3 3 3 4
         * 4 4 4 4 4 4 4
         */

        for (int i = 0; i <= 2*(n) - 2; i++) {
            for(int j = 0; j <= 2*(n) - 2; j++)
            {
                int top = i;
                int left = j;
                int bottom = (2*(n) - 2) - i;
                int right = (2*(n) - 2) - j;
                System.out.print(n - Math.min(Math.min(left, right), Math.min(top, bottom)));
            }
            System.out.println();
        }
    }
    
}
