package day14;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        // 초기 주차 데이터
        // 위치번호,차량번호,입차시간
        String carParkingList =
                "3,211가6231,202608190930\n8,452하1234,202608171227";

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.print("1.위치찾기 2.입차 3.출차 선택 : ");
            int ch = scan.nextInt();


            // =========================
            // [1] 차량 위치 찾기
            // =========================
            if (ch == 1) {

                // 1. 차량번호 입력
                System.out.print("차량번호 입력 : ");
                String carNumber = scan.next();

                // 2. 줄바꿈 기준으로 차량별 분리
                String[] cars = carParkingList.split("\n");

                // 3. 차량 찾았는지 확인하는 변수
                boolean found = false;

                // 4. 차량 하나씩 확인
                for (String car : cars) {

                    // 위치번호, 차량번호, 입차시간으로 분리
                    String[ ] info = car.split(",");

                    // 입력한 차량번호와 비교
                    if (info[1].equals(carNumber)) {

                        System.out.println("주차 위치 : " + info[0]);

                        found = true;
                    }
                }

                // 차량이 없는 경우
                if (found == false) {
                    System.out.println("미등록 차량");
                }
            }


            // =========================
            // [2] 입차 처리
            // =========================
            if (ch == 2) {

                // 1. 입차 정보 입력
                System.out.print("주차 위치 입력 : ");
                String location = scan.next();

                System.out.print("차량번호 입력 : ");
                String carNumber = scan.next();

                System.out.print("입차일시 입력(YYYYMMDDhhmm) : ");
                String dateTime = scan.next();

                // 2. 기존 차량 데이터 분리
                String[] cars = carParkingList.split("\n");

                // 3. 위치 중복 여부
                boolean duplicate = false;

                // 4. 주차 위치 중복 확인
                for (String car : cars) {

                    String[] info = car.split(",");

                    // info[0] = 주차 위치번호
                    if (info[0].equals(location)) {

                        duplicate = true;
                    }
                }

                // 5. 중복 위치이면 입차 불가
                if (duplicate == true) {

                    System.out.println(
                            "해당 위치에는 중복 주차할 수 없습니다."
                    );

                } else {

                    // 6. 기존 문자열 뒤에 새로운 차량 추가
                    carParkingList =
                            carParkingList
                            + "\n"
                            + location
                            + ","
                            + carNumber
                            + ","
                            + dateTime;

                    System.out.println("입차 완료");
                    System.out.println("주차 위치 : " + location);
                }
            }


            // =========================
            // [3] 출차 처리
            // =========================
            if (ch == 3) {

                // 1. 출차 차량번호 입력
                System.out.print("출차 차량번호 입력 : ");
                String carNumber = scan.next();

                // 2. 차량 데이터 분리
                String[] cars = carParkingList.split("\n");

                // 출차 차량을 제외한 새로운 문자열
                String newList = "";

                // 차량을 찾았는지 확인
                boolean found = false;


                // 3. 차량 하나씩 확인
                for (String car : cars) {

                    String[] info = car.split(",");


                    // =====================
                    // 출차할 차량을 찾은 경우
                    // =====================
                    if (info[1].equals(carNumber)) {

                        found = true;


                        // 날짜 형식 설정
                        DateTimeFormatter formatter =
                                DateTimeFormatter.ofPattern(
                                        "yyyyMMddHHmm"
                                );


                        // 입차시간 문자열을 날짜 객체로 변환
                        LocalDateTime inTime =
                                LocalDateTime.parse(
                                        info[2],
                                        formatter
                                );


                        // 현재 시간을 출차시간으로 사용
                        LocalDateTime outTime =
                                LocalDateTime.now();


                        // 입차시간과 출차시간 차이를 분으로 계산
                        long minutes =
                                Duration.between(
                                        inTime,
                                        outTime
                                ).toMinutes();


                        // =====================
                        // 주차요금 계산
                        // =====================

                        int fee = 0;


                        // 최초 30분은 무료
                        if (minutes > 30) {

                            // 무료 30분 제외
                            long payMinutes =
                                    minutes - 30;


                            // 10분 단위 올림 계산
                            fee = (int) (((payMinutes + 9) / 10)* 1000);}


                        // 24시간 이내 최대 20,000원
                        if (fee > 20000) {

                            fee = 20000;
                        }


                        // 결과 출력
                        System.out.println(
                                "총 주차시간 : "
                                + minutes
                                + "분"
                        );

                        System.out.println(
                                "주차요금 : "
                                + fee
                                + "원"
                        );


                    } else {

                        // =====================
                        // 출차 차량이 아닌 차량
                        // → 새로운 목록에 다시 저장
                        // =====================

                        if (newList.equals("")) {

                            newList = car;

                        } else {

                            newList =
                                    newList
                                    + "\n"
                                    + car;
                        }
                    }
                }


                // =====================
                // 차량을 찾은 경우
                // =====================
                if (found == true) {

                    // 출차 차량이 제거된 데이터로 변경
                    carParkingList = newList;

                    System.out.println("출차 완료");


                } else {

                    // 차량번호가 존재하지 않는 경우
                    System.out.println("미등록 차량");
                }
            }


            // =========================
            // 잘못된 메뉴 번호
            // =========================
            if (ch < 1 || ch > 3) {

                System.out.println("잘못된 입력입니다.");
            }

        } // while end

    } // main end
} // class end