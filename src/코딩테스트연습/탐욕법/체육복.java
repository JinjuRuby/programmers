package 코딩테스트연습.탐욕법;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 체육복 {

    public static void main(String[] args) {

        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        Arrays.sort(lost);
        Arrays.sort(reserve);

        List<Integer> lostList = new ArrayList<>();
        for (int l : lost) lostList.add(l);
        List<Integer> reserveList = new ArrayList<>();
        for (int r : reserve) reserveList.add(r);

        // 1) 겹치는 학생 제거
        List<Integer> overlap = new ArrayList<>();
        for (int l : lost) {
            if (reserveList.contains(l)) {
                overlap.add(l);
            }
        }
        for (int o : overlap) {
            lostList.remove(Integer.valueOf(o));
            reserveList.remove(Integer.valueOf(o));
        }

        // 2) 대여 처리
        for (int l : new ArrayList<>(lostList)) { // 복사본 순회
            if (reserveList.contains(l - 1)) {
                reserveList.remove(Integer.valueOf(l - 1));
                lostList.remove(Integer.valueOf(l));
            } else if (reserveList.contains(l + 1)) {
                reserveList.remove(Integer.valueOf(l + 1));
                lostList.remove(Integer.valueOf(l));
            }
        }

        int answer =  n - lostList.size();
        System.out.println(answer);
    }
}
