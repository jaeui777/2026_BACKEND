package day09.활동.model.dto;

public class WaitingDto {

    // 1. 데이터베이스 표에서 사용할 자료들을 private 멤버변수로 구성
    private String phone;
    private int count;

    // 2. 기본생성자, 전체멤버변수생성자
    public WaitingDto() {}

    public WaitingDto(String phone, int count) {
        this.phone = phone;
        this.count = count;
    }

    // 3. setter and getter, toString
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "WaitingDto [phone=" + phone + ", count=" + count + "]";
    }

}