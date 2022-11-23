package Controller;

import Domain.ApiDTO;
import Domain.DTO;
import Service.ApiService;

public class ApiController implements SubController {
	
	ApiService service = new ApiService();
	

	@Override
	public Object excute(int SN, DTO dto) throws Exception {
		Object obj = null;
		boolean flag = false;
		switch(SN) {
		
		case 1:	//조회
			ApiDTO Adto = (ApiDTO)dto;
			obj = service.Waether(Adto);
			break;
		case 2:	//수정
			System.out.println("구현 중입니다.");
			break;
		default:
			System.out.println("잘못된 서비스 요청입니다.");
		}
		
		
		return obj;
	}

}
