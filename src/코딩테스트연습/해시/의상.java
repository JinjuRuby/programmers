package 코딩테스트연습.해시;

import java.util.*;

public class 의상 {
    public static void main(String[] args) {

        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Map<String, List<String>> map = new HashMap<>();

        for (String[] cloth : clothes) {
            String key = cloth[1];
            String value = cloth[0];

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(value);
        }

        int answer = 1;

        // key마다 안 입을 수도 있기 때문에 경우의 수 1개 추가,
        // 다른 key들도 같이 입을 수 있기 때문에(독립) 곱셈으로 계산,
        // 전부 다 안 입일 수는 없기 때문에 1가지의 경우의 수는 빼준다
        for (List<String> value : map.values()) {
            answer *= (value.size() + 1);
        }

        answer--;

        System.out.println(answer);

    }
}
