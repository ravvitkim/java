package ch01;
// 두 수를 바꾸는 거.
public class BasicJava {
    public static void main(String[] args) {
        // 두 수 a, b를 바꾸려면
        // 빈 공간(=빈 변수)을 만든다. -> 정수 타입 => 이름:temp(=빈자리)
        // 0. 바꾸기 전 a와 b를 출력해 본다.
        // 1. a를 temp에 넣는다.
        // 2. b를 a로 보낸다.
        // 3. temp를 b로 보낸다.
        // 4. 바꾼 이후 a와 b를 출력해 본다.
        // ----------------------------
    // a 와 b 변수와 temp를 선언하고, 초기값을 준다.
    //---1지점 -> 10, 20이 안 찍힘, a조차 존재하지 않아서
    int a = 10;
    int b = 20;
    int temp;
    //---2지점 -> 여기서 출력해야 함
    // 바꾸기 전 a,b를 출력
    System.out.println("a=" + a + ",b=" + b);
    //두 수 a, b를 바꾸는 작업을 합니다.
    temp = a; // a 값을 temp에 할당(넣는다.)
    a = b;
    b = temp;
    // 두 수를 바꾼 뒤 출력
    System.out.println("a=" + a + ",b=" + b);

    }
}
