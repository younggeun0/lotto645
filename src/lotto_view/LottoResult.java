package lotto_view;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.List;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import lotto_controller.LottoResultEvt;

@SuppressWarnings("serial")
public class LottoResult extends JDialog {

	public LottoResult(LottoView lv, List<Set<Integer>> listResult) {
		super(lv, "게임 결과", true);

		int numOfGame = listResult.size();
		JButton jbClose = new JButton("닫기");
		JLabel jlGame = new JLabel(numOfGame + " 게임 : " + (numOfGame * 1000) + "원");

		setLayout(null);

		for (int k = 0; k < numOfGame; k++) {

			JPanel jp = new JPanel();
			LineBorder lb = new LineBorder(Color.MAGENTA);
			jp.setBorder(lb);
			
			JLabel[] arrLbl = new JLabel[45];
			
			jp.setLayout(new GridLayout(7, 7));

			for (int i = 0; i < arrLbl.length; i++) {
				if (i < 9) {
					arrLbl[i] = new JLabel("  0" + Integer.toString(i + 1));
				} else {
					arrLbl[i] = new JLabel("  " + Integer.toString(i + 1));
				}
			}

			for (int j = 0; j < arrLbl.length; j++) {
				if (listResult.get(k).contains(j + 1)) {
					arrLbl[j].setText("  ■");
				}
			}

			if (k == 0) {
				jlGame.setBounds(20, 10, 100, 25);
				add(jlGame);
			}

			jbClose.setBounds(133 + (220 * k), 225, 60, 30);
			add(jbClose);

			jp.setBounds(10 + (220 * k), 40, 185, 180);
			add(jp);
			
			for (int i = 0; i < arrLbl.length; i++) {
				jp.add(arrLbl[i]);
			}
		}

		LottoResultEvt lre = new LottoResultEvt(this);
		jbClose.addActionListener(lre);

		setBounds(lv.getX() + 80, lv.getY() + 80, 220 * numOfGame, 315);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}
