package swing_view;

import java.awt.Button;
import java.awt.Label;
import java.util.List;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

import swing_evt.LottoResultEvt;

public class LottoResult extends JDialog {

	public LottoResult(LottoView lv, List<Set<Integer>> listResult) {
		super(lv, "게임 결과", true);

		int numOfGame = listResult.size();
		JButton jbClose = new JButton("닫기");
		JLabel jlGame = new JLabel(numOfGame + " 게임 : " + (numOfGame * 1000) + "원");

		setLayout(null);

		for (int k = 0; k < numOfGame; k++) {

			JLabel[] arrLbl = new JLabel[45];

			for (int i = 0; i < arrLbl.length; i++) {
				if (i < 9) {
					arrLbl[i] = new JLabel("0" + Integer.toString(i + 1));
				} else {
					arrLbl[i] = new JLabel(Integer.toString(i + 1));
				}
			}

			for (int j = 0; j < arrLbl.length; j++) {
				if (listResult.get(k).contains(j + 1)) {
					arrLbl[j].setText("■");
				}
			}

			if (k == 0) {
				jlGame.setBounds(20, 10, 100, 25);
				add(jlGame);
			}

			jbClose.setBounds(125 + (220 * k), 225, 60, 30);
			add(jbClose);

			int x = 0, y = 0;
			for (int i = 0; i < arrLbl.length; i++) {
				if (i % 7 == 0 && i != 0) {
					x = 0;
					y += 25;
				}
				arrLbl[i].setBounds(15 + x + (220 * k), 55 + y, 20, 10);
				add(arrLbl[i]);
				x += 25;
			}
		}

		LottoResultEvt lre = new LottoResultEvt(this);
		jbClose.addActionListener(lre);

		setBounds(lv.getX() + 80, lv.getY() + 80, 220 * numOfGame, 315);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}
