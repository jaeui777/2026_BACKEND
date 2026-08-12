package day09.종합예제.view;

import java.util.ArrayList;
import java.util.Scanner;

import day09.종합예제.controller.BoardController;
import day09.종합예제.model.dto.BoardDto;

public class BoardView {

    // 싱글톤
    private BoardView(){}

    private static final BoardView instance = new BoardView();

    public static BoardView getInstance(){
        return instance;
    }

    // 입력 객체
    private Scanner scan = new Scanner(System.in);

    // Controller 싱글톤 호출
    private BoardController bc = BoardController.getInstance();


    // 프로그램 실행
    public void run(){

        for(;;){

            System.out.println("1. 게시물 등록");
            System.out.println("2. 게시물 전체조회");
            System.out.print("선택 : ");

            int choose = scan.nextInt();

            if(choose == 1){
                save();
            }

            if(choose == 2){
                findAll();
            }

        }

    }


    // [1] 게시물 작성
    public void save(){

        // 1. 입력
        System.out.print("내용 : ");
        String 내용 = scan.next();

        System.out.print("작성자 : ");
        String 작성자 = scan.next();

        // 2. 객체화
        BoardDto boardDto = new BoardDto(내용, 작성자);

        // 3. Controller에게 요청
        boolean result = bc.save(boardDto);

        // 4. 결과 출력
        if(result){
            System.out.println("등록성공");
        }else{
            System.out.println("등록실패");
        }

    }


    // [2] 게시물 전체 출력
    public void findAll(){

        ArrayList<BoardDto> result = bc.findAll();

        for(BoardDto board : result){

            System.out.println(
                board.getWriter()
                + " : "
                + board.getContent()
            );

        }

    }

}