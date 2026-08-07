package day06;

public class Practice1 {

    public static void main(String[] args) {
        


// 1. 제목, 저자, 가격 한 번에 초기화
Book b1 = new Book("이것이 자바다", "신용권", 30000);
Book b2 = new Book("자바의 정석", "남궁상", 20000);



    }

}

    //1. 멤버변수
  class Book {
    String title;
    String author;
    int price;

    // 2. 생성자
    // 자동 : 클래스내 빈공간 오른쪽 -> 소스 작업 -> Generate Constructor -> 멤버변수 체크 -> [확인]
    Book( String title , String author , int price){
        this.title = title;
        // this.멤버변수명 = 매개변수명;
        this.author = author;
        this.price = price;

    }


}






