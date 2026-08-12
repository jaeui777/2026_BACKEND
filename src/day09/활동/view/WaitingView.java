package day09.활동.view;
import java.util.ArrayList;
import java.util.Scanner;
import day09.활동.Controller.WaitingController;
import day09.활동.model.dto.WaitingDto;

public class WaitingView {

    // [*] 싱글톤 생성
    private WaitingView() {}

    private static final WaitingView instance = new WaitingView();

    public static WaitingView getInstance() {
        return instance;
    }

    // [*] 모든 메소드에서 사용 가능한 입력객체
    private Scanner scan = new Scanner(System.in);

    // [*] MVC패턴 흐름의 controller 싱글톤 호출
    private WaitingController wc = WaitingController.getInstance();


    // [*] 메인 화면
    public void index() {

        for(;;) {

            System.out.println("============= 대기명단 관리 =============");
            System.out.println("1.대기등록 | 2.대기조회 | 3.대기수정 | 4.대기삭제");
            System.out.println("========================================");

            System.out.print("선택 > ");
            int choose = scan.nextInt();

            if(choose == 1) {
                save();
            }
            else if(choose == 2) {
                findAll();
            }
            else if(choose == 3) {
                update();
            }
            else if(choose == 4) {
                delete();
            }

        }

    }


    // [1] 대기명단 등록 입출력
    public void save() {

        // 1. 입력받기
        System.out.print("전화번호 : "); String phone = scan.next();
        System.out.print("방문 인원수 : "); int count = scan.nextInt();

        // 2. 객체화
        WaitingDto waitingDto = new WaitingDto(phone, count);

        // 3. 컨트롤러에게 요청하고 응답받기
        boolean result = wc.save(waitingDto);

        // 4. 처리한다.
        if(result) { System.out.println("[안내] 대기등록 성공"); }
        else { System.out.println("[안내] 대기등록 실패"); }

    }


    // [2] 대기명단 전체조회 출력
    public void findAll() {

        // 1. 컨트롤러로부터 모든 대기명단 요청하고 받는다.
        ArrayList<WaitingDto> result = wc.findAll();

        // 2. 컨트롤러로부터 받은 모든 대기명단 출력한다.
        for(WaitingDto waitingDto : result) {

            System.out.println(
                "전화번호 : " + waitingDto.getPhone()
                + " , 방문 인원수 : " + waitingDto.getCount()
            );

        }

    }


    // [3] 대기명단 수정 입출력
    public void update() {

        // 1. 입력받기
        System.out.print("수정할 고객 전화번호 : "); String phone = scan.next();
        System.out.print("변경할 방문 인원수 : "); int count = scan.nextInt();

        // 2. 객체화
        WaitingDto waitingDto = new WaitingDto(phone, count);

        // 3. 컨트롤러에게 요청하고 응답받기
        boolean result = wc.update(waitingDto);

        // 4. 처리한다.
        if(result) { System.out.println("[안내] 대기정보 수정 성공"); }
        else { System.out.println("[안내] 해당 전화번호가 없습니다."); }

    }


    // [4] 대기명단 삭제 입출력
    public void delete() {

        // 1. 입력받기
        System.out.print("삭제할 고객 전화번호 : "); String phone = scan.next();

        // 2. 컨트롤러에게 요청하고 응답받기
        boolean result = wc.delete(phone);

        // 3. 처리한다.
        if(result) { System.out.println("[안내] 대기정보 삭제 성공"); }
        else { System.out.println("[안내] 해당 전화번호가 없습니다."); }

    }

}