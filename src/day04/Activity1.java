package day04;

import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);


int[] array = new int[0];

while (true) {
    System.out.println("----------------------------------------");
    // 현재 배열 출력
    System.out.print("현재 배열 [크기: " + array.length + "]: [");

    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);

        // 마지막 숫자가 아니라면 쉼표 출력
        if (i < array.length - 1) {
            System.out.print(", ");
        }
    }

    System.out.println("]");

    System.out.println("1. 요소 추가 | 2. 인덱스로 삭제 | 0. 종료");
    System.out.print("메뉴를 선택하세요: ");

    int menu = scan.nextInt();

    // 1. 요소 추가
    if (menu == 1) {

        System.out.print("추가할 정수 값을 입력하세요: ");
        int value = scan.nextInt();

        // 기존 배열보다 크기가 1 큰 새 배열 생성
        int[] newArray = new int[array.length + 1];

        // 기존 배열의 값 복사
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        // 새 배열의 마지막 위치에 입력한 값 추가
        newArray[newArray.length - 1] = value;

        // 기존 배열이 새 배열을 가리키게 변경
        array = newArray;

        System.out.println(">> " + value + " 값이 성공적으로 추가되었습니다.");
    }

    // 2. 인덱스로 삭제
    else if (menu == 2) {

        // 배열이 비어 있는 경우
        if (array.length == 0) {
            System.out.println(">> 삭제할 요소가 없습니다.");
            continue;
        }

        System.out.print(
            "삭제할 인덱스 번호(0 ~ " + (array.length - 1) + ")를 입력하세요: "
        );

        int deleteIndex = scan.nextInt();

        // 잘못된 인덱스를 입력한 경우
        if (deleteIndex < 0 || deleteIndex >= array.length) {
            System.out.println(">> 존재하지 않는 인덱스입니다.");
            continue;
        }

        // 삭제될 값 미리 저장
        int deleteValue = array[deleteIndex];

        // 기존 배열보다 크기가 1 작은 새 배열 생성
        int[] newArray = new int[array.length - 1];

        int newIndex = 0;

        // 삭제할 인덱스를 제외하고 새 배열에 복사
        for (int i = 0; i < array.length; i++) {

            if (i == deleteIndex) {
                continue;
            }

            newArray[newIndex] = array[i];
            newIndex++;
        }

        // 기존 배열이 새 배열을 가리키게 변경
        array = newArray;

        System.out.println(
            ">> 인덱스 [" + deleteIndex + "]의 값 (" 
            + deleteValue + ")이 삭제되었습니다."
        );
    }

    // 0. 종료
    else if (menu == 0) {
        System.out.println("프로그램을 종료합니다.");
        break;
    }

    // 0, 1, 2 이외의 값을 입력한 경우
    else {
        System.out.println(">> 올바른 메뉴 번호를 입력해주세요.");
    }
}


    }
}
