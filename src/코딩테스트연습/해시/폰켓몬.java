package 코딩테스트연습.해시;

import java.util.*;

public class 폰켓몬 {

    public static void main(String[] args) {

        int[] nums = {3, 1, 2, 3};

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int answer = Math.min((nums.length / 2), set.size());

        System.out.println(answer);



    }
}
