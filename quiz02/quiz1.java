package quiz02;

import java.util.Arrays;

public class quiz1 {
    public static void main(String[] args) {

        int nums [] = {};
        int max = Integer.MAX_VALUE;
        int maxIndex=0;

        int min = Integer.MIN_VALUE;
        int minIndex=0;

        for (int i = 0; i <nums.length; i++){
            if (nums[i]>max){
                max = nums[i];
                maxIndex = i;
            }
            if (nums[i]<min){
                min = nums[i];
                minIndex = i;
            }
        }
        System.out.println("최댓값:"+max+"인덱스:"+maxIndex);


        //문제 1. 최댓값과 인덱스찾기
        //
        //9개의 서로 다른 자연수
        //3, 29, 38, 12, 57, 74, 40, 85, 61
        //가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째
        //수인지를 구하는 프로그램을 작성하시오.
        //
        //이 주어지면, 이들 중
        //최댓값은 85이고, 이 값은 8번째 수이다.
        //최솟값은 3이고, 이 값은 1번째 수이다.
        //
        //출력 :
        //
        //최댓값 : 85, 인덱스 : 7
        //최솟값 : 3, 인덱스 : 1
        //

//        int nums [] = {};
//        int min = Integer.MIN_VALUE;
//        int max = Integer.MAX_VALUE;
//
//        for (int i =0; i<nums.length; i++){
//            if (nums[i]>max){
//
//            }
//        }


        //

//        for (int i = 0; i<9; i++){
//            System.out.println(nums[i]);
//        }

//        int max = Arrays.stream(nums).max().getAsInt();
//        int min = Arrays.stream(nums).min().getAsInt();

//        System.out.println("min :: " + min + " max :: " + max);

    }
}
