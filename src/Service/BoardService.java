package Service;

import java.util.ArrayList;

import Domain.BoardDAO;
import Domain.BoardDTO;

public class BoardService {
	
	static BoardDAO dao = BoardDAO.getInstance();
	BoardDTO dto = new BoardDTO();
	
	// 싱글톤 패턴 코드 추가
	private static BoardService instance;

	public static BoardService getInstance() {
		if (instance == null)
			instance = new BoardService();
		return instance;
	}

	public BoardService() {}
	
public boolean RegisterBoard(BoardDTO dto,int permission) {
		
		boolean isRegisterOK=true;
		
		//권한 체크(등록가능한지여부)	
//		if(permission>=3) {
//			
//			int result = dao.Insert(dto);
//			if(result>0) {
//				return true;
//			}
//		}
		
		return false;
	}
	public ArrayList<BoardDTO> ShowAllBoard() {
		return dao.SelectAll();
	}
	
	public static int insertBoard(BoardDTO dto) {
//		BoardDTO down = (BoardDTO)dto;
		return dao.InsertBoard(dto);
		
	}
	
	public static int deletBoard(BoardDTO dto) {
		return dao.DeletBoard(dto);
	}
//	public int InsertBoard(BoardDTO dto) {
//		int result = dao.InsertBoard(dto);
//		return result;
//	}
//	
}
