package day08;

public class Exam2 { 
    public static void main(String[] args) {
    
    User u1 = new User();
    // ul.name = "유재석"; // 직접접근 불가!
    u1.setName("유재석");
    // System.out.println( ul.name ); // 불가능
    System.out.println( u1.getName() ); 
    }
}

class User{// 클래스란? 객체 설계도/종이쪼가리

     // 1. 멤버변수 = 상태 = private 시용
    private String name;
    private int age;
    // 2. 생성자 = 초기화
    // 3. 메소드 = 행위
    // ~private 메소드에 대한 간접접근 메소드
    // setter ,  getter , set멤버변수 , get멤버변수
    // getter 존재하면 V(value)O(object) 읽기모드
    // getter setter 존재하면 D(data)T(transfer)O(object)
    public void setName(String name) {
        this.name = name;}
    
        public String getName ( ) 
        {
        return this.name; }
        
        // -> 오른쪽 클릭 -> 소스작업 -> setter and getter
        public int getAge() { return age;}
        public void setAge(int age) { this.age = age;}


        // 3. toString : 객체호출시 주소값 대신에 문자열 변환
        @Override
        public String toString() {
            return "User [name=" + name + ", age=" + age + "]";
        }

        
 // DTO: 1. 관례적으로 멤버변수 모두 private
 //      2. setter/getter 제공한다.
 //      3. toString 제공한다
 //      4. 생성자에 기본생성자1개, 전체매게변수1개 -> 2
//  MVC패턴 : 소규모가 아닌 체계적인 (약속) 규모 필요할 때 클래스 역할 나누기 / AI에이전트=> 역할

/*
        V: VIEW 입출력      
        C: Controller 제어(백/프) 중계
        1인 식당 운영: 사장이 서빙 요리 재료 관리
        N인 식상 운영 : 서빙담당자 - 요리담당자 - 재료담당

*/
}// class end

