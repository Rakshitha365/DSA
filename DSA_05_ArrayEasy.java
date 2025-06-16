import java.util.*;

public class DSA_05_ArrayEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,4,7,7,5};
        System.out.println("Largest in " + Arrays.toString(arr) + ": " + getLargestEle(arr));
        System.out.println("Second Largest in " + Arrays.toString(arr) + ": "+ getSecondLargestEle(arr));
        System.out.println(Arrays.toString(arr) + " is sorted: " + isSorted(arr));
        int[] arr1 = {1,1,2,3,4};
        System.out.println(Arrays.toString(arr1) + " is sorted: " + isSorted(arr1));
        int[] arr2 = {1,1,2,2,2,3,3};
        System.out.println("Original Array: " + Arrays.toString(arr2));
        System.out.println(removeDuplicates(arr2));
        System.out.println("After removing duplicates: " + Arrays.toString(arr2));
        int[] arr3 = {1,2,3,4,5};
        System.out.println("Original Array: " + Arrays.toString(arr3));
        leftRotate(arr3);
        System.out.println("After left rotate: " + Arrays.toString(arr3));
        int[] arr4 = {1,2,3,4,5,6,7};
        System.out.println("Original Array: " + Arrays.toString(arr4));
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        leftRotateByK(arr4, k);
        System.out.println("After left rotate: " + Arrays.toString(arr4));
        int[] arr5 = {1,0,2,3,2,0,0,4,5,1};
        System.out.println("Original Array: " + Arrays.toString(arr5));
        zerosToLeft(arr5);
        System.out.println("After left rotate: " + Arrays.toString(arr5));
        System.out.print("Target to find: ");
        int num = sc.nextInt();
        System.out.println(Arrays.toString(arr) + " has " + num + " at: " + linearSearchTarget(arr,num));
        int[] arr6 = {1,1,2,3,4,4,5};
        int[] arr7 = {2,3,4,4,6};
        System.out.println("Union of " + Arrays.toString(arr6) + " and " + Arrays.toString(arr7));
        findUnion(arr6,arr7);
        System.out.println("Intersection of " + Arrays.toString(arr6) + " and " + Arrays.toString(arr7));
        findIntersection(arr6,arr7);
        System.out.println("Intersection of " + Arrays.toString(arr6) + " and " + Arrays.toString(arr7));
        findIntersectionWithDuplicates(arr6,arr7);

        int[] arr8 = {1,2,4,5};
        System.out.println("Missing number in " + Arrays.toString(arr8) + " is: " + getMissingNum(arr8));

        int[] arr9 = {1,1,0,1,1,1,0,1,1};
        System.out.println("Maximum Consecutive Ones in " + Arrays.toString(arr9) + " is: " + getMaxConsecOnes(arr9));

        int[] arr10 = {1,1,2,2,4};
        System.out.println("Single Occurrence number in " + Arrays.toString(arr10) + " is: " + elementAppearsOnce(arr10));

        int[] arr11 = {1,2,3,4,5};
        System.out.println("Longest Subarray with sum " + k + " in " + Arrays.toString(arr11) + " is: ");
        longestSubArraySumK(arr11, k);
        sc.close();
    }

    // Time Complexity : O(N)
    public static int getLargestEle(int[] arr)
    {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
    
    // Time Complexity : O(N)
    public static int getSecondLargestEle(int[] arr)
    {
        int max = arr[0];
        int smax = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                smax = max;
                max = arr[i];
            }
            if(arr[i] > smax && arr[i] != max) smax = arr[i];
        }
        return smax;
    }

    // Time Complexity : O(N)
    public static boolean isSorted(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i+1] < arr[i]) return false;
        }
        return true;
    }


    // Time Complexity : O(N)
    public static int removeDuplicates(int[] arr)
    {
        if(arr.length == 0) return 0;
        int i = 0;
        for(int j = 1; j < arr.length; j++)
        {
            if(arr[i] != arr[j]) 
            {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }

    // Time Complexity: O(N)
    public static void leftRotate(int[] arr)
    {
        int ele = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = ele;
    }


    // Time Complexity: O(2N) = O(N)
    public static void leftRotateByK(int[] arr, int k)
    {
        int l = arr.length;
        k = k % l;
        reverseArray(arr,0,l-k-1);
        reverseArray(arr,l-k,l-1);
        reverseArray(arr,0,l-1);
    }

    public static void reverseArray(int[] arr, int low, int high)
    {
        while(low < high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    // Time Complexity : O(N)
    public static void zerosToLeft(int[] arr)
    {
        int i = 0;
        for(int j = 0; j < arr.length; j++)
        {
            if(arr[j] != 0)
            {
                swap(arr,i,j);
                i++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    // Time Complexity : O(N)
    public static int linearSearchTarget(int[] arr, int target)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target) return i;
        }
        return -1;
    }

    public static void findUnion(int[] arr1, int[] arr2)
    {
        // // Time Complexity : O(N1 + N2)   Space Complexity : O(N1 + N2)
        // Set<Integer> hs = new HashSet<>();
        // for(int i = 0; i < arr1.length; i++)
        // {
        //     hs.add(arr1[i]);
        // }
        // for(int i = 0; i < arr2.length; i++)
        // {
        //     hs.add(arr2[i]);
        // }
        // System.out.println(hs);

        // Time Complexity : O(N1 + N2)
        int i = 0;
        int j = 0;
        List<Integer> ans = new ArrayList<>();
        while(i < arr1.length && j < arr2.length)
        {
            int lastAdded = ans.isEmpty() ? Integer.MIN_VALUE : ans.get(ans.size() - 1);
            if(arr1[i] < arr2[j]) 
            {
                if(arr1[i] != lastAdded) ans.add(arr1[i]);
                i++;
            }
            else if(arr2[j] > arr1[i])
            {
                if (arr1[i] != lastAdded) ans.add(arr2[j]);
                j++;
            }
            else
            {
                if (arr1[i] != lastAdded) ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        while (i < arr1.length) {
            int lastAdded = ans.isEmpty() ? Integer.MIN_VALUE : ans.get(ans.size() - 1);
            if (arr1[i] != lastAdded)
                ans.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            int lastAdded = ans.isEmpty() ? Integer.MIN_VALUE : ans.get(ans.size() - 1);
            if (arr2[j] != lastAdded)
                ans.add(arr2[j]);
            j++;
        }
        System.out.println(ans);
    }

    public static void findIntersection(int[] arr1, int[] arr2)
    {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length)
        {
            int lastAdded = res.isEmpty() ? Integer.MIN_VALUE : res.get(res.size() - 1);
            if(arr1[i] > arr2[j])
            {
                j++;
            }
            else if(arr1[i] < arr2[j])
            {
                i++;
            }
            else
            {
                if(arr1[i] != lastAdded) res.add(arr1[i]);
                i++;
                j++;
            }
        }

        System.out.println(res);
    }


    // Time Complexity : O(N1 + N2)
    public static void findIntersectionWithDuplicates(int[] arr1, int[] arr2)
    {
        int[] temp = new int[1001];
        List<Integer> res = new ArrayList<>();
        Arrays.fill(temp,0);
        for(int n : arr1)
        {
            temp[n]++;
        }
        for(int n : arr2)
        {
            if(temp[n] != 0)
            {
                res.add(n);
                temp[n]--;
            }
        }

        System.out.println(res);
    }


    public static int getMissingNum(int[] arr)
    {
        int n = arr.length;

        // // Time Complexity : O(N^2)
        // for(int i = 1; i <= n; i++)
        // {
        //     int flag = 0;
        //     for(int j = 0; j < n; j++)
        //     {
        //         if(arr[j] == i) 
        //         {
        //             flag = 1;
        //             break;
        //         }
        //     }
        //     if(flag == 0) return i;
        // }


        // // Time Complexity : O(N)   Space Complexity : O(N)
        // int[] hashArray = new int[n + 2];
        // Arrays.fill(hashArray, 0);
        // for(int num : arr)
        // {
        //     hashArray[num]++;
        // }
        // for(int i = 1; i < n+1; i++)
        // {
        //     if(hashArray[i] == 0) return i;
        // }


        // // Time Complexity : O(N)
        // int sum = 0;
        // for(int num : arr)
        // {
        //     sum += num;
        // }
        // return (((n+1) * (n+2)) / 2) - sum;

        // // Time Complexity : O(N)
        int ans = 0;
        int i = 1;
        for(int num : arr)
        {
            ans ^= num;
            ans ^= i;
            i++;
        }
        ans ^= i;
        return ans;
    }


    public static int getMaxConsecOnes(int[] arr)
    {
        int res = 0;
        int count = 0;
        for(int num : arr)
        {
            if(num == 1) count++;
            else
            {
                res = (res > count) ? res : count;
                count = 0;
            }
        }
        res = (res > count) ? res : count;
        return res;
    }

    public static int elementAppearsOnce(int[] arr)
    {
        // Time Complexity : O(2N)
        // int[] hashArray = new int[100001];
        // for(int num : arr)
        // {
        //     hashArray[num]++;
        // }
        // for(int i: arr)
        // {
        //     if(hashArray[i] == 1) return i;
        // }

        // Space Complexity : O(N)
        // Map<Integer, Integer> hm = new HashMap<>();
        // for(int i : arr)
        // {
        //     hm.put(i, hm.getOrDefault(i, 0) + 1);
        // }
        // for(int i : hm.keySet())
        // {
        //     if(hm.get(i) == 1) return i;
        // }

        // // Time Complexity : O(N)
        int ans = 0;
        for (int i : arr) {
            ans ^= i;
        }
        return ans;
    }


    public static void longestSubArraySumK(int[] arr, int k)
    {
        int n = arr.length;
        int[] res = new int[2];
        int max = 0;


        // // Time Complexity : O(n^2)
        // for(int i = 0; i < n-1; i++)
        // {
        //     int sum = 0;
        //     for(int j = i; j < n && sum <= k; j++)
        //     {
        //         sum += arr[j];
        //         if(sum == k) 
        //         {
        //             int diff = j - i + 1;
        //             if(diff > max)
        //             {
        //                 max = diff;
        //                 res[0] = i;
        //                 res[1] = j;
        //             }
        //         }
        //     }
        // }
        // System.out.println(max);
        // System.out.println(Arrays.toString(res));

        // // Prefix Sum
        // List<Integer> prefixSum = new ArrayList<>();
        // int sum = 0;
        // for(int i = 0; i < n; i++)
        // {
        //     sum += arr[i];
        //     prefixSum.add(sum);
        //     if(sum == k)
        //     {
        //         if(max < i+1)
        //         {
        //             max = i+1;
        //             res[0] = 0;
        //             res[1] = i;
        //         }
        //     }
        //     int rem = sum - k;
        //     if(prefixSum.contains(rem))
        //     {
        //         int j = 0;
        //         for(int l = 0; l < prefixSum.size(); l++)
        //         {
        //             if(prefixSum.get(l) == rem)
        //             {
        //                 j = l;
        //                 break;
        //             }
        //         }
        //         if(max < i-j)
        //         {
        //             max = i-j;
        //             res[0] = j+1;
        //             res[1] = i;
        //         }
        //     }
        // }

        // // variable length sliding window
        // Time Complexity : O(2*N)
        int left = 0;
        int sum = 0;
        int right = 0;
        while(right < n)
        {
            sum += arr[right];
            while(sum > k && left <= right)
            {
                sum -= arr[left];
                left++;
            }
            if(sum == k)
            {
                int diff = right - left + 1;
                if(diff > max)
                {
                    max = diff;
                    res[0] = left;
                    res[1] = right;
                }
            }
            right++;
        }

        System.out.println(max);
        System.out.println(Arrays.toString(res));
    }
}
