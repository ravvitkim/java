package quiz;

import java.util.Scanner;

public class quiz15 {
    public static void main(String[] args) {
        //문제 15. 다음을 구현하세요.
        //
        //
        //처음 프로그램이 시작되면....
        //
        //======================
        //메뉴를 선택하세요
        //======================
        //1. 인사하기 2. 춤추기 3. 밥먹기  4. 종료하기
        //
        //각 번호를 선택하면..
        //
        //안녕하세요
        //삐끼삐끼 춤입니다.
        //맛나게 먹었습니다.
        //프로그램을 종료합니다.
        //
        //1~3번을 선택하면 해당 메시지를 보여주고
        //다시 메뉴선택화면을 보여줍니다.
        //
        //4번을 선택하면 메시지를 출력하고 멈춥니다.
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("======================");
            System.out.println("메뉴를 선택하세요");
            System.out.println("======================");
            System.out.println("1. 인사하기 2. 춤추기 3. 밥먹기  4. 종료하기");
            int number = sc.nextInt();
            if (number == 1){
                System.out.println("안녕하세요");
            } else if (number == 2) {
                System.out.println("삐끼삐끼 춤입니다.");
            } else if (number == 3) {
                System.out.println("맛나게 먹었습니다.");
            } else if (number == 4){
                System.out.println("프로그램을 종료합니다.");
                return;
            } else {
                System.out.println("다시시작합니다.");
            }
        }

    }
}

//  switch(number){
//  case 1 :
//     System.out.println("안녕하세요");
//     break; }