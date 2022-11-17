package Domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	
	//연결관련 정보 저장용 변수
	String id = "SYSTEM";			//DB연결 id
	String pw = "1234";			//DB연결 pw
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; //연결URL(DBMS마다 상이함)

		//DB연결객체 관련 참조변수
	Connection conn = null;						//DB연결객체용 참조변수
	PreparedStatement pstmt = null;				//SQL쿼리 전송객체용 참조변수
	ResultSet rs = null;					//쿼리결과(Select결과)수신용 참조변수
		
	DAO(){
		//연결하기
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");			//DB 드라이버 로드
			conn = DriverManager.getConnection(url,id,pw); 		//DB Connection 객체 받기
			System.out.println("DB Connected...");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}