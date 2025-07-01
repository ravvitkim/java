package quiz;

import java.util.Scanner;

public class quiz06 {
    public static void main(String[] args) {
        //문제6. 두 정수 A와 B를 차례로 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        //- 입력(intA, intB) (A > 0, B < 10)
        //
        //- 예제 입력
        //첫 번째 값을 입력하세요 :
        //7
        //두 번째 값을 입력하세요 :
        //9
        //
        //- 출력
        //첫째 줄에 A+B를 출력한다.
        //
        //7 + 9 = 16
        int number1 = 0;
        int number2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 값을 입력하세요 :");
        number1 = sc.nextInt();
        System.out.println("두 번째 값을 입력하세요 :");
        number2 = sc.nextInt();

        System.out.println(number1+number2);

    }
}
