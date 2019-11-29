package ps_0901_1000.alg_973_K_closest_points_to_origin;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * https://leetcode.com/problems/k-closest-points-to-origin/
 */
public class Solution {
    public int[][] kClosest(int[][] points, int K) {
        divideSort(points, 0, points.length - 1, K);
        return Arrays.copyOfRange(points, 0, K);
    }

    private void divideSort(int[][] array, int left, int right, int k) {
        if (left >= right) {
            return;
        }

        int i = left;
        int j = right;

        int dist = distance(array[ThreadLocalRandom.current().nextInt(i, j)]);

        while (i < j) {
            while (i < j && distance(array[i]) < dist) {
                i++;
            }

            while (i < j && distance(array[j]) > dist) {
                j--;
            }
            swap(array, i, j);
        }

        if (k <= i - left + 1) {
            divideSort(array, left, i, k);
        } else {
            divideSort(array, i + 1, right, k - (i - left + 1));
        }
    }

    private int distance(int[] point) {
        return (point[0] * point[0]) + (point[1] * point[1]);
    }

    private void swap(int[][] points, int a, int b) {
        int[] tmp = points[a];
        points[a] = points[b];
        points[b] = tmp;
    }
}
