package ch01;
// 클래스 변수
class IveMember {
    // 장원영을 표현할 수 있는
    // Properties(Member)-속성
    String name;
    int age;
    double height;

    // 메서드(Method)
        void dance() {
            System.out.println("장원영이 춤춰요");
        }
}

class Jang {
    public static void main(String[] args) {
        IveMember jang = new IveMember(); // 클래스로 선언했지만 변수인 것, int a = 3;과 동일
        jang.name = "장원영";
        jang.age = 23;
        jang.height = 173.5;
        jang.dance();
        System.out.println(jang.name);
    }
}