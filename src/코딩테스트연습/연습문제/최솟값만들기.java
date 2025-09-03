package 코딩테스트연습.연습문제;

import java.util.Arrays;

public class 최솟값만들기 {

    public static void main(String[] args) {

        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length - (i + 1)];

            System.out.println(A[i]);
            System.out.println(B[i]);
            System.out.println();
        }

        System.out.println(answer);

    }
}
