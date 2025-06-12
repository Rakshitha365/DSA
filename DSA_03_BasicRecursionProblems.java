import java.util.*;

public class DSA_03_BasicRecursionProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name = sc.next();
        printNameNTimes(n, name);
        printLinearly(n);
        System.out.println();
        printReverse(n);
        System.out.println();
        sumOFN(n,0);
        System.out.println(sumOFN2(n));
        System.out.println(factorial(n));
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr, 0, n-1);
        System.out.println(checkPalindrome(name, 0, name.length()-1));
        System.out.println(fib(n));
    }

    public static void printNameNTimes(int n, String name)
    {
        if(n == 0) return;
        System.out.println(name);
        printNameNTimes(n-1, name);
    }

    public static void printLinearly(int n)
    {
        if(n == 0) return;
        printLinearly(n-1);
        System.out.print(n + " ");
    }
    
    public static void printReverse(int n)
    {
        if(n == 0) return;
        System.out.print(n + " ");
        printReverse(n-1);
    }

    
    public static void sumOFN(int n, int sum)
    {
        if(n == 0){
            System.out.println(sum);
            return;
        } 
        sumOFN(n-1, sum+n);
    }
    
    
    public static int sumOFN2(int n)
    {
        if(n == 0) return 0;
        return n + sumOFN2(n-1);
    }

    public static int factorial(int n)
    {
        if(n == 0 || n == 1) return 1;
        return n * factorial(n-1);
    }

    public static void reverseArray(int[] arr, int left, int right)
    {
        if(right <= left)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArray(arr, left+1, right-1);
    }

    public static boolean checkPalindrome(String s, int left, int right)
    {
        if(right <= left) return true;
        if(s.charAt(left) != s.charAt(right)) return false;
        return checkPalindrome(s, left+1, right-1);
    }

    public static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2); // time complexity : O(2^n) space complexity : O(n)
    }
}
