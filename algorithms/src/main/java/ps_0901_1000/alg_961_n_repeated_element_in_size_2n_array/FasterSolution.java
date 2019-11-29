package ps_0901_1000.alg_961_n_repeated_element_in_size_2n_array;

public class FasterSolution {

    public int repeatedNTimes(int[] A) {
        int[] count = new int[10000];
        for (int i : A) {
            count[i]++;
            if (count[i] != 1) {
                return i;
            }
        }

        return -1;
    }
}
