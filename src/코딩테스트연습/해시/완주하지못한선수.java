package 코딩테스트연습.해시;

import java.util.*;

public class 완주하지못한선수 {

    public static void main(String[] args) {

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        
        /* // 이 코드는 성능이 O(n^2)이므로 효율적이지 않다

        // 참가자 List형태로 저장
        List<String> participantList = new ArrayList<>(Arrays.asList(participant));

        // 참가자를 순회하면서 완주한 사람들 제거
        for (String value : completion) {
            participantList.remove(value);
        }

        System.out.println(participantList);

        // 완주하지 못한 한 사람 변수에 저장
        String answer = participantList.get(0);
        System.out.println(answer);
        
         */



    }
}
