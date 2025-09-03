package 코딩테스트.커넥트웨이브;

import java.util.Arrays;
import java.util.HashMap;

public class Q1 {
    public static void main(String[] args) {

        int[][] v = {{1,4}, {3,4}, {3, 10}};

        HashMap<Integer, Integer> obl1 = new HashMap<>();
        HashMap<Integer, Integer> obl2 = new HashMap<>();

        for (int[] arrayA : v) {
            obl1.put(arrayA[0], obl1.getOrDefault(arrayA[0], 0) + 1);
            obl2.put(arrayA[1], obl2.getOrDefault(arrayA[1], 0) + 1);
        }

        int x = 0;
        int y = 0;

        for (Integer integer : obl1.keySet()) {
            if (obl1.get(integer) % 2 != 0) {
                x = integer;
            }
        }

        for (Integer integer : obl2.keySet()) {
            if (obl2.get(integer) % 2 != 0) {
                y = integer;
            }
        }

        int[] result = new int[]{x, y};

        System.out.println(Arrays.toString(result));

    }
}
