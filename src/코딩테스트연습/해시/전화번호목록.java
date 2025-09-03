package 코딩테스트연습.해시;

import java.util.Arrays;

public class 전화번호목록 {
    public static void main(String[] args) {

        String[] phone_book = {"119", "97674223", "1195524421"};
        Arrays.sort(phone_book);

        System.out.println("phone_book = " + Arrays.toString(phone_book));

        boolean answer = true;
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
            } else {
                answer = true;
            }
        }

        System.out.println("answer = " + answer);

    }
}
