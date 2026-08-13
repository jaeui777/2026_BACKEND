package day11;

public class Exam3 {
public static void main(String[] args) {
    // 1. 
    Car myCar = new Car();
    // myCar.num(); [오류] becuase "this.tire" is null
    // 2.
    // myCar.tire = new Tire(); [오류] 인터페이스로 객체 생성 불가능
    // 3.
    myCar.tire = new HankokTire();
    myCar.run(); // 한국타이어 회전
    // 4.
    myCar.tire = new KumhoTire();
    myCar.run(); // 금호타이어 회전
    // 5.
    System.out.println(myCar.tire instanceof Tire); // true
    System.out.println(myCar.tire instanceof KumhoTire); // true
    System.out.println(myCar.tire instanceof HankokTire); // true
    // [*] 익명 구현체 = 일회성 사용하는 인터페이스 구현체
    // 자체적으로 추상메소드 오버라이딩
        





}
} // main end

class Car{
    Tire tire;
    void run( ) { this.tire.roll();}
}

interface Tire {
    void roll(); // { } 없는 메소드는 추상 메소드
}

//구현체
class HankokTire implements Tire{
    // 추상메소드의 { } 구현 (재정의)
    @Override public void roll() {
        System.out.println("한국타이어 회전");

    }
}
class KumhoTire implements Tire{
    @Override public void roll() {
        System.out.println("금호타이어 회전");
}
}