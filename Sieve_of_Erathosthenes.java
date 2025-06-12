import java.util.Arrays;

public class Sieve_of_Erathosthenes
{
    public static void main(String[] args)
    {
        int n = 20;
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for(int p = 2; p * p < n; p++)
        {
            if(isPrime[p])
            {
                for(int i = p+1; i < n+1; i++)
                {
                    if(i % p == 0)
                    {
                        isPrime[i] = false;
                    }
                }
            }
        }

        for(int i = 2; i < n; i++)
        {
            if(isPrime[i])
            {
                System.out.print(i + " ");
            }
        }
    }
}

/*
 * Steps:
 * 1. create a boolean array is_prime[0...n]
 * 2. Initialize it to true
 * 3. Starting from p = 2 mark all multiples of p(except p) as false
 * 4. Move to next number in list, if it is still marked true it is prime. Repeat step 3.
 * 5. continue until p^2 > n
 * 6. all remaining true entries in the array correspond to prime numbers.
 */