package ch02;

import java.util.Scanner;

public class ConfirmGender2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("주민ㄴ번ㄴ호 뒷자리 첫 슛자를 입력하세요");
        int num = sc.nextInt();
        String result;
        if (num < 1 || num > 5) {
            result = "잘 못 입력했어요";
        } else if (num == 5) {
            result = "외국인";
        } else if ((num % 2) == 1) {
            result = "남자";
        }
    }
}
