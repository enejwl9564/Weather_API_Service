package Service;

import Domain.DTO;
import Domain.MemberDAO;
import Domain.MemberDTO;

public class MemberService {

	private MemberDAO dao = MemberDAO.getInstance();

	// 싱글톤 패턴 코드 추가
	private static MemberService instance;

	public static MemberService getInstance() {
		if (instance == null)
			instance = new MemberService();
		return instance;
	}
	
	public MemberService() {}
	
	public int insertMember(MemberDTO dto) {
		return dao.Insert(dto);
	}
	
	public String selectMember(String id) {
		MemberDTO dto = null;
		dto = dao.Select(id);
		
		return dto.getMemId();
	}


	// 멤버 등록하기
	public boolean RegisterMember(MemberDTO dto) {	
			int result = dao.Insert(dto);
				if(result>0)
					return true;
		return false;
	}
	
	//도서 수정하기
	//도서 삭제하기
	//기타..
}
