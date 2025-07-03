package ch03;

public class SelctionSort {
    public static void main(String[] args) {
        //배열 초기화
        int[] data ={4,1,2,5,3};
        //원데이터 출력
        //출력하기
        System.out.printf("data : ");
        for (int x : data){
            System.out.printf(x+ " ");
        }
        System.out.println();

        //정렬처리
        for (int i = 0; i<data.length -1; i++){
            //바꼈는지 확인하는 플래그
            boolean flag = false;
            for (int j = i+1; j< data.length; j++){
                if (data[i]>data[j]){
                    //두개 바꾸기
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                    flag = true; //한번이라도 바꿨으면 true 반환
                }
            }
            //출력하기
            System.out.printf((i+1) + "회전 : ");
            for (int x : data){
                System.out.printf(x+ " ");
            }
            System.out.println();
            //바꾼적인 있는지 확인
            if (flag == false){
                break;
            }
        }
    }
}


//sout ln,f 차이?
