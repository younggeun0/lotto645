package lotto_awt_view;

import java.awt.Dialog;

import lotto_awt_evt.LottoResultEvt;

public class LottoResult extends Dialog {

	public LottoResult(LottoView lv) {
		super(lv, "게임 결과", true);
		
		LottoResultEvt lre = new LottoResultEvt(this);
		addWindowListener(lre);
		
		setBounds(lv.getX()+80, lv.getY()+80, 300, 500);
		setVisible(true);
	}
}
