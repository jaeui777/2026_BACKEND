package day05;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        // [1] 1.객체 생성, new 생성자명();  또는  타입 변수명 = new 생성자명();
        Book b1 = new Book();   
        // 2.객체 멤버변수 수정
        b1.title="이것이 자바다";   b1.author="신용권"; b1.price=30000;
        Book b2 = new Book();
        b2.title="자바의 정석";     b2.author="남궁성"; b2.price=28000;
        // 3.객체 멤버변수 출력
        System.out.printf( "%s, %s, %d \n", b1.title, b1.author, b1.price );
        System.out.printf( "%s, %s, %d \n", b2.title, b2.author, b2.price );

        // [2] 
        Pet p1 = new Pet(); p1.name="초코"; p1.species="푸들"; p1.age=3;
        Pet p2 = new Pet(); p2.name="나비"; p2.species="코리안숏헤어"; p2.age=5;
        System.out.printf( "%s, %s, %d \n", p1.name, p1.species, p1.age );
        System.out.printf( "%s, %s, %d \n", p2.name, p2.species, p2.age );

        // [3] 객체는 초기값이 없으면 기본값 자동할당
        // * 정수:0 , 실수:0.0 , 논리:false , 객체:null
        Rectangle r1 = new Rectangle();
        System.out.println( r1.width ); // 0 들어있는 이유는 기본값 할당
        r1.width = 10; r1.height = 5;
        System.out.println( r1.width * r1.height );

        // [4] 
        BankAccount bank1 = new BankAccount();
        bank1.accountNumber = "111-222-3333";
        bank1.ownerName = "유재석";
        bank1.balance = 10000;
        bank1.balance += 5000; System.out.println( bank1.balance );  // 입금 후 출력 
        bank1.balance -= 3000; System.out.println( bank1.balance );  // 출금 후 출력 

        // [5]
        Product prod1 = new Product();  prod1.name="새우깡";    prod1.price=1500;
        Product prod2 = new Product();  prod2.name="콜라";      prod2.price=2000;
        if( prod1.price > prod2.price ){ System.out.println( prod1.name );}
        else{ System.out.println( prod2.name); }

        // [6] 클래스생성시 주의할점: 
        // -- 1) 동일한 패키지(폴더)내 동일한 클래스명은 중복 불가능 
        // -- src(개발자코드 .java)  ---> bin(컴파일/번역코드 .class) 
        // -- 2) 첫글자는 대문자 시작
        // -- 3) 클래스 1개 당 .java 파일 1개 관리 권장 ( *디자인패턴* )
        Member m1 = new Member();                   // 2) 인스턴스 생성
        m1.id = "admin";    m1.isLogin = false;     // 3) 멤버변수 값 대입 
        System.out.println( m1.isLogin );           // 4) 멤버변수 값 호출 
        m1.isLogin = true;
        System.out.println( m1.isLogin );
        
        // [7] 타입(자료형) 이란 : 자료의 구분
        // 자료란? 데이터들 , 리터럴/상수 ( 3 , 3.14 , 'A' , true )
        // 기본타입8가지 vs 참조타입(배열,객체) , 즉] 배열과 객체도 (1개)자료 이다. 
        Television t1 = new Television();
        t1.channel = 11;    t1.volume -= 2;
        System.out.println( t1.channel );   System.out.println( t1.volume );
        
        // [8]
        Player player1 = new Player();
        player1.name = "손흥민"; 
        player1.power = 90; 
        player1.speed = 95;

        Player player2 = new Player();
        player2.name = "이강인"; 
        player2.power = 85; 
        player2.speed = 92;

        int 합1 = player1.power + player1.speed;
        int 합2 = player2.power + player2.speed;
        if (합1 > 합2) {System.out.println(player1.name);} 
        else {System.out.println(player2.name);} 

        // [9]
        MenuItem menu1 = new MenuItem();
        menu1.name = "김치찌개"; menu1.price = 8000; menu1.isSignature = true;

        MenuItem menu2 = new MenuItem();
        menu2.name = "된장찌개"; menu2.price = 8000; menu2.isSignature = false;

        MenuItem menu3 = new MenuItem();
        menu3.name = "계란찜"; menu3.price = 3000; menu3.isSignature = false;

        if (menu1.isSignature == true) {System.out.println("[대표메뉴] " + menu1.name + " : " + menu1.price + "원");}
        if (menu2.isSignature == true) {System.out.println("[대표메뉴] " + menu2.name + " : " + menu2.price + "원");}
        if (menu3.isSignature == true) {System.out.println("[대표메뉴] " + menu3.name + " : " + menu3.price + "원");}
        // [10]
        Scanner scan = new Scanner(System.in);

        UserProfile 사용자 = new UserProfile();

        System.out.print("이름: ");
        사용자.name = scan.next();

        System.out.print("나이: ");
        사용자.age = scan.nextInt();

        System.out.print("MBTI: ");
        사용자.mbti = scan.next();

        System.out.println("--- 프로필 ---");
        System.out.println("이름: " + 사용자.name);
        System.out.println("나이: " + 사용자.age);
        System.out.println("MBTI: " + 사용자.mbti);


    } //main end
} //class end

class Television{ int channel=7; int volume=20; } //  channel은 7, volume은 20 초기값 
class Member{ // 1) 클래스 생성
    String id;
    boolean isLogin;
}

// [1] 객체 정의 
// 1. 클래스선언 : 기존 class{ } 밖에 새로운 클래스선언{ }
// 2. 멤버변수선언: { } 안에 멤버변수 선언
class Book{ 
    String title;
    String author;
    int price;
}

// [2]
class Pet{
    String name;
    String species;
    int age;
}
// [3]
class Rectangle{
    int width;
    int height;
}
// [4]
class BankAccount{
    String accountNumber;
    String ownerName;
    int balance;
}
// [5]
class Product{
    String name;
    int price;
}

// [8]
class Player {
    String name;
    int power;
    int speed;
}

// [9]
class MenuItem {
    String name;
    int price;
    boolean isSignature;
}

// [10]
class UserProfile {
    String name;
    int age;
    String mbti;
}

 


/*[문제 10] UserProfile 클래스를 만드세요. name(문자열), age(정수), mbti(문자열) 멤버 변수를 가집니다.
1. main 함수에서 UserProfile 객체를 하나 생성하세요.
2. Scanner를 사용하여 사용자로부터 이름, 나이, MBTI를 순서대로 입력받으세요.
3. 입력받은 값들을 생성된 객체의 각 멤버 변수에 저장하세요.
3. 모든 정보가 저장된 객체의 멤버 변수들을 가져와 "--- 프로필 ---", "이름: [이름]", "나이: [나이]", "MBTI: [MBTI]" 형식으로 출력하세요.*/