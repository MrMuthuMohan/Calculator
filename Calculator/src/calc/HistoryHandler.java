package calc;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class HistoryHandler implements MouseListener {
	
	JTextArea textArea;
	JButton loader;
	Action selectLine;
	
	HistoryHandler(JTextArea textbox, JButton loadButton) {
		this.loader = loadButton;
		this.textArea = textbox;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if ( SwingUtilities.isLeftMouseButton(e)  && e.getClickCount() == 1) {
            selectLine.actionPerformed( null );
        }
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

}
