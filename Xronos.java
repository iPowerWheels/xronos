import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Xronos {
	public static void main (String[] args) {
	//Main is like a constructor
		//Here we start creating window
		JFrame index = new JFrame("Xronos");
		index.setSize(800, 600);
		index.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Now... we must put a panel as container
		JPanel principal = new JPanel();
		index.add(principal);
		placeComponents(principal);

		index.setVisible(true);
	}

	private static void placeComponents(JPanel index) {
	//Window components
		index.setLayout(null);

		JLabel greeting = new JLabel("Welcome");
		greeting.setBounds(100, 25, 400, 100);
		index.add(greeting);

		JLabel topicLabel = new JLabel("Text your topics");
		topicLabel.setBounds(200, 250, 200, 100);
		index.add(topicLabel);

		JTextField subject1, subject2, subject3, subject4, subject5, subject6;

		subject1 = new JTextField(10);
		subject2 = new JTextField(10);
		subject3 = new JTextField(10);
		subject4 = new JTextField(10);
		subject5 = new JTextField(10);
		subject6 = new JTextField(10);

		subject1.setBounds(400, 100, 200, 50);
		subject2.setBounds(400, 175, 200, 50);
		subject3.setBounds(400, 250, 200, 50);
		subject4.setBounds(400, 350, 200, 50);
		subject5.setBounds(400, 425, 200, 50);
		subject6.setBounds(400, 500, 200, 50);

		index.add(subject1);
		index.add(subject2);
		index.add(subject3);
		index.add(subject4);
		index.add(subject5);
		index.add(subject6);

		JButton save = new JButton("Save");
		save.setBounds(200, 400, 150, 50);
		save.setActionCommand("save");
		index.add(save);

		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Next view	:...:
				String answer, materia1, materia2, materia3, materia4, materia5, materia6;
				answer = e.getActionCommand();

				if(answer.equals("save")) {
					//We need get text from labels
					materia1 = subject1.getText();
					materia2 = subject2.getText();
					materia3 = subject3.getText();
					materia4 = subject4.getText();
					materia5 = subject5.getText();
					materia6 = subject6.getText();

					//Clean window to create new buttons
					greeting.setText("Select your schedule");
					topicLabel.setVisible(false);
					subject1.setVisible(false);
					subject2.setVisible(false);
					subject3.setVisible(false);
					subject4.setVisible(false);
					subject5.setVisible(false);
					subject6.setVisible(false);
					save.setVisible(false);

					//Let's inicialize new objects

					//This'll works like a matrix
					JCheckBox seven1, nine1, eleven1, one1, three1, mon1, tue1, wed1, thu1, fri1;
					JCheckBox seven2, nine2, eleven2, one2, three2, mon2, tue2, wed2, thu2, fri2;
					JCheckBox seven3, nine3, eleven3, one3, three3, mon3, tue3, wed3, thu3, fri3;
					JCheckBox seven4, nine4, eleven4, one4, three4, mon4, tue4, wed4, thu4, fri4;
					JCheckBox seven5, nine5, eleven5, one5, three5, mon5, tue5, wed5, thu5, fri5;
					JCheckBox seven6, nine6, eleven6, one6, three6, mon6, tue6, wed6, thu6, fri6;

					JLabel topic1, topic2, topic3, topic4, topic5, topic6;

					JLabel info = new JLabel("Mon | Tue | Wed | Thr | Fri");
					JLabel hours = new JLabel("7:00 | 9:00 | 11:00 | 1:00 | 3:00");
					info.setBounds(400, 25, 400, 50);
					hours.setBounds(400, 50, 500, 50);
					index.add(info);
					index.add(hours);

					//for first
					topic1 = new JLabel(materia1);
					topic1.setBounds(200, 100, 200, 50);
					index.add(topic1);
					//days
					mon1 = new JCheckBox();
					mon1.setBounds(400, 100, 20, 15);
					index.add(mon1);
					tue1 = new JCheckBox();
					tue1.setBounds(425, 100, 20, 15);
					index.add(tue1);
					wed1 = new JCheckBox();
					wed1.setBounds(450, 100, 20, 15);
					index.add(wed1);
					thu1 = new JCheckBox();
					thu1.setBounds(475, 100, 20, 15);
					index.add(thu1);
					fri1 = new JCheckBox();
					fri1.setBounds(500, 100, 20, 15);
					index.add(fri1);
					//hours
					seven1 = new JCheckBox();
					seven1.setBounds(400, 120, 20, 15);
					index.add(seven1);
					nine1 = new JCheckBox();
					nine1.setBounds(425, 120, 20, 15);
					index.add(nine1);
					eleven1 = new JCheckBox();
					eleven1.setBounds(450, 120, 20, 15);
					index.add(eleven1);
					one1 = new JCheckBox();
					one1.setBounds(475, 120, 20, 15);
					index.add(one1);
					three1 = new JCheckBox();
					three1.setBounds(500, 120, 20, 15);
					index.add(three1);

					//for second
					topic2 = new JLabel(materia2);
					topic2.setBounds(200, 175, 200, 50);
					index.add(topic2);
					//days
					mon2 = new JCheckBox();
					mon2.setBounds(400, 175, 20, 15);
					index.add(mon2);
					tue2 = new JCheckBox();
					tue2.setBounds(425, 175, 20, 15);
					index.add(tue2);
					wed2 = new JCheckBox();
					wed2.setBounds(450, 175, 20, 15);
					index.add(wed2);
					thu2 = new JCheckBox();
					thu2.setBounds(475, 175, 20, 15);
					index.add(thu2);
					fri2 = new JCheckBox();
					fri2.setBounds(500, 175, 20, 15);
					index.add(fri2);
					//hours
					seven2 = new JCheckBox();
					seven2.setBounds(400, 195, 20, 15);
					index.add(seven2);
					nine2 = new JCheckBox();
					nine2.setBounds(425, 195, 20, 15);
					index.add(nine2);
					eleven2 = new JCheckBox();
					eleven2.setBounds(450, 195, 20, 15);
					index.add(eleven2);
					one2 = new JCheckBox();
					one2.setBounds(475, 195, 20, 15);
					index.add(one2);
					three2 = new JCheckBox();
					three2.setBounds(500, 195, 20, 15);
					index.add(three2);

					topic3 = new JLabel(materia3);
					topic3.setBounds(200, 250, 200, 50);
					index.add(topic3);
					//days
					mon3 = new JCheckBox();
					mon3.setBounds(400, 250, 20, 15);
					index.add(mon3);
					tue3 = new JCheckBox();
					tue3.setBounds(425, 250, 20, 15);
					index.add(tue3);
					wed3 = new JCheckBox();
					wed3.setBounds(450, 250, 20, 15);
					index.add(wed3);
					thu3 = new JCheckBox();
					thu3.setBounds(475, 250, 20, 15);
					index.add(thu3);
					fri3 = new JCheckBox();
					fri3.setBounds(500, 250, 20, 15);
					index.add(fri3);
					//hours
					seven3 = new JCheckBox();
					seven3.setBounds(400, 270, 20, 15);
					index.add(seven3);
					nine3 = new JCheckBox();
					nine3.setBounds(425, 270, 20, 15);
					index.add(nine3);
					eleven3 = new JCheckBox();
					eleven3.setBounds(450, 270, 20, 15);
					index.add(eleven3);
					one3 = new JCheckBox();
					one3.setBounds(475, 270, 20, 15);
					index.add(one3);
					three3 = new JCheckBox();
					three3.setBounds(500, 270, 20, 15);
					index.add(three3);

					topic4 = new JLabel(materia4);
					topic4.setBounds(200, 350, 200, 50);
					index.add(topic4);
					//days
					mon4 = new JCheckBox();
					mon4.setBounds(400, 350, 20, 15);
					index.add(mon4);
					tue4 = new JCheckBox();
					tue4.setBounds(425, 350, 20, 15);
					index.add(tue4);
					wed4 = new JCheckBox();
					wed4.setBounds(450, 350, 20, 15);
					index.add(wed4);
					thu4 = new JCheckBox();
					thu4.setBounds(475, 350, 20, 15);
					index.add(thu4);
					fri4 = new JCheckBox();
					fri4.setBounds(500, 350, 20, 15);
					index.add(fri4);
					//hours
					seven4 = new JCheckBox();
					seven4.setBounds(400, 370, 20, 15);
					index.add(seven4);
					nine4 = new JCheckBox();
					nine4.setBounds(425, 370, 20, 15);
					index.add(nine4);
					eleven4 = new JCheckBox();
					eleven4.setBounds(450, 370, 20, 15);
					index.add(eleven4);
					one4 = new JCheckBox();
					one4.setBounds(475, 370, 20, 15);
					index.add(one4);
					three4 = new JCheckBox();
					three4.setBounds(500, 370, 20, 15);
					index.add(three4);

					topic5 = new JLabel(materia5);
					topic5.setBounds(200, 425, 200, 50);
					index.add(topic5);
					//days
					mon5 = new JCheckBox();
					mon5.setBounds(400, 425, 20, 15);
					index.add(mon5);
					tue5 = new JCheckBox();
					tue5.setBounds(425, 425, 20, 15);
					index.add(tue5);
					wed5 = new JCheckBox();
					wed5.setBounds(450, 425, 20, 15);
					index.add(wed5);
					thu5 = new JCheckBox();
					thu5.setBounds(475, 425, 20, 15);
					index.add(thu5);
					fri5 = new JCheckBox();
					fri5.setBounds(500, 425, 20, 15);
					index.add(fri5);
					//hours
					seven5 = new JCheckBox();
					seven5.setBounds(400, 445, 20, 15);
					index.add(seven5);
					nine5 = new JCheckBox();
					nine5.setBounds(425, 445, 20, 15);
					index.add(nine5);
					eleven5 = new JCheckBox();
					eleven5.setBounds(450, 445, 20, 15);
					index.add(eleven5);
					one5 = new JCheckBox();
					one5.setBounds(475, 445, 20, 15);
					index.add(one5);
					three5 = new JCheckBox();
					three5.setBounds(500, 445, 20, 15);
					index.add(three5);

					topic6 = new JLabel(materia6);
					topic6.setBounds(200, 500, 200, 50);
					index.add(topic6);
					//days
					mon6 = new JCheckBox();
					mon6.setBounds(400, 500, 20, 15);
					index.add(mon6);
					tue6 = new JCheckBox();
					tue6.setBounds(425, 500, 20, 15);
					index.add(tue6);
					wed6 = new JCheckBox();
					wed6.setBounds(450, 500, 20, 15);
					index.add(wed6);
					thu6 = new JCheckBox();
					thu6.setBounds(475, 500, 20, 15);
					index.add(thu6);
					fri6 = new JCheckBox();
					fri6.setBounds(500, 500, 20, 15);
					index.add(fri6);
					//hours
					seven6 = new JCheckBox();
					seven6.setBounds(400, 520, 20, 15);
					index.add(seven6);
					nine6 = new JCheckBox();
					nine6.setBounds(425, 520, 20, 15);
					index.add(nine6);
					eleven6 = new JCheckBox();
					eleven6.setBounds(450, 520, 20, 15);
					index.add(eleven6);
					one6 = new JCheckBox();
					one6.setBounds(475, 520, 20, 15);
					index.add(one6);
					three6 = new JCheckBox();
					three6.setBounds(500, 520, 20, 15);
					index.add(three6);

				}
			}
		}
		);
	}
}
