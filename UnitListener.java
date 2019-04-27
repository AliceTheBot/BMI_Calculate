import java.awt.event.*;
import javax.swing.*;

public class UnitListener implements ItemListener{
	JComboBox choiceUnit=new JComboBox<String>();
	ComputerListener computerL=new ComputerListener();
	public void setChoiceUnit(JComboBox<String> choiceUnit) {
		this.choiceUnit=choiceUnit;
	}
	public void setComputerL(ComputerListener computerL) {
		this.computerL=computerL;
	}
	public void itemStateChanged(ItemEvent e) {
		String unit=choiceUnit.getSelectedItem().toString();
		computerL.setUnit(unit);
	}
	
}
