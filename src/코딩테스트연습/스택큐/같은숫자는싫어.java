package 코딩테스트연습.스택큐;

import java.util.*;

//*팁* intValue메서드를 사용하면 int형으로 변환 가능
public class 같은숫자는싫어 {

    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        //int[] arr = {4, 4, 4, 3, 3};

        List<Integer> list = new ArrayList<>();

        // 첫번째 값은 넣고 두번째부터 앞의 값과 비교 후 다리면 list에 add한다
        for (int i : arr) {
            if (list.isEmpty()) {
                list.add(i);
            } else if (!list.get(list.size() - 1).equals(i)) {
                list.add(i);
            }
        }
        
        // list -> Integer배열
        Integer[] integerAnswer = list.toArray(new Integer[0]);

        //Integer배열 -> int배열
        int[] answer = new int[integerAnswer.length];
        
        // int배열에 값 넣기
        for (int i = 0; i < answer.length; i++) {
            answer[i] = integerAnswer[i];
        }

        /*
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).intValue();
        }
        */

        System.out.println(Arrays.toString(answer));

    }
}
