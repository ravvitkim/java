package quiz02;


import java.util.Scanner;

public class quiz5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {};
        int n = arr.length;

        int tmp;
        for (int i = 1; i < n; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] > arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
                else break;
            }
        }
        System.out.println();
    }
}