package 코딩테스트연습.정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// *추가* ArrayList 없이도 구현 가능
public class K번째수 {

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        // array를 ArrayList로 옮기기
        List<Integer> list = new ArrayList<>();

        for (int i : array) {
            list.add(i);
        }

        // answer를 ArrayList객체로 생성
        List<Integer> answerList = new ArrayList<>();

        // commands를 필요한 만큼 자르고(sublist에 저장), 오름차순으로 정렬 후, answerList에 k번째 수를 저장
        // *주의*
        // sublist에 저장할 때 list와 참조값을 공유하기 때문에 새로운 객체를 생성해야 한다
        for (int[] command : commands) {
            List<Integer> sublist = new ArrayList<>(list.subList((command[0] - 1), command[1]));
            sublist.sort(null);

            answerList.add(sublist.get(command[2] - 1));
        }

        // answerList를 int배열로 전환
        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        System.out.println(Arrays.toString(answer));
    }
}
