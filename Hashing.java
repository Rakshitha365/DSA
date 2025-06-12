import java.util.*;
// Hashshing -> prestoring and fetching
public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,2,1,3};
        System.out.print("Enter number to find(1-100): ");
        int target = sc.nextInt();
        System.out.print("Enter String s: ");
        String s = sc.next();
        System.out.print("Enter target Character: ");
        char c = sc.next().charAt(0);
        System.out.println(bruteForce(arr,target));
        System.out.println(precompute(arr,target));
        System.out.println(findCharacter(s,c));
        System.out.println(mapMethod(arr,target));
    }

    public static int bruteForce(int[] arr, int target)
    {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target) count++;
        }
        return count;
    }

    public static int precompute(int[] arr, int target)
    {
        int[] hash = new int[101];
        for(int i = 0; i < arr.length; i++)
        {
            hash[arr[i]]++;
        }
        return hash[target];
    }

    public static int findCharacter(String s, char c)
    {
        int[] chars = new int[26];
        String s2 = s.toLowerCase();
        for(int i = 0; i < s2.length(); i++)
        {
            chars[s2.charAt(i) - 'a']++;
        }
        return chars[Character.toLowerCase(c) - 'a'];
    }

    public static int mapMethod(int[] arr, int target)
    {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++)
        {
            hm.put(arr[i], hm.getOrDefault(hm,0)+1);
        }
        return hm.get(target);
    }
}
