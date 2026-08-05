package day06;

public class Exam1 {
public static void main(String[] args) {
    
    /*생성자 : 인스턴스(객체) 생성할 때 사용되는 키워드
    선언하는 방법
        1) 클래스 내부
        2) 클래스명과 동일 !
        3) 오버로딩 지원 : 동일한 이름으로 여러개 선언 , 조건
    목적 : 1) 빠른 초기화 2) 객체 생성 규칙/유효성검사
    종류 : 1) 기본생성자 2) 정의생성
*/
Phone p1 = new Phone();
p1.model = "갤럭시";

// [2] 정의생성자로 객체 생성 , new 생성자명 ( 값1, 값2 );
Phone p2 = new Phone( "아이콘" , "파랑");


// [3] 정의생성자로 객체 생성
Phone p3 = new Phone("갤러시탭", "블랙", 30000);

}

}


class Phone{
    // *** 클래스 가족(멤버들) ***
    // 1. 멤버 변수
    String model;
    String color;
    int price;
    // 2. 생성자
    // *생성자가 1개 없으면 *자동으로 기본생성자* 생성
    //* 생성자 명은 중복이 안된다. */
    //  -> 오버로딩(매개변수 개수/타입/순서 다르면) 중복 가능
    // *this란? 매개변수명 외 멤버변수명 같은 경우 멤버변수명 앞에 this
    // 기본 생성자 : 매개변수가 없는
    Phone( ){ }

    // 2) 정의생성자 : 매개변수가 있는
    Phone(String model , String color) {
        this.model = model;
        this.color = color;
    }
    Phone(String model , String color, int 가격) {
        this.model = model;
        this.color = color;
        price = 가격;
    }

}


