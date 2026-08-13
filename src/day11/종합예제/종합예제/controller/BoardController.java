package day11.종합예제.종합예제.controller;

import java.util.ArrayList;

import day11.종합예제.종합예제.model.dao.BoardDao;
import day11.종합예제.종합예제.model.dao.IBaseDao;
import day11.종합예제.종합예제.model.dto.BoardDto;

public class BoardController {
    private BoardController() {}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance() { return instance; }

    private IBaseDao ib = BoardDao.getInstance();
    public boolean save(BoardDto boardDto) {
 // TODO 1: boardDto 전달받아 DAO의 save()를 호출하고 결과반환
        boolean result = ib.save(boardDto); 
        return result; 
    }
    
   public ArrayList<BoardDto> findAll() {
 // TODO 2: DAO의 findAll() 호출하여 결과 반환
        ArrayList<Object> list = ib.findAll(); // 저장된 게시글 전체 조회하기 위해 findAll 호출후 결과를 ArrayList<Object> list 에 담는다
        ArrayList<BoardDto> result = new ArrayList<>(); // 게시글전용 목록을생성한다
        for (Object item : list) { //DAO가 준 Object를 하나씩 꺼내서
            result.add((BoardDto) item); //boardDto 로 형변환한 뒤
        } //게시글 전용 result에 넣기
        return result;

    }

}
