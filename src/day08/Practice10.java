package day08;


public class Practice10 {
    public static void main(String[] args) {
        // [1]
        Member member = new Member();
        member.setId( "admin"); 
        System.out.println( member.getId() );
        // [2]
        Score score = new Score();
        score.setScore( 85 );
        score.setScore( 120 );
        // [3]
        BankAccount bank = new BankAccount("123-456");
        System.out.println(bank.getAccountNumber());

        // [4]
        CircleCalculator circle = new CircleCalculator();
        circle.printCircleArea(5);

        // [5]
        TicketMachine machine1 = new TicketMachine();
        TicketMachine machine2 = new TicketMachine();
        TicketMachine machine3 = new TicketMachine();

        machine1.issueTicket();
        machine1.issueTicket();
        machine2.issueTicket();
        TicketMachine.printTotalTickets();

        // [6]
        System.out.println(GameConfig.MAX_LEVEL);
        System.out.println(GameConfig.MAX_HP);
        System.out.println(GameConfig.GAME_TITLE);

    } // main end   
} // class end

// [1]
class Member{
    private String id; // 외부 클래스에서 접근 불가능한 멤버변수
    // 오른쪽 -> 소스작업 -> setter and getter 
    public String getId() { return id;  } // 멤버변수에 값 대입하는 메소드 
    public void setId(String id) {  this.id = id;  } // 멤버변수에 값 호출하는 메소드
}

// [2]
class Score{
    private int score;
    public void setScore( int score ){
    if( score >=0 && score <= 100 ){ this.score = score;}
        else System.out.println("유효하지 않은 점수");
    } 
} 
// [3]
class BankAccount{
    private String accountNumber;
    BankAccount(String accountNumber) {this.accountNumber = accountNumber;}
    public String getAccountNumber() {return accountNumber;}
}
// [4]
class CircleCalculator{
    final double PI = 3.14159;

    void printCircleArea(int radius) {double area = radius * radius * PI; System.out.println(area);}
}
// [5]
class TicketMachine{
    static int totalTickets = 0;
    void issueTicket() {totalTickets++; System.out.println("티켓 1장을 발권했습니다.");}
    static void printTotalTickets() {System.out.println("총 발권 수: " + totalTickets);}
}
// [6]
class GameConfig{
    public static final int MAX_LEVEL = 99;
    public static final int MAX_HP = 10000;
    public static final String GAME_TITLE = "My RPG";
}



 

/*[문제 6] 게임의 고정 설정 값을 관리하는 GameConfig 클래스를 만드세요.
1. 이 클래스 안에, 어디서든 접근 가능하며 절대 변하지 않는 다음 상수들을 public static final로 선언하세요.
최대 레벨 MAX_LEVEL = 99
최대 HP MAX_HP = 10000
게임 이름 GAME_TITLE = "My RPG"
2. main 함수에서 객체를 생성하지 않고, GameConfig.GAME_TITLE과 같이 클래스 이름으로 직접 접근하여 모든 설정 값을 출력하세요.*/