package javaClient;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JavaClientGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldEmpNo;
	private JTextField textFieldFirstName;
	private JTextField textFieldLastName;
	private JTextField textFieldJobTitle;
	private JTextField textFieldAddress;
	private JTextField textFieldPhoneNo;
	private JTextField textFieldEmail;
	private JLabel lblFeedBack;
	private JRadioButton rdbtnAdd;
	private JRadioButton rdbtnEdit;
	private JComboBox<String> comboBoxOldEmpNo;

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JTextField getTextFieldEmpNo() {
		return textFieldEmpNo;
	}

	public void setTextFieldEmpNo(JTextField textFieldEmpNo) {
		this.textFieldEmpNo = textFieldEmpNo;
	}

	public JTextField getTextFieldFirstName() {
		return textFieldFirstName;
	}

	public void setTextFieldFirstName(JTextField textFieldFirstName) {
		this.textFieldFirstName = textFieldFirstName;
	}

	public JTextField getTextFieldLastName() {
		return textFieldLastName;
	}

	public void setTextFieldLastName(JTextField textFieldLastName) {
		this.textFieldLastName = textFieldLastName;
	}

	public JTextField getTextFieldJobTitle() {
		return textFieldJobTitle;
	}

	public void setTextFieldJobTitle(JTextField textFieldJobTitle) {
		this.textFieldJobTitle = textFieldJobTitle;
	}

	public JTextField getTextFieldAddress() {
		return textFieldAddress;
	}

	public void setTextFieldAddress(JTextField textFieldAddress) {
		this.textFieldAddress = textFieldAddress;
	}

	public JTextField getTextFieldPhoneNo() {
		return textFieldPhoneNo;
	}

	public void setTextFieldPhoneNo(JTextField textFieldPhoneNo) {
		this.textFieldPhoneNo = textFieldPhoneNo;
	}

	public JTextField getTextFieldEmail() {
		return textFieldEmail;
	}

	public void setTextFieldEmail(JTextField textFieldEmail) {
		this.textFieldEmail = textFieldEmail;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaClientGUI frame = new JavaClientGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JavaClientGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(334, 31, 367, 481);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		textFieldEmpNo = new JTextField();
		textFieldEmpNo.setBounds(157, 69, 124, 27);
		contentPane.add(textFieldEmpNo);
		textFieldEmpNo.setColumns(10);
		
		JComboBox<String> comboBoxOldEmpNo = new JComboBox<String>();
		comboBoxOldEmpNo.setBounds(157, 31, 124, 27);
		contentPane.add(comboBoxOldEmpNo);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setColumns(10);
		textFieldFirstName.setBounds(157, 109, 124, 27);
		contentPane.add(textFieldFirstName);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setColumns(10);
		textFieldLastName.setBounds(157, 147, 124, 27);
		contentPane.add(textFieldLastName);
		
		textFieldJobTitle = new JTextField();
		textFieldJobTitle.setColumns(10);
		textFieldJobTitle.setBounds(157, 185, 124, 27);
		contentPane.add(textFieldJobTitle);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(157, 223, 124, 27);
		contentPane.add(textFieldAddress);
		
		textFieldPhoneNo = new JTextField();
		textFieldPhoneNo.setColumns(10);
		textFieldPhoneNo.setBounds(157, 261, 124, 27);
		contentPane.add(textFieldPhoneNo);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(157, 299, 124, 27);
		contentPane.add(textFieldEmail);
		
		JRadioButton rdbtnAdd = new JRadioButton("Add Employee");
		rdbtnAdd.setBounds(118, 333, 97, 23);
		contentPane.add(rdbtnAdd);
		
		JRadioButton rdbtnEdit = new JRadioButton("Edit Employee");
		rdbtnEdit.setBounds(217, 333, 111, 23);
		contentPane.add(rdbtnEdit);
		
		JLabel lblOldEmpNo = new JLabel("Old Employee Number");
		lblOldEmpNo.setBounds(23, 37, 124, 14);
		contentPane.add(lblOldEmpNo);
		
		JLabel lblEmployeeNumber = new JLabel("Employee Number");
		lblEmployeeNumber.setBounds(23, 75, 103, 14);
		contentPane.add(lblEmployeeNumber);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(44, 115, 103, 14);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(44, 153, 103, 14);
		contentPane.add(lblLastName);
		
		JLabel lblJobTitle = new JLabel("Job Title");
		lblJobTitle.setBounds(44, 191, 103, 14);
		contentPane.add(lblJobTitle);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(44, 229, 103, 14);
		contentPane.add(lblAddress);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(44, 267, 103, 14);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(44, 305, 103, 14);
		contentPane.add(lblEmail);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(157, 364, 124, 27);
		contentPane.add(btnNewButton);
		
		JComboBox<String> comboBoxDelete = new JComboBox<String>();
		comboBoxDelete.setBounds(157, 430, 124, 27);
		contentPane.add(comboBoxDelete);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setBounds(157, 468, 124, 27);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Delete Employee");
		lblNewLabel.setBounds(44, 436, 103, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblFeedBack = new JLabel("");
		lblFeedBack.setBounds(10, 505, 49, 14);
		contentPane.add(lblFeedBack);
	}

	public JLabel getLblFeedBack() {
		return lblFeedBack;
	}

	public void setLblFeedBack(JLabel lblFeedBack) {
		this.lblFeedBack = lblFeedBack;
	}

	public JRadioButton getRdbtnAdd() {
		return rdbtnAdd;
	}

	public void setRdbtnAdd(JRadioButton rdbtnAdd) {
		this.rdbtnAdd = rdbtnAdd;
	}

	public JRadioButton getRdbtnEdit() {
		return rdbtnEdit;
	}

	public void setRdbtnEdit(JRadioButton rdbtnEdit) {
		this.rdbtnEdit = rdbtnEdit;
	}

	public JComboBox<String> getComboBoxOldEmpNo() {
		return comboBoxOldEmpNo;
	}

	public void setComboBoxOldEmpNo(JComboBox<String> comboBoxOldEmpNo) {
		this.comboBoxOldEmpNo = comboBoxOldEmpNo;
	}
}
