package View;

import java.util.List;
import java.util.Scanner;

import Controller.FrontController;
import Domain.BoardDTO;
import Domain.MemberDTO;
import Service.ApiService;
import Service.BoardService;

public class TUIView {
	// 멤버
	private boolean Loginstate = false;
	private String userid = null;
	private Integer perm = 0; // 0 비회원 , 1 회원 2 관리자(사서)

	private FrontController controller = new FrontController();
	private ApiService api = new ApiService();

	Scanner sc = new Scanner(System.in);
	int n = 0;

	TUIView() {
		mainview();
	}

	void mainview() {
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
				String waether;
				try {
					waether = api.Waether();
					System.out.println(waether);					
				} catch (Exception e) {
					e.printStackTrace();
				}
					
				break;
			case 2:
				
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
	                  System.out.print("작성자를 입력 : " );
	                  String memid = sc.next();
	                  System.out.print("제목를 입력 : " );
	                  String Title = sc.next();
	                  System.out.print("카테고리를 입력 : " );
	                  String Categori = sc.next();
	                  System.out.print("내용를 입력 : " );
	                  String Constens = sc.next();
	                  
	                  BoardDTO dto = new BoardDTO(Title, Categori, memid, Constens);	                  
	                  int result = BoardService.insertBoard(dto);
	                  
	            }      
	            break;
			case 5:
				
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

	void loginview() {
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
	
	public static void main(String[] args) {
			new TUIView();
	}
}




