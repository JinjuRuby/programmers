package 코딩테스트연습.코딩기초트레이닝;

public class 부분문자열 {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "aabcc";

        int answer = str2.contains(str1) ? 1 : 0;


        System.out.println(answer);
    }
}
