package day04;

import java.util.Arrays;

public class Exan3 {
    public static void main(String[] args) {
        /*JAVA배열 : *동일한타입*의 여러 자료들을 순서(인덱스)대로 저장하는 타입
        선언 : 2가지
            * 타입 [ ] 변수명 & new 타입명[ 총계수 ];           vs      let 변수명 = [ ]
            * 타입 [ ] 변수명  {초기값, 초기값, 초기값};           vs      let 변수명 = [초기값, 초기값, 초기값 ]
            특징 : 1) 동일한타입끼리 2) 고정(정적)길이 3) 요소초기값(자동)
            인덱스 : 요소(자료)들이 저장되는 순서 번호, 0번 제작
            배열내 요소 확인 : Arrays.toString(배열변수)
        */
       // [1] 배열의 선언
       int[ ] arry1 = new int[ 3 ];
       System.out.println( arry1 );
       System.out.println( Arrays.toString(arry1));
       String[ ] arry2 = {"유재석" , "강호동" , "신동엽"};
       
       // [2] 배열의 요소 호출, 인덱스 
       System.out.println( arry1[0]);
       System.out.println( arry2.length);
       System.out.println( arry2[1]);
       
       // [*] 선언 이후에 길이(요소) 추가push/삭제splice 안된다.
       arry2[0] = "유재석2"; System.out.println(arry2[0]);
       // arry2.push("하하"); arry2[3] = "하하;" // 오류 , 즉 요소 추가 없다.
       // arry2.splice[0] 
    }
}
