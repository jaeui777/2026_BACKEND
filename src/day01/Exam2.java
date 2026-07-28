package day01;      // 클래스가 속한 폴더명/패키지

import java.net.Socket;

public class Exam2 { // 클래스 시작
    //[1] m + 엔터
        public static void main(String[] args) { // 메인함수 시작
            
            //[2] 리터럴 : 상수 , 미리 상수로 구성한 자료들
            // 3 ,ㅁ 'a' , true 
            
            System.out.println( 3); // so + 엔터
            System.out.println(3.14);
            System.out.println('유'); // 작은 따옴표 : 문자 (한글자)
            System.out.println("유재석"); // 큰따옴표 : 문자열 (N글자)
            System.out.println(true); 

            //[3] 자료타입 / 자료형 : 자료(데이터) 효율적으로 분류하는 방법
            // * 효율이란? 자료 크기에 따라 적당한 타입(크기) 선정하여 빈공간(여백) 줄이기
            // C/JAVA 정적(직접)타입  PY/JS
            // 1) boolean : true 또는 false 저장하는 타입 ,  1byte ( 1bit가 8개 모이면 1byte)
            boolean bool1 = true; // let/const --> boolean
            System.out.println( bool1 );

            // 2) char : 작은 따옴표로 감싼 문자 1개 저장하는 타입, 2byte ,유니코드( 코드와 자연어를 번역해주는 번역 단위)
            char ch1 = 'A'; // 
            System.out.println( ch1 );

            // 3) String : "큰따옴표로 감싼 문자 N개 저장하는 타입 , byte가 정해져있지 않음 , 객체 문자열
            String str1 = "ABC";
            System.out.println( str1 );

            // 4) byte : -128 ~ 127 저장하는 타입 , 1 byte
            byte b1 = 100; System.out.println( b1 );
            // 5) short : +-3만정도 , 2byte
            short sh1 = 10000; System.out.println( sh1 );
            // 6) int : +-21억정도 , 4byte , ****(정수) 리터럴 타입 *****
            int i1 = 2000000000; System.out.println( i1 );
            // 7) long : +~21억 이상 , 8byte  **** 키보드로부터 입력한 정수는 int 이므로 뒤에 L/l 붙인다
            long l1 = 999900000000L; System.out.println( l1 );

            // === 실수 ===

            // 8) float : 소수점 8자리 표현 , 4byte , *키보드로부터 입력한 실수는 double 이므로 F/f
            float f1 = 0.1234567894184738129473189471329471237819372138317238917829173173829037128372193712831208127320197312983721F; System.out.println( f1 );
            // 9) double : 소수점 17자리 표현 , 8byte , * (실수)리터럴 타입 *
            double d1 = 0.93841094804; System.out.println( d1 );

            // 8가지 타입 ( 기본타입, 리터럴 저장 )
            // vs 그외(String) 타입 (참조타입 , 객체/배열/인터페이스 등등)
        }//메인함수 끝

} // 클래스 끝
