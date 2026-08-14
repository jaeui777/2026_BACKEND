package day12.종합예제.model.dao;
import java.util.ArrayList;

public boolean save( BoardDto boardDto ){
        try{ 
            // 1.1 SQL 작성 , 값에 와일드카드(?) 이용한 매개변수 대입 
            String sql = "insert into board(content,writer) values( ? , ? )";
            // 1.2 연동된 데이터베이스에 SQL 기재 , 예외 필수
            PreparedStatement ps = conn.prepareStatement( sql ); // conn 멤버변수는 BaseDao에게 물려받음.
            // 1.3 기재된 SQL문법내 ?(와일드카드) 매개변수 값 대입, ps.set타입( ?순서번호 , 값 );
            ps.setString(1, boardDto.getContent() ); // 1( 첫번째 ? ) 에 dto content 대입
            ps.setString(2, boardDto.getWriter() ); // 2( 두번째 ? ) 에 dto writer 대입 
            // 1.4 기재된 SQL 실행 , .executeUpdate() insert/update/delete 에서 사용
            int result = ps.executeUpdate(); // 실행 후 처리된 레코드 수 반환 
            // 1.5 SQL 결과
            if( result == 1 ) return true; // 성공 의미 갖는 true 반환 
        }catch( SQLException e ){ System.out.println( e ); }
        // 1.5 SQL 결과 
        return false; // 실패 의미 갖는 false 반환
    } // 등록 end 
    // [2] 게시물 전체 조회 로직
    public ArrayList<BoardDto> findAll( ){
        // 1. controller 에게 매개변수 받는다.현재는 없음
        // * 추후에 select 이용한 db 조회
        // 2. 리스트 전체 반환
        return boardList;

        //[4] 개별삭제 VIEW
    }
}
