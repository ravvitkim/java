package quiz02;

import java.util.Scanner;

public class JuminCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //주민번호 13자리를 문자로 입력받기
        System.out.printf("주민번호 입력하세요(단,-제외)");
        String input = sc.next();
        //문자배열로 바꾸기
        String[] arrayinput = input.split("");
        //문자->숫자배열로 저장할 정수배열을 선언ㅇ
        int[] juminNumber = new int[arrayinput.length];


         //출력확인
        for (String x: arrayinput){
            System.out.println(x);
        }
        //문자배열을 숫자배열로 변경
        for (int i = 0; i<arrayinput.length; i++){
            juminNumber[i] = Integer.parseInt(arrayinput[i]);
        }
        //주민번호 확인하기
        //1.각 배열 요소의 2,3,4,5,6,7,8,9,2,3,4,5를 곱한다,
        //모두더한다.

        int sum = 0;
        for (int i = 0; i< juminNumber.length-1; i++){
            if (i<=7){
                sum = sum + juminNumber[i]*(i+2);
            }else{
                sum = sum + juminNumber[i]*(i-6);
            }
        }
        //위 조건에 맞는 합이 sum에 들어간다.
        //2.sum을 11로 나눈 나머지
        sum = sum % 11;
        //3.11-sum
        sum = 11-sum;
        //4sum을 10으로 나눈나머지
        sum =sum %10;
        //5.13번째와 비교하기
        if (sum == juminNumber[12]){
            System.out.println("맞아요");
        }else{
            System.out.println("틀려요");
        }



}
}

//public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String jumin = sc.next();
//        String[] strJumin = jumin.split("");
//        for (String x : strJumin) {
//            System.out.println(x);
//        }
//        // 숫자로 바꿔줘양
//        int[] juminNumber = new int[strJumin.length];
//        for (int i = 0; i < juminNumber.length; i++) {
//            juminNumber[i] = Integer.parseInt(strJumin[i]);
//        }
//        int sum=0;
//        for (int i = 0; i<11; i++){
//            if (i<=7){
//                sum = sum +(juminNumber[i]*(i+2));
//            }else {
//                sum = sum +(juminNumber[i]*(i+6));
//            }
//        }

//#※ 주민번호 처리 알고리즘
//
//ⓐ 주민번호 13자리 중 맨 마지막 자리를 제외한 각각의 자리에 2,3,4,5,6,7,8,9,2,3,4,5를 곱해서 더한다
//
//ⓑ 그 값을 11로 나눈 나머지를 취한다. (mod)
//
//ⓒ 그 값을 11에서 뺀다.
//
//ⓓ 다시 10으로 나눈 나머지를 취한다.
//
//ⓔ 마지막 값과 같으면 올바른 주민번호
//
//배열에 14자리 주민번호를 넣고, 해당 알고리즘 수행 후
//
//맞는 주민번호이면 “올바른 주민번호입니다.” 출력
//틀린 주민번호이면 “잘못된 주민번호입니다.” 출력

