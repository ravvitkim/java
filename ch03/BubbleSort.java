package ch03;

public class BubbleSort {
    public static void main(String[] args) {
        //배열 초기화
        int[] data ={9,8,2,4,3};
        //출력
        System.out.printf("초기배열:");
        for (int i = 0; i< data.length; i++){
            System.out.printf(String.valueOf((data[i]) + " "));
        }
        System.out.println();
        //버블정렬시작
        for (int i = 1; i<data.length; i++){
            for (int j = 0; j<data.length -i; j++){
                //비교해서 앞이 크면 바꾸기
                if (data[j]>data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
            //회전결과출력
            System.out.println(i+"회전:");
            for (int k=0; k< data.length; k++){
                System.out.printf((data[k])+" ");
            }
            System.out.println();
        }
    }
}


//3회전에서 끝내기?
