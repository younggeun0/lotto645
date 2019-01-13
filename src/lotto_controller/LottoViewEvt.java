package lotto_controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.JOptionPane;

import lotto_model.LottoDAO;
import lotto_view.LottoResult;
import lotto_view.LottoView;

public class LottoViewEvt implements ActionListener {

	private LottoView lv;
	private LottoDAO l_dao;
	
	public LottoViewEvt(LottoView lv) {
		this.lv = lv;
		
		l_dao = LottoDAO.getInstance();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == lv.getJbExe()) {		
			try {
				int input = Integer.parseInt(lv.getJtfGame().getText());
				
				if (!lv.getJtfGame().getText().isEmpty()) {
					
					if (input > 0 && input < 6) {
						startGame(input);
					} else {
						JOptionPane.showMessageDialog(lv, "1~5 사이 값만 입력가능합니다.", "error", JOptionPane.ERROR_MESSAGE);
					}
				}
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(lv, "숫자만 입력가능합니다.", "error", JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource() == lv.getJbExit()) {
			lv.dispose();
		}
		if (e.getSource() == lv.getJbShowNum()) {
			int num = Integer.parseInt(lv.getJcbNum().getSelectedItem().toString());
			System.out.println(num);
			
			showResult(num);
		}
	}
	
	public void showResult(int num) {
		l_dao = LottoDAO.getInstance();

		String msg;
		try {
			msg = l_dao.selectOneResult(num);
			JOptionPane.showMessageDialog(lv, msg);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(lv, "회차정보를 불러오지 못 하였습니다.");
			e.printStackTrace();
		}
		
	}
	
	public void startGame(int numOfGame) {
		
		List<Set<Integer>> listResult = new ArrayList<>();
		
		for(int i=0; i<numOfGame; i++) {
			Set<Integer> setBall = new HashSet<>();
			Random r = new Random();
			
			while(true) {
				setBall.add(r.nextInt(45)+1);
				if (setBall.size() == 6) {
					listResult.add(setBall);
					break;
				}
			}
		}
		
		new LottoResult(lv, listResult);
	}
}
