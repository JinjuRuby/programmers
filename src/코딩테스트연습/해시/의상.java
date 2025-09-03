package 코딩테스트연습.해시;

import java.util.ArrayList;
import java.util.HashMap;

public class 의상 {
    public static void main(String[] args) {

        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        HashMap<String, ArrayList<String>> clothesMap = new HashMap<>();

        for (String[] cloth : clothes) {
            clothesMap.putIfAbsent(cloth[1], new ArrayList<>());
            clothesMap.get(cloth[1]).add(cloth[0]);
        }

        System.out.println(clothesMap);
    }
}
