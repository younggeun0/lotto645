package awt_view;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Label;

import awt_evt.LottoErrorEvt;

public class LottoError extends Dialog {
	
	public LottoError(LottoView lv) {
		super(lv, "error", true);
		
		Button btnClose = new Button("닫기");
		Label lblError = new Label("1~5 사이값만 입력가능합니다.");
		
		setLayout(null);
		
		btnClose.setBounds(200, 55, 55, 30);
		add(btnClose);
		lblError.setBounds(20, 40, 180, 25);
		add(lblError);
		
		LottoErrorEvt lee = new LottoErrorEvt(this);
		btnClose.addActionListener(lee);
		addWindowListener(lee);
		
		setBounds(lv.getX()+15, lv.getY()+100, 270, 100);
		setVisible(true);
	}
}
