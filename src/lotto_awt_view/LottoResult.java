package lotto_awt_view;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Label;
import java.util.List;
import java.util.Set;

import lotto_awt_evt.LottoResultEvt;

public class LottoResult extends Dialog {

	public LottoResult(LottoView lv, List<Set<Integer>> listResult) {
		super(lv, "게임 결과", true);
		
		int numOfGame = listResult.size();
		Button btnClose = new Button("닫기");
		Label lblGame = new Label(numOfGame+" 게임 : "+(numOfGame*1000)+"원"); 

		setLayout(null);
				
		for(int k=0; k<numOfGame; k++) {
			
			Label[] arrLbl = new Label[45];
			
			for(int i=0; i<arrLbl.length; i++) {
				if (i<9) {
					arrLbl[i] = new Label("0"+Integer.toString(i+1));
				} else {
					arrLbl[i] = new Label(Integer.toString(i+1));
				}
			}
			
			for(int j=0; j<arrLbl.length; j++) {
				if (listResult.get(k).contains(j+1)) {
					arrLbl[j].setText("■");
				}
			}
		
			
			if(k == 0) {
				lblGame.setBounds(20, 40, 100, 25);
				add(lblGame);
			}
			
			btnClose.setBounds(135+(200*k), 245, 50, 30);
			add(btnClose);
			
			int x = 0, y = 0;
			for(int i=0; i<arrLbl.length; i++) {
				if (i%7 == 0 && i != 0) {
					x = 0;
					y+=25;
				}
				arrLbl[i].setBounds(15+x+(200*k), 75+y, 20, 10);
				add(arrLbl[i]);
				x+=25;
			}
		}
		
		LottoResultEvt lre = new LottoResultEvt(this);
		btnClose.addActionListener(lre);
		addWindowListener(lre);
		
		setBounds(lv.getX()+80, lv.getY()+80, 200*numOfGame, 300);
		setVisible(true);
	}
}
