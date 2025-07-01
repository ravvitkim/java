package quiz;

import java.util.Scanner;

public class quiz08 {
    public static void main(String[] args) {
        //문제 8. 별찍기
        //
        //- 문제
        //첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
        //
        //- 입력
        //정수로 입력받은 값은 출력할 줄 수 이다.
        //출력할 줄 수를 입력받는다.
        //
        //- 출력
        //첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
        //
        //- 예제입력
        //5
        //
        //- 예제출력
        //*
        //**
        //***
        //****
        //*****

        Scanner sc = new Scanner(System.in);
        // 별을 찍어줄 라인수 입력
        int count = sc.nextInt(); // 3

        for (int i = 1; i<=count; i++){
            String star = "";
            for (int j = 1; j<=i; j++ ){
                star = star + "*";
            }
            System.out.println(star);
        }


    }
}


//Scanner sc = new Scanner(System.in);
//        System.out.println("n=?");
//        int number = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i<=number; i++) {
//            for (int j = 1; j<=i; j++) {
//                sum = sum +j;
//            }
//
//        }
//        System.out.println(sum);