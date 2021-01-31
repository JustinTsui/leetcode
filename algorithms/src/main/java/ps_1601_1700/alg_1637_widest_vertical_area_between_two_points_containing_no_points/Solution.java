package ps_1601_1700.alg_1637_widest_vertical_area_between_two_points_containing_no_points;

/**
 * https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points
 */
public class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int[] point : points) {
            min = Math.min(min, point[0]);
            max = Math.max(max, point[0]);
        }
        if (min == max) {
            return 0;
        }
        int diff = max - min;
        boolean[] notBlank = new boolean[points.length + 1];
        int[] maxs = new int[points.length + 1];
        int[] mins = new int[points.length + 1];

        for (int[] point : points) {
            long bucket = ((long) (point[0] - min) * (long) points.length) / (long) diff;
            int intBucket = (int) bucket;
            mins[intBucket] = notBlank[intBucket] ? Math.min(mins[intBucket], point[0]) : point[0];
            maxs[intBucket] = notBlank[intBucket] ? Math.max(maxs[intBucket], point[0]) : point[0];
            notBlank[intBucket] = true;
        }

        int result = 0;
        max = maxs[0];
        for (int i = 1; i <= points.length; i++) {
            if (notBlank[i]) {
                result = Math.max(result, mins[i] - max);
                max = maxs[i];
            }
        }
        return result;
    }
}
