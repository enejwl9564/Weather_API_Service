package Domain;

public class MemberDAO extends DAO {
	
	//싱글톤 패턴 코드 추가
		private static MemberDAO instance;
		public static MemberDAO getInstance() {
			if(instance==null);
				instance = new MemberDAO();
			return instance;
		}
		
	//회원가입
	public int Insert(MemberDTO dto) {

		int result=0;
		try {
			pstmt = conn.prepareStatement("insert into tbl_member values(?,?,?)");
			pstmt.setString(1, dto.getMemId());
			pstmt.setString(2, dto.getPwd());
			pstmt.setString(3, dto.getName());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	//조회하기
	public MemberDTO Select(String id) {
		//pstmt
		MemberDTO dto=null;
		try {
			pstmt = conn.prepareStatement("select * from tbl_member where memId=?");
			pstmt.setString(1, id);
		
			rs = pstmt.executeQuery();
			if(rs!=null) {
				while(rs.next()) {
					dto = new MemberDTO();
					dto.setMemId(rs.getString("memId"));
					dto.setPwd(rs.getString("pwd"));
					dto.setName(rs.getString("name"));
					dto.setRole(rs.getInt("mrole"));
				}		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try{rs.close();}catch(Exception e) {e.printStackTrace();}
			try{pstmt.close();}catch(Exception e) {e.printStackTrace();}
		}
		return dto;
	}
	
	
}
