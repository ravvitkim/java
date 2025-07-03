package quiz02;

import java.util.Arrays;

public class quiz7 {
    public static void main(String[] args) {

        int[] nums = new int[6];

        for (int i = 0; i<6; i++){
            int x = (int)(Math.random()*44)+1;
            nums[i] = x;
            System.out.println(nums[i]);

        }

//        System.out.println(Arrays.toString(nums));
//        for (int i = 0; i<6; i++) {
//            System.out.println(nums[i]);
//        }

    }
}
