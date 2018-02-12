package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.DefaultEditorKit;

public class HistoryHandler implements MouseListener, ActionListener {
	
	JTextArea textArea;
	JButton loader;
	Action selectLine;
	
	HistoryHandler(JTextArea textbox, JButton loadButton) {
		this.loader = loadButton;
		this.textArea = textbox;
		selectLine = getAction(DefaultEditorKit.selectLineAction);
	}
	
	private Action getAction(String name) {
		Action action = null;
		Action[] actions = textArea.getActions();
 
		for (int i = 0; i < actions.length; i++) {
			if (name.equals( actions[i].getValue(Action.NAME).toString() ) ) {
				action = actions[i];
				break;
			}
		}
		return action;
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		if ( SwingUtilities.isLeftMouseButton(e)  && e.getClickCount() == 1) {
            selectLine.actionPerformed(null);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == loader) {
			
		}
		
	}

}
