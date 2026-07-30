package day02;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*문제 1*/

        byte a = 10;
        int b = 200;
        long result1 = a + b;
        System.out.println("결과: " + result1);


         /*문제 2*/

        double z = 3.141592;
        int result2 = (int) z;
        System.out.println("원본 double 값: " + z);
        System.out.println("변환된 int 값: " + result2);


         /*문제 3*/


        System.out.print("키를 입력하세요: ");
        double height = scan.nextDouble();
        int intHeight = (int) height;
        System.out.println("당신의 키는 약 " + intHeight + "cm 이군요.");


        /*문제 4*/

        System.out.print("1] 정수: ");
        int 정수1 = scan.nextInt();
        

        System.out.print("2] 정수: ");
        int 정수2 = scan.nextInt();

        System.out.print("3] 정수: ");
        int 정수3 = scan.nextInt();

        double average = (정수1 + 정수2 + 정수3) / 3;
        System.out.println("평균 결과: " + average);
    }
}