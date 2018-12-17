package alg_762_prime_number_of_set_bits_in_binary_representation;

public class FasterSolution {

    public int countPrimeSetBits(int L, int R) {
        int[] primes = new int[]{
                0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1
        };

        int result = 0;

        for (int i = L; i <= R; i++) {
            result += primes[Integer.bitCount(i)];
        }
        return result;
    }
}
