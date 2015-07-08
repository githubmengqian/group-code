package library;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class UI extends JFrame {

	TextField textfield1;
	JPasswordField textfield2;

	public UI() {
		final Frame frame = new Frame("图书馆登录系统");
		frame.setLayout(null);

		final Button button1 = new Button(" 申请账号");
		final Button button2 = new Button("    忘记密码     ");
		final Button button3 = new Button("  登陆  ");
		final Button button4 = new Button("    退出     ");
		button1.setBounds(300, 100, 80, 30);
		button2.setBounds(300, 150, 80, 30);
		button3.setBounds(80, 200, 80, 30);
		button4.setBounds(240, 200, 80, 30);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);

		Label label1 = new Label("账号：");
		Label label2 = new Label("密码：");
		Label label3 = new Label("图书馆登陆系统");
		label1.setBounds(50, 100, 80, 30);
		label2.setBounds(50, 150, 80, 30);
		label3.setBounds(150, 35, 120, 50);
		label3.setFont(new Font("宋体", Font.PLAIN, 16));
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);

		textfield1 = new TextField(20);
		textfield2 = new JPasswordField(20);
		textfield1.setBounds(130, 100, 150, 30);
		textfield2.setBounds(130, 150, 150, 30);
		frame.add(textfield1);
		frame.add(textfield2);

		frame.setBounds(425, 600, 400, 300);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				frame.dispose();

			}
		});

		button3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Login();
			}

		});

		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	private void Login() {
		User u1 = new Teacher("甲", "管理员", 45, "男", "1001", "007", "齐鲁工业大学");
		User u2 = new Student("乙", "老师", 35, "男", "1002", "008", "齐鲁工业大学");
		User u3 = new Admin("丙", "同学", 20, "男", "1003", "009", "齐鲁工业大学");
		if (textfield1.getText().equals(u1.loginName)
				&& textfield2.getText().equals(u1.passWord)) {
			JOptionPane.showMessageDialog(null, u1.read());
		}
		if (textfield1.getText().equals(u2.loginName)
				&& textfield2.getText().equals(u2.passWord)) {
			JOptionPane.showMessageDialog(null, u2.read());
		}
		if (textfield1.getText().equals(u3.loginName)
				&& textfield2.getText().equals(u3.passWord)) {
			JOptionPane.showMessageDialog(null, u3.read());
		}
	}
}
