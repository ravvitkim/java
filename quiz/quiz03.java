package quiz;

import java.util.Scanner;

public class quiz03 {
    public static void main(String[] args) {
        //문제3. 1부터 20까지의 수를 출력하세요. (단, 2의 배수일 때만 출력하세요)
        //      for 문법 사용
        Scanner sc = new Scanner(System.in);
        for (int i = 2; i <= 20; i++) {
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
