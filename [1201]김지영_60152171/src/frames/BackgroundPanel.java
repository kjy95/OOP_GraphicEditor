package frames;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class BackgroundPanel extends JPanel {
	JScrollPane scrollPane;
	ImageIcon titlebarImg = new ImageIcon("Ÿ��Ʋ���̹���.jpg");   
	 
	 //�ʱ�ȭ�� �ǳ�
	 public BackgroundPanel(GMainFrame mainFrame, JPanel jpanel) {   //jpanel�༭ ������ �ְ�.jpanel�������� �Լ��� �̿��ؼ� �ٽø�����.
		 mainFrame.setIconImage(titlebarImg.getImage());//Ÿ��Ʋ���̹���
		 
	 }
	 

}
