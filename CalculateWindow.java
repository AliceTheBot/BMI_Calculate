import java.awt.*;
import javax.swing.*;

public class CalculateWindow extends JFrame{
	JTextField lengthInput,weightInput;
	JComboBox<String>choiceUnit;
	JTextArea outputResult;
	JButton button;
	UnitListener unitL;
	ComputerListener computerL;
	
	CalculateWindow(){
		init();
		setBounds(100,100,390,360);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void init() {
		setLayout(new FlowLayout());
		lengthInput=new JTextField(5);
		weightInput=new JTextField(5);
		choiceUnit=new JComboBox<String>();
		button=new JButton("计算");
		choiceUnit.addItem("选择体重单位");
		choiceUnit.addItem("厘米/斤");
		choiceUnit.addItem("米/公斤");
		outputResult=new JTextArea(9,30);
		unitL=new UnitListener();
		computerL=new ComputerListener();
		unitL.setChoiceUnit(choiceUnit);
		unitL.setComputerL(computerL);
		computerL.setLength(lengthInput);
		computerL.setWeightInput(weightInput);
		computerL.setOutputResult(outputResult);
		choiceUnit.addItemListener(unitL);
		button.addActionListener(computerL);
		add(lengthInput);
		add(choiceUnit);
		add(weightInput);
		add(button);
		add(new JScrollPane(outputResult));
	}
}
