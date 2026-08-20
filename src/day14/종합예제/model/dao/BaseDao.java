package day14.종합예제.model.dao;
import java.sql.Connection;
import java.sql.DriverManager;




public class BaseDao {
    
    private String url = "jdbc:mysql://127.0.0.1:3306/mydb0813";
    private String user = "root";
    private String password = "1234";
    
    // 2. 연동 인터페이스 , protected : 상속관계이면 다른패키지도 접근 허용

    protected Connection conn; 

    private void connect ( ) { 
        try{
        // 3-1 : Driver 로드 한다.
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url , user , password);
    } catch (Exception e) {
        System.out.println("데이터베이스 연동 실");
    }
    }
    protected BaseDao(){connect();}
}
