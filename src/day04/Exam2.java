package day04;

public class Exam2 {
        public static void main(String[] args) {
            // 1. for(초기값 ; 조건문 ; 증감식) { 실행문;}  
            // 중첩for : for( ){ for(){ }}

             // 2. break: 반복문탈출, continue; 증감식이동
        for (int i = 1 ; i <= 10 ; i++ ) {
            if( i == 3) continue; //만약 u가 3이면 증감식 이동
            if( i == 9) break; // 만약에 i가 9이면 반복문 탈출
            System.out.println( 1 );
        }

        //3. 무한루프:
        for( ; ; ) { System.out.println("무한반복"); break;}
        while (true){System.out.println("무한반복"); break;} {
        }

        //4. 초기값; while(조건문){ 증갑식; 실행문;} 
        int i = 1; // [i] 초기값
        while (i <= 10) { // 조건식
         // [3] wmdrkatlr
         i++;  
        }

        // 5. 반복문 과 배열 관계 : 배열내 저장된 자료들을 인덱스(저장된순서번호) 로 식별 ( 0 ~ )
        int[ ] ary = { 92, 80, 75 }; // 자바 배열 : [vs] 자바스크립트 배열
        // 배열은 인덱스가 0부터 마지막 인덱스까지 순차 저장
        for( int 인덱스 = 0; 인덱스 <= ary.length - 1 ; 인덱스++ ){System.out.println(ary[인덱스]);}
        // * 항상된 for문 for( 타입명 변수명 : 배열명 ){  } : 콜로 기준 오른쪽 배열내 요소들을 왼쪽 변수에 하나씩 대입
        for( int data : ary) {
            System.out.println(data);
        }
        } 

       
}
