import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator {
    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n < 1) {
            return primes;
        }

        int candidate = 2;
        while (primes.size() < n) {
            boolean isPrime = true;
            for (int prime : primes) {
                if (candidate % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(candidate);
            }
            candidate++;
        }

        return primes;
    }

    public static void main(String[] args) {
        List<Integer> primes = generatePrimes(10);
        for (int prime : primes) {
            System.out.print(prime + " ");  // Output: First 10 prime numbers
        }
    }
}