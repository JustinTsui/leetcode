package alg_821_shortest_distance_to_a_character;

public class FasterSolution {

    public int[] shortestToChar(String S, char C) {
        char[] chars = S.toCharArray();
        int[] result = new int[chars.length];

        int left = -10000;
        int right = S.indexOf(C);

        for (int i = 0; i < chars.length; i++) {
            if (i > right) {
                int nextRight = S.indexOf(C, right + 1);
                left = right;
                right = nextRight == -1 ? 10000 : nextRight;
            }

            result[i] = Math.min(i - left, right - i);
        }
        return result;
    }

    public static void main(String[] args) {
        FasterSolution solution = new FasterSolution();
        int[] result = solution.shortestToChar("loveleetcode", 'e');
        System.out.println(result);
    }
}
