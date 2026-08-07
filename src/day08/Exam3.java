package day08;

public class Exam3 {
    public static void main(String[] args) {
        //[*]
        //System.out.println( a );
        //b();
        Exam3 exam3 = new Exam3();
        System.out.println( exam3.a );
        exam3.b();
        
    
    // [1] final
    D 변수 = new D();
    // 변수, 고정변수 = 20; // 오류

    //[2] static: 클래스명.정적변수
    D.정적변수 = 20;
    // VS 멤버변수 : 객체명.(인스턴스)멤버변수
    변수.멤버변수 = 20;
    //VS 멤버변수: 객체명.(인스턴스마다)멤버변
    D 변수1 = new D();
    변수1.멤버변수 = 20;
    D 변수2 = new D();
    변수2.멤버변수 = 30;
    D.정적변수 = 30;






}


}

class D{
    // - final 키워드 : 초기값(필수) 이후에 수정 불가능
    public final int 고정변수 = 10;
    // - static 키워드 : (정적) 우선(프로그램 실행시) 할당
    public static int 정적변수 = 10;
    public int 멤버변수 = 10;
    // *static 프로그램 시작시 할당되고 프로그램 종료시 사라진다
    // -public static final : 상수
    public static final int 상수 = 30;
    // -- 주의할점 : static 우선할당 이므로 static 아닌 변수 / 
    // --> 해결방안 : 인스턴스/객체 통해 멤버변수/메소드 사용하자.
}
