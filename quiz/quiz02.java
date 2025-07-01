package quiz;

import java.util.Scanner;

public class quiz02 {
    public static void main(String[] args) {
        //문제2. 10부터 1까지의 수를 출력하세요. (단, 숫자가 3일 때는 출력하지 마세요)
        //      for와 do~while 문 두 문법을 사용해서 만드세요.
        //

        for (int i = 10; i>=1; i--){
            if (i==3){
                continue;
            }else {
                System.out.println(i);
            }
        }

    }
}
//do {
//            sum = sum + i;
//            i = i + 1;
//        }while (i<=10);
//        System.out.println(sum);
