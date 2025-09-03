package 코딩테스트연습.월간코드챌린지시즌1;

import java.util.ArrayList;
import java.util.Collections;

public class 두개뽑아서더하기 {

    public static void main(String[] args) {

        int[] numbers = {2, 1, 3, 4, 1};
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (!answer.contains(numbers[i] + numbers[j])) {
                    answer.add(numbers[i] + numbers[j]);
                }
            }
        }

        Collections.sort(answer);

        int[] result = new int[answer.size()];

        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        for (int i : result) {
            System.out.println(i);
        }

    }
}