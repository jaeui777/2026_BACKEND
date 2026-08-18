package day07;

public class Practice9 {
    public static void main(String[] args) {
       // [1]
        Printer printer = new Printer(); 
        printer.printMessage();

       // [2] 
        Greeter greeter = new Greeter();
        greeter.greet("유재석");

       // [3] 
        SimpleCalculator s1 = new SimpleCalculator();
        int result = s1.add( 10, 5);
        System.out.println( result );

       // [4]  
       Checker c1 = new Checker();
       boolean result2 = c1.isEven( 10 );
       if( result2 ){  System.out.println("짝수");  }
       else{ System.out.println("홀수"); }

       // [5]  
       Lamp l1 = new Lamp();
       l1.turnOn(); System.out.println( l1.isOn );
       l1.turnOff(); System.out.println( l1.isOn );
       
       // [6]  
        Product p1 = new Product();
        p1.name = "콜라"; p1.stock = 10;
        boolean result6 =  p1.sell( 11 );

       // [7]
        Visualizer v1 = new Visualizer();
        String result7 = v1.getStars(5);
        System.out.println(result7);

        // [8]
        ParkingLot park1 = new ParkingLot();

        int 최종주차요금계산1 = park1.calculateFee(65);
        System.out.println(최종주차요금계산1);

        int 최종주차요금계산2 = park1.calculateFee(140);
        System.out.println(최종주차요금계산2);

    }
} // class end 
class Product{ // [6]
    String name;
    int stock;
    boolean sell( int qty ){
        if( stock >= qty ){ 
            stock -= qty; 
            return true; 
        }
        else{ 
            System.out.println("재고부족");
            return false;
        }
    }
}
class Lamp{ // [5]
    boolean isOn;
    void turnOn(){ isOn = true; }
    void turnOff(){ isOn = false; }
}
class Checker{ // [4]
    boolean isEven( int num ){
        if( num % 2 == 0 )return true;
        return false;
    }
}
class SimpleCalculator{ // [3]
    int add( int x , int y ){
        return x + y;
    }
}
class Greeter{  // [2]
    void greet( String name ){
        System.out.printf("안녕하세요 %s \n" ,name);
    }
}
class Printer{  // [1]
    void printMessage(){ 
        System.out.println("안녕하세요, 메소드입니다.");
    } 
}

class Visualizer {
    String getStars(int 정수) {
        String 별 = "";
        for(int i = 0; i < 정수; i++) {별 += "★";}
        return 별;
    }
}

class ParkingLot {
    int calculateFee(int 주차시간) {
        int 요금 = 1000;
        if(주차시간 > 30) {요금 += ((주차시간 - 30) / 10) * 500;}
        if(요금 > 20000) {요금 = 20000;}
        return 요금;
    }
}


/*[문제 8] ParkingLot 클래스를 만드세요.
1. 주차 시간(분)을 매개변수로 받아, 요금 규정에 따라 계산된 최종 주차 요금을 반환하는 calculateFee 메소드를 정의하세요.
2. 요금 규정:
기본 요금: 최초 30분까지 1,000원
추가 요금: 30분 초과 시, 매 10분마다 500원씩 추가
일일 최대 요금: 20,000원
3. main 함수에서 calculateFee 메소드에 65, 140을 각각 인자로 전달하여 반환된 요금을 출력하세요.*/