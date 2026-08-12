package day09.활동.Controller;

import java.util.ArrayList;

import day09.활동.model.dao.WaitingDao;
import day09.활동.model.dto.WaitingDto;

public class WaitingController {

    // [*] 싱글톤 생성
    private WaitingController() {}

    private static final WaitingController instance = new WaitingController();

    public static WaitingController getInstance() {
        return instance;
    }

    // [*] MVC패턴 흐름의 dao 싱글톤 호출
    private WaitingDao wd = WaitingDao.getInstance();


    // [1] 대기명단 등록 컨트롤러
    public boolean save(WaitingDto waitingDto) {

        // DAO에게 요청하고 응답받기
        boolean result = wd.save(waitingDto);

        // DAO에게 받은 결과를 VIEW에게 응답하기
        return result;
    }


    // [2] 대기명단 전체조회 컨트롤러
    public ArrayList<WaitingDto> findAll() {

        // DAO에게 요청하고 응답받기
        ArrayList<WaitingDto> result = wd.findAll();

        // DAO에게 받은 결과를 VIEW에게 응답하기
        return result;
    }


    // [3] 대기명단 수정 컨트롤러
    public boolean update(WaitingDto waitingDto) {

        // DAO에게 요청하고 응답받기
        boolean result = wd.update(waitingDto);

        // DAO에게 받은 결과를 VIEW에게 응답하기
        return result;
    }


    // [4] 대기명단 삭제 컨트롤러
    public boolean delete(String phone) {

        // DAO에게 요청하고 응답받기
        boolean result = wd.delete(phone);

        // DAO에게 받은 결과를 VIEW에게 응답하기
        return result;
    }

}