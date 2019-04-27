import java.awt.event.*;
import javax.swing.*;

public class ComputerListener implements ActionListener{
	JTextField lengthInput,weightInput;
	JTextArea ouputResult;
	String unit,state;
	public void setLength(JTextField lengthInput) {
		this.lengthInput=lengthInput;
	}
	public void setWeightInput(JTextField weightInput) {
		this.weightInput=weightInput;
	}
	public void setOutputResult(JTextArea outputResult) {
		this.ouputResult=outputResult;
	}
	public void setUnit(String unit) {
		this.unit=unit;
	}
	public void actionPerformed(ActionEvent e) {
		try {
			double length=Double.parseDouble(lengthInput.getText());
			double weight=Double.parseDouble(weightInput.getText());
			double result=0;
			
			if(unit.equalsIgnoreCase("厘米/斤")) {
				length=length/100;
				weight=weight/2;
			}
			result=weight/(length*length);
			
			if(result>=28) {
				state="极度肥胖";
			}
			else if(result>=24 && result<28) {
				state="超重";
			}
			else if(result>=18.5 && result<24) {
				state="体重正常";
			}
			else {
				state="体重过轻";
			}
			ouputResult.append("您的BMI为:"+result+","+state+"\n");
		}
		catch(Exception exp) {
			ouputResult.append("\n请输入数字字符\n");
			lengthInput.setText(null);
			weightInput.setText(null);
		}
	}
}
