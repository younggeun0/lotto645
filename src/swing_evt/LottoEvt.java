package swing_evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.JOptionPane;

import swing_view.LottoResult;
import swing_view.LottoView;

public class LottoEvt implements ActionListener {

	private LottoView lv;
	
	public LottoEvt(LottoView lv) {
		this.lv = lv;
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
