package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;
import javax.naming.RefAddr;
import javax.swing.*;
import javax.swing.table.TableModel;

import DAO.JDBCConnection;
import GUI.tableInfo;

public class searchGUI extends JFrame {

	private JFrame frame;
	private JTextField tfsearch;
	private JTextField tfauthor, tftitle, tfcategory, tfcode;
	private JLabel lsearch, lexample, ltitle, lauthor, lcategory, lcode;
	private JButton btnsearch;
	private JTable table;
	private DefaultTableModel tablemodel;

	Connection con = JDBCConnection.getJDBCConnection();

	public searchGUI() {
		frame = new JFrame("Tìm kiếm sách");
		table = new JTable();

		ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\Desktop\\images.png");
		frame.setIconImage(icon.getImage());

		tfsearch = new JTextField(20);
		tfsearch.setBounds(20, 60, 250, 35);

		btnsearch = new JButton("Tìm");
		btnsearch.setBounds(210, 103, 58, 30);
		btnsearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == btnsearch) {
					tfsearch.getText().trim();
						new tableInfo();
						
					
				}
			}

		});
		lsearch = new JLabel("Tìm kiếm");
		lsearch.setBounds(22, 20, 100, 50);

		lexample = new JLabel("Ví dụ: Giải tích 2");
		lexample.setBounds(22, 83, 300, 50);

		frame.add(lexample);
		frame.add(lsearch);
		frame.add(tfsearch);
		frame.add(btnsearch);

		frame.setSize(290, 280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);

	}

	
	}
