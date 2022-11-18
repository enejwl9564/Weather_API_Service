package Controller;

import Domain.BoardDTO;
import Domain.DTO;
import Service.BoardService;

public class BoardController implements SubController {
	
	BoardService service = new BoardService();

	@Override
	public Object excute(int SN, DTO dto) {
		Object obj = null;
		boolean flag = false;
		switch(SN) {
		case 1:	//등록
//			System.out.println("도서등록 서비스 요청");
			BoardDTO down = (BoardDTO)dto;
			flag= service.RegisterBoard(down, 3);
			System.out.println("[System] 게시글 등록 성공 여부 : " + flag);
			if(flag) {
				obj="게시글 등록이 완료되었습니다.";
			}else {
				obj="게시글 등록이 되지 않았습니다.";
			}
			break;
		case 2:	//삭제
			System.out.println("구현 중입니다.");
			break;
		case 3:	//수정
			System.out.println("구현 중입니다.");
			break;
		case 4:	//조회
			System.out.println("구현 중입니다.");
			break;
		case 5:	//전체조회
			obj = service.ShowAllBoard();
			break;
		default:
			System.out.println("잘못된 서비스 요청입니다.");
		}
		
		
		return obj;
	}

}
