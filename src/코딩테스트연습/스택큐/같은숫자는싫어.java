package 코딩테스트연습.스택큐;

import java.util.*;

public class 같은숫자는싫어 {

    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i : arr) {
            if (deque.isEmpty() || !deque.peekLast().equals(i)) {
                deque.addLast(i);
            }
        }

        System.out.println(deque);




    }
}
