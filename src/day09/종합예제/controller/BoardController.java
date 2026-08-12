package day09.종합예제.controller;

import java.util.ArrayList;

import day09.종합예제.model.dao.BoardDao;
import day09.종합예제.model.dto.BoardDto;

public class BoardController {

    // 싱글톤
    private BoardController(){}

    private static final BoardController instance
        = new BoardController();

    public static BoardController getInstance(){
        return instance;
    }


    // DAO 싱글톤 호출
    private BoardDao bd = BoardDao.getInstance();


    // [1] 게시물 등록
    public boolean save(BoardDto boardDto){

        boolean result = bd.save(boardDto);

        return result;

    }


    // [2] 게시물 전체조회
    public ArrayList<BoardDto> findAll(){

        ArrayList<BoardDto> result = bd.findAll();

        return result;

    }

}