package day04;

public class Exam1 {

    public static void main(String[] args) {
        
        // 조건문 : ㅑㄹ( true / false ) 
        int 온도 = 5;
        if( 온도 <= 10) System.out.println( "외투를 입는다");

        // 조건문2 : if(true / false ) { 실행문 ; 실행문;}
        if (온도 <= 10) {
            System.out.println("외투 입는다");
            System.out.println("외투를 벗는다");
        } 



        char grade = 'B';
        // switche( 자료 ) ( case 값1 : 실행문; case 값2 실행문; case 값3 : 실행무니 default : 실행문; )
        switch ( grade ){
            case 'A' : System.out.println("A등급 입니다.");
            case 'B' : System.out.println("B등급 입니다.");
            case 'C' : System.out.println("C등급 입니다.");
            default : System.out.println("재시험 입니다"); //해당하는 케이스부터 모두 출력
        }

        switch( grade ) {
            case  'A' :
            case  'B' :  System.out.println("합격입니다."); break;
            case  'C' :
            default : System.out.println("재시험 입니다.");
        }

        int adult = 1;
        switch( grade ) {
            case 'A' :
                switch ( adult ) {
                    case 1 : System.out.println("A등급 성인 입니다.");
                    case 0 : System.out.println("A등급 미성년 입니다.");     
                }

                  case 'B' :
                switch ( adult ) {
                    case 1 : System.out.println("B등급 성인 입니다.");
                    case 0 : System.out.println("B등급 미성년 입니다.");   
        }





        // 반복문



    } //main end

} // class end
