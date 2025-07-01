package quiz;

import java.util.Scanner;

public class quiz05 {
    public static void main(String[] args) {
        //문제5. money 변수 3780원의 금액이 있습니다.
        //  이를 다음과 같은 결과가 나오도록 출력합니다.
        //
        //
        //1000원 : 3개
        //남은금액 : 780원
        //500원 : 1개
        //남은금액 : 280원
        //100원 : 2개
        //남은금액 : 80원
        //10원 : 8개
        //남은금액 : 0원

        Scanner sc = new Scanner(System.in);
        int number = 3780;
        int restCoin = 0;
        System.out.println("1000원 : " + (number/1000));
        restCoin = number % 1000;
        System.out.println("남은 금액 : " + restCoin);

        System.out.println("500원 : " + (restCoin/500) );
        restCoin = restCoin % 500;
        System.out.println("남은 금액 : " + restCoin );

    }
}
