package Domain;

import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDAO extends DAO{
	
	//싱글톤 패턴 코드 추가
		private static BoardDAO instance;
		public static BoardDAO getInstance() {
			if(instance==null);
				instance = new BoardDAO();
			return instance;
		}
		
		
	// 등록하기
		public int Insert(BoardDTO dto) {
			
//			private String memid;
//			private Date Bdate;
//			private String Title;
//			private String Categori;
//			private String Constens;
			// pstmt
			int result = 0;
			try {
				pstmt = conn.prepareStatement("insert into tbl_Board values(?,?,?,?,?)");
				pstmt.setString(1, dto.getMemid());
				pstmt.setString(2, dto.getBdate());
				pstmt.setString(1, dto.getTitle());
				pstmt.setString(2, dto.getCategori());
				pstmt.setString(3, dto.getConstens());
				result = pstmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try{pstmt.close();}catch(Exception e) {e.printStackTrace();}
			}
			return result;
		}
		
		//전체 조회하기
		public ArrayList<BoardDTO> SelectAll() {

			ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
			BoardDTO dto;
			// pstmt

			try {
				pstmt = conn.prepareStatement("select * from tbl_Board");
				rs = pstmt.executeQuery();
				if (rs != null) {
					while (rs.next()) {
						dto = new BoardDTO();
						dto.setTitle(rs.getString("Title"));
						dto.setBdate(rs.getString("BDate"));
						dto.setCategori(rs.getString("Categori"));
						dto.setConstens(rs.getString("Constens"));
						dto.setMemid(rs.getString("Memid"));
						list.add(dto);
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try{rs.close();}catch(Exception e) {e.printStackTrace();}
				try{pstmt.close();}catch(Exception e) {e.printStackTrace();}
			}

			return list;

		}

}
