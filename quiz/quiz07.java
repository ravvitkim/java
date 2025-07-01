package quiz;

import java.util.Scanner;

public class quiz07 {
    public static void main(String[] args) {
        //문제7. 두 정수 A와 B를 차례로 입력받은 다음, 두 수 A와 B 사이의 모든 정수값을 더해
        // 출력하는 프로그램을 작성하시오.
        //
        //- 예제 입력 1
        //첫 번째 값을 입력하세요 :
        //2
        //두 번째 값을 입력하세요 :
        //7
        //
        //- 예제 입력
        //첫 번째 값을 입력하세요 :
        //7
        //두 번째 값을 입력하세요 :
        //2
        //
        //- 출력
        //27

        int a =0;
        int b =0;
        int temp = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 값을 입력하세요 :");
        a = sc.nextInt();
        System.out.println("두 번째 값을 입력하세요 :");
        b = sc.nextInt();
        if (a > b) {
            temp = a;
            a = b;
            b = temp;

        }

        for (int i = a; a<=b; a++){
            System.out.println(a + "");
        }
        System.out.println(a+ b);


    }
}
// A<=i<=B