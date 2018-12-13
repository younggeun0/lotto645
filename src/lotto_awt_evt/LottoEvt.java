package lotto_awt_evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
			if (!lv.getTfGame().getText().isEmpty()) {
				int input = Integer.parseInt(lv.getTfGame().getText());
				
				if (input > 0 && input < 6) {
					lotto(input);
				} else {
					new LottoError(lv);
				}
			}
		}
		if (e.getSource() == lv.getBtnExit()) {
			lv.dispose();
		}
	}
	
	public void lotto(int numOfGame) {
		new LottoResult(lv);
	}
}
