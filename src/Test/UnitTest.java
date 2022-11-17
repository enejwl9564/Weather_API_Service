package Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UnitTest {

	public static void main(String[] args) {

		// DAO Tests

//		BookDAO dao = BookDAO.getInstance();
//		boolean flag =  dao.Insert(new BookDTO(1000,"자바의정석"));
//		if(flag) {
//			System.out.println("INSERT 성공!");
//		}

		// Service Tests

//		BookService service = new BookService();
//		//boolean flag = service.RegisterBook(new BookDTO(2020, "윤성우C언어"), 0); // 권한은 3이상일때만 허용하겠다! 실패..
//		  boolean flag = service.RegisterBook(new BookDTO(2020,"윤성우C언어"), 3); //권한은 3이상일때만 허용하겠다! 성공!
//		if (flag) {
//			System.out.println("Register BOOK 성공!");
//		}else {
//			System.out.println("Register BOOK 실패!");
//		}
		
		
		//MemberDAO Tests
		
//		MemberDAO dao = MemberDAO.getInstance();
//		int result = dao.Insert(new MemberDTO("mem1","1111"));
//		if(result>0) {
//			System.out.println("INSERT 성공!");
//		}else {
//			System.out.println("INSERT 실패..");
//		}
		
//		FrontController controller = new FrontController();
//		//controller.ExSubController("/member", 5);
//		//도서 등록 (메뉴,SN, 책DTO)
//		Object obj = controller.ExSubController("/book", 1, new BookDTO(5050,"SpringFramwork기본서"));
//		if(obj!=null) {
//			System.out.println("[View]" + obj.toString());
//		}else {
//			System.out.println("[View] "+obj.toString());
//		}
		

//		MemberDAO dao = MemberDAO.getInstance();
//		MemberDTO dto = dao.Select("mgr1");
//		System.out.println("DTO : " + dto);

		
//		AuthService service = AuthService.getInstance();
//		Integer result= service.LoginCheck("mgr1", "1111");
//		if(result!=null) {
//			System.out.println("[VIEW] 로그인 성공! ROLE : " + result);
//		}else {
//			System.out.println("[VIEW] 로그인 실패..");
//		}

		
		
//		FrontController controller = new FrontController();
//		
//		//서비스요청 , 요청번호 , DTO
//		Integer result = (Integer)controller.ExSubController("/auth", 1, new MemberDTO("mea","1111"));
//		if(result==null) {
//			System.out.println("[VIEW] 로그인 실패..");
//		}else {
//			System.out.println("[VIEW] 로그인 성공 ROLE : " + result);
//		}
		
		//LendDAO dao = LendDAO.getInstance();
		//dao.Insert(new LendDTO(0,1010,"aaa","2022-11-10","2022-11-17"));
		


//		//DataFormat지정 객체
//		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
//		//날짜정보객체
//		Calendar cal = Calendar.getInstance();
//		//현재 날짜정보를 문자열로 저장 start
//		String start = fmt.format(cal.getTime()).toString();		
//		System.out.println("start : " + start);
		
		
		
//		boolean Loginstate=false;
//		String userid=null;
//		Integer perm = 0; //0 비회원 , 1 회원 2 관리자(사서)
//		//인증 서비스
//		AuthService authservice = AuthService.getInstance();
//		
//		perm = authservice.LoginCheck("mem1", "1111");
//		if(perm!=null) {
//			Loginstate=true;
//			userid="mem1";
//		}else {
//			perm=0;
//		}
//		//대여 서비스
//		LendService lendservice = LendService.getInstance();
//		
//		boolean result= lendservice.Lendbook(Loginstate, perm, userid, 4040);
//		if(result) {
//			System.out.println("[VIEW] 대여성공!");
//		}else {
//			System.out.println("[VIEW] 대여실패!");
//		}
		
		
		//LendController Tests
		
		
//		boolean Loginstate=false;
//		String userid=null;
//		Integer perm = 0; //0 비회원 , 1 회원 2 관리자(사서)
//		
//		FrontController controller=new FrontController();
//		//1 로그인
//		perm=(Integer)controller.ExSubController("/auth", 1, new MemberDTO("mem1","1111"));
//		if(perm>0) {
//			userid="mem1";
//			Loginstate=true;
//		}
//		//대여하기
//		LendDTO ldto = new LendDTO();
//		ldto.setMemId(userid);
//		ldto.setLogin(Loginstate);
//		ldto.setPerm(perm);
//		ldto.setBookcode(3030);
//
//		
//		String msg=(String)controller.ExSubController("/lend", 1,ldto);
//		System.out.println("[VIEW] " + msg);
		
		
		//로그인 이후 전체 도서 정보를 Console 화면에 출력합니다
		
		
//		boolean Loginstate=false;
//		String userid=null;
//		Integer perm = 0; //0 비회원 , 1 회원 2 관리자(사서)
//		
//		FrontController controller=new FrontController();
//		//1 로그인
//		perm=(Integer)controller.ExSubController("/auth", 1, new MemberDTO("mem1","1111"));
//		if(perm>0) {
//			userid="mem1";
//			Loginstate=true;
//		}
//		//2 전체 도서조회
//		ArrayList<BookDTO> list = (ArrayList<BookDTO>) controller.ExSubController("/book", 5, null);
//		for(BookDTO dto : list) {
//			System.out.println(dto.toString());
//		}
//		
		
//		BookDAO dao = BookDAO.getInstance();
//		
//		for(int i=1;i<10;i++) {
//			dao.Insert(new BookDTO(3000+i,"Book"+i));
//		}
	
	}

}
