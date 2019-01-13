package lotto_run;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import lotto_model.LottoDAO;
import lotto_model.LottoVO;
import lotto_view.LottoView;

public class LottoRun {
	
	public static void main(String[] args) {
		
		LottoDAO l_dao = LottoDAO.getInstance();
		List<LottoVO> list = null;
		try {
			list = l_dao.selectAllResult();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "������ �ҷ����� �� �߽��ϴ�.");
			e.printStackTrace();
		}
		
		new LottoView(list);
	}
}
