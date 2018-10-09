package GUI;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import java.awt.*;
import GUI.searchGUI;
import DAO.JDBCConnection;
import GUI.BorrowGUI;
import BUS.Book;

public class tableInfo extends JFrame {

	private JTable table;
	private DefaultTableModel model;
	private Connection con;

	public tableInfo() {
		Connection con = JDBCConnection.getJDBCConnection();
		table = new JTable();
		table.setPreferredSize(new Dimension(500, 500));
		this.add(new JScrollPane(table));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loadTable();
		this.pack();	
		this.setVisible(true);
	}

	 public void loadTable() {
		 
		model = new DefaultTableModel();

		Vector column = new Vector();
		column.add("Id");
		column.add("Title");
		column.add("Author");
		column.add("Code");
		model.setColumnIdentifiers(column);
		table.setModel(model);

		con = null;
		
		String sql = "Select id, title, author, code from book where title like '%";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery(sql);
			
			while  (rs.next()) {
				Vector row = new Vector();
				row.addElement(rs.getInt(0));
				row.addElement(rs.getString(1));
				row.addElement(rs.getString(2));
				row.addElement(rs.getString(3));
				model.addRow(row);

			}

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Không tìm thấy dữ liệu", "Lỗi", JOptionPane.ERROR_MESSAGE);

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}