package alg_933_number_of_recent_calls;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/number-of-recent-calls/
 */
class RecentCounter {

    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() != null && queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
