package quiz02;

import java.util.Arrays;

public class quiz7 {
    public static void main(String[] args) {

        int[] lottoNumber = new int[6];
        int i =0;
        while (i<6){
            //중복여부 체크하는 플래그
            boolean flag = false;


            //로또번호하나생성
            int num =(int)(Math.random()*45)+1;
            // 같은 번호가 있는지 확인
            for (int j=0; j<lottoNumber.length; j++){
                if (num==lottoNumber[j]){
                    flag = true;
                    break;
                }
            }
            // 새로 생성한 값이 있는지 확인
            if (flag == false){
                lottoNumber[i] = num;
                System.out.println(num);
                i++;
            }else {
                flag=false;
            }
        }
    }
}


//        int[] nums = new int[6];
//
//        for (int i = 0; i<6; i++){
//            int x = (int)(Math.random()*45)+1;
//            nums[i] = x;
//            System.out.println(nums[i]);
//
//        }

//동일한 값 어떻게 처리?

//flag 사용법 기억하기~