package Controller;

import Domain.DTO;
import Domain.MemberDTO;
import Service.MemberService;

public class MemberController implements SubController{
	
	MemberService service = new MemberService();

	@Override
	public Object excute(int SN ,DTO dto) {
		Object obj = null;
		
		switch(SN)
		{
		case 1:	//회원 등록
			MemberDTO down =(MemberDTO)dto;
			obj = service.insertMember(down);
			break;
		case 2:	//회원 조회
			MemberDTO down1 = (MemberDTO)dto;
			String id = down1.getMemId();
			obj = service.selectMember(id);
			break;
		case 3:	//회원 수정
			System.out.println("회원수정 서비스 요청");
			break;
		case 4:	//회원 삭제
			System.out.println("회원삭제 서비스 요청");
			break;
		default:
			System.out.println("잘못된 서비스 요청입니다.");
		}
		
		return null;
	}

	//1 파라미터 받기
	//1) 회원등록 ,2) 회원수정 , 3) 회원 삭제
	
	
	//2 입력값 검증(Validation Check)
	//
	
	//3 서비스 실행
	
	
	//4 View로 이동(내용전달 포함)
	
	
	
}
