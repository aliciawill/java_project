package ���ǹ�;

import java.util.Date;

import javax.swing.JButton;

public class ���ǹ�if {

	public static void main(String[] args) {
		// newŰ���带 �̿��ؼ� DateƲ�� ���� ��ǰ�� ��.
		Date date = new Date(); //��¥�� �ð��� ������ �˷��ִ� class
		int hour = date.getHours(); //12
		System.out.println("���� �ð��� " + hour + "��");
		
		//������ true�̸�, �����ϰ� �ű⼭ break!
		//if~else if�� break����� ����.
		if (hour <= 11) {
			System.out.println("�¸��");
		}else if (hour <= 16) {
			System.out.println("�¾����ʹ�");
		}else if (hour <= 22) {
			System.out.println("���̺��");
		}else {
			System.out.println("�³���");
		}
		

	}

}
