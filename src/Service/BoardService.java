package Service;

import java.util.ArrayList;

import Domain.BoardDAO;
import Domain.BoardDTO;

public class BoardService {
	
	BoardDAO dao = BoardDAO.getInstance();
	
	// 싱글톤 패턴 코드 추가
	private static BoardService instance;

	public static BoardService getInstance() {
		if (instance == null)
			instance = new BoardService();
		return instance;
	}

	private BoardService() {}
	
public boolean RegisterBoard(BoardDTO dto,int permission) {
		
		boolean isRegisterOK=true;
		
		//권한 체크(등록가능한지여부)	
		if(permission>=3) {
			
			int result = dao.Insert(dto);
			if(result>0) {
				return true;
			}
		}
		
		return false;
	}
	public ArrayList<BoardDTO> ShowAllBoard() {
		return dao.SelectAll();
	}
	
	
}
