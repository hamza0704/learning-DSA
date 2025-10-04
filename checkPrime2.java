public class checkPrime2 {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        isPrime(n, primes); // Call the method
    }

    static void isPrime(int n, boolean[] primes) {
        // false means prime, true means not prime 
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true; // Mark as not prime
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
