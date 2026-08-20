package day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exam3 {
    public static void main(String[] args) {
        // Set 인터페이스 : 여러개 자료들을 저장하는 컬렉션 , 단* 중복제거 , 인덱스(순서)가 없
        // 1. Set 구현
        Set< String > set1 = new HashSet<>();
        // 2. Set   .add ( 추가할값 );
        set1.add("유재석");     set1.add("강호동");
        set1.add("유재석"); // List 중복 허용 , Set 중복허용안함
        set1.add(new String("유재석")); // 중복방지한다.
        System.out.println("set1");
        // 3. .get(인덱스); 지원불가 , 인덱스가 없으니까.
        // set1.get( 0 );
        // 4. .size( ); : 항목 개수 반환
        System.out.println(set1.size());
        // 6. remove( 자료 );   인덱스가 아닌 자료 삭제
        set1.remove("강호동");
        // 7. .indexOf( 인덱스 ); 지원불가, contains( 찾을값 )
        set1.contains("강호동");
        // 8. clear() : 항목 전체 삭제
        for( String str : set1) { System.out.println( str );}
        // 3. forEach , 지원 , 컬렉션객체.forEach ( (반복변수명) -> { })
        set1.forEach((str) -> {System.out.println(str);});
        // - 활용처 : set(JDBC ResultSet)
        Iterator<String> 순회자 = set1.iterator(); // 인덱스가 아닌 자료들을 순회하는 인터페이스 반환
        while ( 순회자.hasNext()) { }   // hashnext() 목록에서 자료 하나씩 꺼내기( 저장된 순서 )
        

        // 11. TreeSet 이용한 자동정렬 지원
        TreeSet< Integer > set2 = new TreeSet<>();
        set2.add(50);       set2.add(70);       set2.add(60);
        System.out.println( set2 ); // [50 , 60 , 70] : 기본값이 오름차순
        // descendingSet() 메소드는 set 인터페이스나 추상메소드 없다.
        System.out.println( set2.descendingSet()); // [70, 60, 50] : 내림차순 ( 단])
        

    }
}
