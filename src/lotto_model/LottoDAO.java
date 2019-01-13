package lotto_model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LottoDAO {
	
	private static LottoDAO l_dao;
	
	private LottoDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static LottoDAO getInstance() {
		if (l_dao == null) {
			l_dao = new LottoDAO();
		}
		return l_dao;
	}
	
	public Connection getConnection() throws SQLException {
		
		Connection con = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pw = "tiger";
		
		con = DriverManager.getConnection(url, id, pw);
		
		return con;
	}
	
	public String selectOneResult(int num) throws SQLException {
		StringBuilder msg = new StringBuilder();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			con = getConnection();
			
			String selectOneResult 
			 = "SELECT num, ball1, ball2, ball3, ball4, ball5, b_ball, TO_CHAR(input_date, 'yyyy-mm-dd') input_date FROM lotto WHERE num=?";
			pstmt = con.prepareStatement(selectOneResult);
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				msg
				.append(rs.getInt("num")).append("회 당첨 정보(")
				.append(rs.getString("input_date")).append(")\n")
				.append(rs.getInt("ball1")).append(", ").append(rs.getInt("ball2")).append(", ")
				.append(rs.getInt("ball3")).append(", ").append(rs.getInt("ball4")).append(", ")
				.append(rs.getInt("ball5")).append(", 보너스 : ").append(rs.getInt("b_ball"));
			}
			
		} finally {
			if (rs != null) { rs.close(); }
			if (pstmt != null) { pstmt.close(); }
			if (con != null) { con.close(); }
		}
		
		return msg.toString();
	}
	
	public List<LottoVO> selectAllResult() throws SQLException {
		List<LottoVO> list = new ArrayList<LottoVO>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();
			
			StringBuilder selectAllResult = new StringBuilder();
			
			selectAllResult
			.append("SELECT num, ball1, ball2, ball3, ball4, ball5, b_ball,")
			.append("TO_CHAR(input_date, 'yyyy-mm-dd') input_date ")
			.append("FROM lotto ORDER BY num DESC");
			
			pstmt = con.prepareStatement(selectAllResult.toString());
			rs = pstmt.executeQuery();
			
			LottoVO tempVO = null;
			while(rs.next()) {
				tempVO = new LottoVO(rs.getInt("num"), rs.getInt("ball1"), rs.getInt("ball2"),
						rs.getInt("ball3"), rs.getInt("ball4"), rs.getInt("ball5"), rs.getInt("b_ball"), rs.getString("input_date"));
				list.add(tempVO);
			}
			
		} finally {
			if (rs != null) { rs.close(); }
			if (pstmt != null) { pstmt.close(); }
			if (con != null) { con.close(); }
		}
		
		return list;
	}
}
