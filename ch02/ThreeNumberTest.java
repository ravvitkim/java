package ch02;

import java.util.Scanner;

public class ThreeNumberTest {
    // 세수를 차례로 입력받아요.
    // 가장 큰 수와 작은 수를 출력합니다.
    static Scanner sc = new Scanner(System.in);
    //위에 적은 스캐너를 공용으로 사용하려고
    public static void main(String[]args) {
        int a;
        int b;
        int c;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        System.out.println("세 수를 차례로 입력하세요");
        // 처음입력값을 a에 넣어준다.

        maxValue = sc.nextInt();
        minValue = maxValue;
        // 두번째 수를 a에 입력받는다.
        a = sc.nextInt();
        //세번쨰 수를 b에 입력받는다.
        b = sc.nextInt();
        c = sc.nextInt();
        if (a>b) {
            maxValue = a;
            minValue = b;
        }else {
            maxValue = b;
            minValue = a;
        }
        if (c > maxValue){
            maxValue = c;
        }
        //c가maxvalue보다크면 c->maxvalue
        //c가minvalue보다크면 c->minvalue
        if(c < minValue){
            minValue = c;
        }
        System.out.println("Max :" + maxValue);
        System.out.println("Max :" + minValue);
    }
}
