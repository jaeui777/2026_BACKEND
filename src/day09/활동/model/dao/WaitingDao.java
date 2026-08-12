package day09.활동.model.dao;

import java.util.ArrayList;
import  day09.활동.model.dto.WaitingDto;

public class WaitingDao {

    // [*] 싱글톤 생성
    private WaitingDao() {}

    private static final WaitingDao instance = new WaitingDao();

    public static WaitingDao getInstance() {
        return instance;
    }

    // [*] 데이터베이스 대신 ArrayList 사용
    private ArrayList<WaitingDto> waitingList = new ArrayList<>();


    // [1] 대기명단 등록 로직
    public boolean save(WaitingDto waitingDto) {

        // 1. controller로부터 저장할 정보 객체 받는다.

        // 2. 리스트에 저장
        waitingList.add(waitingDto);

        // 3. 성공반환
        return true;
    }


    // [2] 대기명단 전체조회 로직
    public ArrayList<WaitingDto> findAll() {

        // 저장된 모든 대기명단 반환
        return waitingList;
    }


    // [3] 대기명단 수정 로직
    public boolean update(WaitingDto waitingDto) {

        // 1. 리스트를 순회한다.
        for(WaitingDto dto : waitingList) {

            // 2. 수정할 전화번호를 찾는다.
            if(dto.getPhone().equals(waitingDto.getPhone())) {

                // 3. 방문 인원수를 수정한다.
                dto.setCount(waitingDto.getCount());

                // 4. 성공반환
                return true;
            }
        }

        // 일치하는 전화번호가 없으면 실패
        return false;
    }


    // [4] 대기명단 삭제 로직
    public boolean delete(String phone) {

        // 1. 리스트를 순회한다.
        for(int index = 0; index < waitingList.size(); index++) {

            WaitingDto dto = waitingList.get(index);

            // 2. 삭제할 전화번호를 찾는다.
            if(dto.getPhone().equals(phone)) {

                // 3. 리스트에서 삭제한다.
                waitingList.remove(index);

                // 4. 성공반환
                return true;
            }
        }

        // 일치하는 전화번호가 없으면 실패
        return false;
    }

}