package Controller;

import Domain.BoardDAO;
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
			
			BoardDTO down = (BoardDTO)dto;
			obj = service.insertBoard(down);
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
