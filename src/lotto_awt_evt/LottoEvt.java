package lotto_awt_evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import lotto_awt_view.LottoError;
import lotto_awt_view.LottoResult;
import lotto_awt_view.LottoView;

public class LottoEvt extends WindowAdapter implements ActionListener {

	private LottoView lv;
	
	public LottoEvt(LottoView lv) {
		this.lv = lv;
	}
	@Override
	public void windowClosing(WindowEvent e) {
		lv.dispose();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == lv.getBtnExe()) {		
			try {
				int input = Integer.parseInt(lv.getTfGame().getText());
				
				if (!lv.getTfGame().getText().isEmpty()) {
					
					if (input > 0 && input < 6) {
						startGame(input);
					} else {
						new LottoError(lv);
					}
				}
			} catch (Exception e2) {
				new LottoError(lv);
			}
		}
		if (e.getSource() == lv.getBtnExit()) {
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
