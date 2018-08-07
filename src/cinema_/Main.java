package cinema_;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.*;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main {
	
	public static void main(String[] args) {
	init();	
	}

	public static void init() {
		JFrame mainFrame = new JFrame("Cinema System");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setBounds(0,0,500,500);
		mainFrame.setResizable(false);	
		
		JPanel mainPanel = new JPanel(new GridLayout(30,1));
		mainPanel.setBackground(Color.YELLOW);
		
		mainFrame.add(mainPanel);
		
		JLabel question = new JLabel("What day would you like to make a booking?");
		mainPanel.add(question);
		
		JCheckBox mondayCheckBox = new JCheckBox("Monday", false);
		mainPanel.add(mondayCheckBox);
		JCheckBox tuesdayCheckBox = new JCheckBox("Tuesday", false);
		mainPanel.add(tuesdayCheckBox);
		JCheckBox wednesdayCheckBox = new JCheckBox("Wednesday", false);
		mainPanel.add(wednesdayCheckBox);
		JCheckBox thursdayCheckBox = new JCheckBox("Thursday", false);
		mainPanel.add(thursdayCheckBox);
		JCheckBox fridayCheckBox = new JCheckBox("Friday", false);
		mainPanel.add(fridayCheckBox);
		JCheckBox saturdayCheckBox = new JCheckBox("Saturday", false);
		mainPanel.add(saturdayCheckBox);
		JCheckBox sundayCheckBox = new JCheckBox("Sunday", false);
		mainPanel.add(sundayCheckBox);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(mondayCheckBox);
		bgroup.add(tuesdayCheckBox);
		bgroup.add(wednesdayCheckBox);
		bgroup.add(thursdayCheckBox);
		bgroup.add(fridayCheckBox);
		bgroup.add(saturdayCheckBox);
		bgroup.add(sundayCheckBox);
		
		mainFrame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainFrame.setVisible(true);
	}
}
