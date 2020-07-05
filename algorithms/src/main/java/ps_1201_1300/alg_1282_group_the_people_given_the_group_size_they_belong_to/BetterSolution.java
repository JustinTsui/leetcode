package ps_1201_1300.alg_1282_group_the_people_given_the_group_size_they_belong_to;

import java.util.ArrayList;
import java.util.List;

public class BetterSolution {

    private boolean[] mapped;
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        mapped = new boolean[groupSizes.length];

        for (int index = 0; index < groupSizes.length; index++) {
            int group = groupSizes[index];
            if (!mapped[index]) {
                mapGroup(index, group, groupSizes);
            }
        }

        return result;
    }

    private void mapGroup(int index, int size, int[] group) {
        List<Integer> list = new ArrayList<>();
        while (list.size() < size && index < group.length) {
            if (!mapped[index] && group[index] == size) {
                list.add(index);
                mapped[index] = true;
            }
            index++;
        }
        result.add(list);
    }
}
