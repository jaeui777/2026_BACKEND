package day09.종합예제.model.dao;

import java.util.ArrayList;

import day09.종합예제.model.dto.BoardDto;

public class BoardDao {

    // 싱글톤
    private BoardDao(){}

    private static final BoardDao instance
        = new BoardDao();

    public static BoardDao getInstance(){
        return instance;
    }


    // DB 대신 ArrayList 사용
    private ArrayList<BoardDto> boardList
        = new ArrayList<>();


    // [1] 게시물 등록
    public boolean save(BoardDto boardDto){

        boardList.add(boardDto);

        return true;

    }


    // [2] 게시물 전체조회
    public ArrayList<BoardDto> findAll(){

        return boardList;

    }

}