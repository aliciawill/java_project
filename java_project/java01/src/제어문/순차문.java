package ���;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ������ {

	public static void main(String[] args) {
		// �Է�
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");//ȫ�浿
		
		
		
		// ó��
		String result = name + "�� ȯ���մϴ�.";

		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setVisible(true);
		
		// ���
		JOptionPane.showMessageDialog(f, "���� ���� ��� ����ϴ� �� " + result);

	}

}
