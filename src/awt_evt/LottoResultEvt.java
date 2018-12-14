package awt_evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import awt_view.LottoResult;

public class LottoResultEvt extends WindowAdapter implements ActionListener {

	private LottoResult lr;
	
	public LottoResultEvt(LottoResult lr) {
		this.lr = lr;
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		lr.dispose();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		lr.dispose();
	}
}
