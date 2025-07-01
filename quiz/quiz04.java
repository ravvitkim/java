package quiz;

import java.util.Scanner;

public class quiz04 {
    public static void main(String[] args) {
        //문제4. 임의의 값 n이 주어지면
        //   예를들어 n=5이면
        //   1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5) //
        //   의 결과를 출력하세요.
        Scanner sc = new Scanner(System.in);
        System.out.println("n=?");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<=number; i++) {
            for (int j = 1; j<=i; j++) {
                sum = sum +j;
            }

        }
        System.out.println(sum);
    }
}

//for(int i = 1; i<=9; i++){
//            System.out.println(dan + " * " + i + " = " + (dan * i));
//        }

// n+(n+n+1)+(n+n+1+n+2)
// n+(2n+1)+(3n+3)+
// 1+3+6+10+15 ,n+1씩 증가