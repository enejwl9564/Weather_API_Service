package View;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import Controller.FrontController;
import Domain.ApiDTO;
import Domain.BoardDTO;
import Domain.MemberDTO;
import Service.ApiService;

public class TUIView {
	// 멤버
	private boolean Loginstate = false;
	private String userid = null;
	private Integer perm = 0; // 0 비회원 , 1 회원 2 관리자(사서)

	private FrontController controller = new FrontController();
	private ApiService api = new ApiService();

	Scanner sc = new Scanner(System.in);
	int n = 0;

	TUIView() throws Exception {
		mainview();
	}

	void mainview() throws Exception {
		while (true) {
			System.out.println("-----------------M A I N---------------");
			System.out.println("1 날씨 조회");
			System.out.println("2 회원가입");
			System.out.println("3 게시글 조회");
			System.out.println("4 게시글 등록");
			System.out.println("5 게시글 수정");
			System.out.println("6 게시글 삭제");
			System.out.println("7 종료");
			System.out.println("-----------------M A I N---------------");
			System.out.print("번호 : ");
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("----------- Area List -----------");
				System.out.println("서울 , 대구 , 부산 , 인천 , 대전");
				System.out.println("----------- Area List -----------");
				ApiDTO Adto = new ApiDTO();
				System.out.println("지명을 입력하세요");
				String area = sc.next();
				
				switch(area) {
				case "서울":
					Adto.setLon("126.97806");
					Adto.setLat("37.56667");
					controller.ExSubController("/api", 1, Adto);
					break;
				case "대구":
					Adto.setLon("128.593737");
					Adto.setLat("35.865737");
					controller.ExSubController("/api", 1, Adto);
					break;
				case "부산":
					Adto.setLon("129.07556");
					Adto.setLat("35.17944");
					controller.ExSubController("/api", 1, Adto);
					break;
				case "인천":
					Adto.setLon("126.70528");
					Adto.setLat("37.45639");
					controller.ExSubController("/api", 1, Adto);
					break;
				case "대전":
					Adto.setLon("127.38500");
					Adto.setLat("36.35111");
					controller.ExSubController("/api", 1, Adto);
					break;
				default:
					System.out.println("잘못입력");
					break;
				}
				
				
				break;
			case 2:
				MemberDTO dto2 = new MemberDTO();
            	
                System.out.print("ID 입력 : " );
                String memid1 = sc.next();
                dto2.setMemId(memid1);
                System.out.print("비밀번호 : " );
                String pwd1 = sc.next();
                dto2.setPwd(pwd1);
//                ---------------미구현-----------------
//                System.out.print("비밀번호 확인 : " );
//                String pwd2 = sc.next();
//                System.out.println(pwd1+","+pwd2);
//                if(pwd1 == pwd2) {
//                	System.out.println("성공");
//                	dto2.setPwd(pwd1);
//                }else {
//                	System.out.println("비밀번호가 맞지 않습니다.");
//                } ---------------미구현-----------------
                System.out.print("이름 : " );
                String mname = sc.next();
                dto2.setName(mname);
                controller.ExSubController("/member", 1, dto2);
				break;
			case 3:
				if(!Loginstate) {
					loginview();
				}else {
					List<BoardDTO> list =(List<BoardDTO>) controller.ExSubController("/board", 5, null);
					for(BoardDTO dto : list) {
						System.out.println("[VIEW] " + dto);
					}
				}
				break;
			case 4:
	            if(!Loginstate) {
	               loginview();
	            }else {
	            	BoardDTO dto1 = new BoardDTO();
	            	
	                  System.out.print("작성자를 입력 : " );
	                  String memid = sc.next();
	                  dto1.setMemid(memid);
	                  System.out.print("제목를 입력 : " );
	                  String Title = sc.next();
	                  dto1.setTitle(Title);
	                  System.out.print("카테고리를 입력 : " );
	                  String Categori = sc.next();
	                  dto1.setCategori(Categori);
	                  System.out.print("내용를 입력 : " );
	                  String Constens = sc.next();
	                  dto1.setConstens(Constens);
	                  
	                //DataFormat지정 객체
	  				SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
	  				//날짜정보객체
	  				Calendar cal = Calendar.getInstance();
	  				//현재 날짜정보를 문자열로 저장 start
	  				String start = fmt.format(cal.getTime()).toString();
	  				dto1.setBdate(start);
	  				
	  				controller.ExSubController("/board", 1, dto1);
	                  
	                  
	                  
//	                  BoardDTO dto = new BoardDTO(Title, Categori, memid, Constens);	                  
//	                  int result = BoardService.insertBoard(dto);
	                  
	            }      
	            break;
			case 5:
				if(!Loginstate) {
		               loginview();
		            }else {
		            	BoardDTO dto3 = new BoardDTO();
		            	System.out.print("수정하고싶은 보드 id 입력 : " );
		                String Boardid = sc.next();
		                dto3.setBoardid(Boardid);
		                System.out.print("제목를 입력 : " );
		                String Title = sc.next();
		                dto3.setTitle(Title);
		                System.out.print("카테고리를 입력 : " );
		                String Categori = sc.next();
		                dto3.setCategori(Categori);
		                System.out.print("내용를 입력 : " );
		                String Constens = sc.next();
		                dto3.setConstens(Constens);
		                //DataFormat지정 객체
		    			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		    			//날짜정보객체
		    			Calendar cal = Calendar.getInstance();
		    			//현재 날짜정보를 문자열로 저장 start
		    			String start = fmt.format(cal.getTime()).toString();
		    			dto3.setBdate(start);
		    		 	controller.ExSubController("/board", 3, dto3);
		            }
				
				break;
				
			case 6:
				
				break;
			case 7:
				System.out.println("[VIEW] 종료합니다.");
				System.exit(-1);
				break;
			default:

			} // switch 끝
		} // while끝
	} // mainview 끝

	void loginview() throws Exception {
		System.out.println("----------------- L O G I N ---------------");
		System.out.print("ID/PW 입력 : ");
		String id=sc.next();
		String pwd=sc.next();
		Integer result= (Integer)controller.ExSubController("/auth", 1, new MemberDTO(id,pwd));
		if(result!=null) {
			//권한 1,2 를 획득
			Loginstate=true;
			perm=result;
			userid=id;	
		}else {
			System.out.println("[VIEW-ERROR] 로그인 실패!");
		}
	}
	
	public static void main(String[] args) throws Exception {
			new TUIView();
	}
}




