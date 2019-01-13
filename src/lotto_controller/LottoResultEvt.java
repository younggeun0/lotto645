package lotto_controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lotto_view.LottoResult;

public class LottoResultEvt implements ActionListener {

	private LottoResult lr;
	
	public LottoResultEvt(LottoResult lr) {
		this.lr = lr;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		lr.dispose();
	}
}
