package awt_evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import awt_view.LottoError;

public class LottoErrorEvt extends WindowAdapter implements ActionListener {

	private LottoError le;
	
	public LottoErrorEvt(LottoError le) {
		this.le = le;
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		le.dispose();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		le.dispose();
	}
}
