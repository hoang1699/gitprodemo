package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BorrowGUI extends JFrame {
	private JFrame frame;
	private JButton btncategory;
	private JButton btnaddress;
	private JButton btnsearch;
	private JButton btnInfo;
	private JLabel label;
	
	public BorrowGUI(){
		frame = new JFrame("Đăng ký mượn sách");
		
		label = new JLabel("Chào mừng đến với hệ thống mượn sách!");
		label.setBounds(100,10,300,40);
		
		btnaddress = new JButton("Liên hệ");
		btnaddress.setBounds(170,300,100,50);
		btnaddress.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == btnaddress) {
					showAddress();
				}
			}
			
		});
		
		btncategory = new JButton("Thể loại");
		btncategory.setBounds(170, 140, 100, 50);
		btncategory.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()== btncategory) {
					
				}
			}
			
		});
		
		btnInfo = new JButton("Giới thiệu");
		btnInfo.setBounds(170,60,100,50);
		btnInfo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == btnInfo) {
					
				}
			}
			
		});
		
		btnsearch = new JButton("Tìm kiếm");
		btnsearch.setBounds(170, 220, 100, 50);
		btnsearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == btnsearch) {
					new searchGUI();
					frame.dispose();
					
				}
			}
			
		});
		frame.add(btnInfo);
		frame.add(btnaddress);
		frame.add(btnsearch);
		frame.add(btncategory);
		frame.add(label);
		
		frame.setSize(450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	private void showAddress() {
	
		JOptionPane.showMessageDialog(frame, "Thư viện PM04\n"+"Add:52 Lĩnh Nam,HN\n"+"created by: BMH", "Thông tin liên hệ", JOptionPane.INFORMATION_MESSAGE);
	}
	

}
