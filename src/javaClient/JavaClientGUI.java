package javaClient;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class JavaClientGUI extends JFrame {

	private JPanel contentPane;
	public JTextField getTextFieldEmpNo() {
		return textFieldEmpNo;
	}

	public JTextField getTextFieldFirstName() {
		return textFieldFirstName;
	}

	public JTextField getTextFieldLastName() {
		return textFieldLastName;
	}

	public JTextField getTextFieldJobTitle() {
		return textFieldJobTitle;
	}

	public JTextField getTextFieldAddress() {
		return textFieldAddress;
	}

	public JTextField getTextFieldPhoneNumber() {
		return textFieldPhoneNumber;
	}

	public JTextField getTextFieldEmail() {
		return textFieldEmail;
	}

	private JTextField textFieldEmpNo;
	private JTextField textFieldFirstName;
	private JTextField textFieldLastName;
	private JTextField textFieldJobTitle;
	private JTextField textFieldAddress;
	private JTextField textFieldPhoneNumber;
	private JTextField textFieldEmail;
	private JComboBox<String> comboBoxOldEmpNo;
	private JComboBox<String> comboBoxDelete;
	private JRadioButton rdbtnAdd;
	private JRadioButton rdbtnEdit;
	private JButton btnSave;
	private JLabel lblFeedBack;
	private JButton btnDelete;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable tableEmp;

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public JComboBox<String> getComboBoxOldEmpNo() {
		return comboBoxOldEmpNo;
	}

	public JComboBox<String> getComboBoxDelete() {
		return comboBoxDelete;
	}

	public JRadioButton getRdbtnAdd() {
		return rdbtnAdd;
	}

	public JRadioButton getRdbtnEdit() {
		return rdbtnEdit;
	}

	public JButton getBtnSave() {
		return btnSave;
	}

	public JLabel getLblFeedBack() {
		return lblFeedBack;
	}
	public JTable getTableEmp() {
		return tableEmp;
	}
	


	/**
	 * Create the frame.
	 */
	public JavaClientGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 678);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 786, 555);
		contentPane.add(contentPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(334, 31, 442, 481);
		contentPane_1.add(scrollPane);
		
		tableEmp = new JTable();
		scrollPane.setViewportView(tableEmp);
		
		textFieldEmpNo = new JTextField();
		textFieldEmpNo.setColumns(10);
		textFieldEmpNo.setBounds(157, 69, 124, 27);
		contentPane_1.add(textFieldEmpNo);
		
		comboBoxOldEmpNo = new JComboBox<String>();
		comboBoxOldEmpNo.setEnabled(false);
		comboBoxOldEmpNo.setBounds(157, 31, 124, 27);
		contentPane_1.add(comboBoxOldEmpNo);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setColumns(10);
		textFieldFirstName.setBounds(157, 109, 124, 27);
		contentPane_1.add(textFieldFirstName);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setColumns(10);
		textFieldLastName.setBounds(157, 147, 124, 27);
		contentPane_1.add(textFieldLastName);
		
		textFieldJobTitle = new JTextField();
		textFieldJobTitle.setColumns(10);
		textFieldJobTitle.setBounds(157, 185, 124, 27);
		contentPane_1.add(textFieldJobTitle);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(157, 223, 124, 27);
		contentPane_1.add(textFieldAddress);
		
		textFieldPhoneNumber = new JTextField();
		textFieldPhoneNumber.setColumns(10);
		textFieldPhoneNumber.setBounds(157, 261, 124, 27);
		contentPane_1.add(textFieldPhoneNumber);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(157, 299, 124, 27);
		contentPane_1.add(textFieldEmail);
		
		rdbtnAdd = new JRadioButton("Add Employee");
		
		rdbtnAdd.setSelected(true);
		buttonGroup.add(rdbtnAdd);
		rdbtnAdd.setBounds(118, 333, 97, 23);
		contentPane_1.add(rdbtnAdd);
		
		rdbtnEdit = new JRadioButton("Edit Employee");
		
		buttonGroup.add(rdbtnEdit);
		rdbtnEdit.setBounds(217, 333, 111, 23);
		contentPane_1.add(rdbtnEdit);
		
		JLabel lblOldEmpNo = new JLabel("Old Employee Number");
		lblOldEmpNo.setBounds(23, 37, 124, 14);
		contentPane_1.add(lblOldEmpNo);
		
		JLabel lblEmployeeNumber = new JLabel("Employee Number");
		lblEmployeeNumber.setBounds(23, 75, 103, 14);
		contentPane_1.add(lblEmployeeNumber);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(44, 115, 103, 14);
		contentPane_1.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(44, 153, 103, 14);
		contentPane_1.add(lblLastName);
		
		JLabel lblJobTitle = new JLabel("Job Title");
		lblJobTitle.setBounds(44, 191, 103, 14);
		contentPane_1.add(lblJobTitle);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(44, 229, 103, 14);
		contentPane_1.add(lblAddress);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(44, 267, 103, 14);
		contentPane_1.add(lblPhoneNumber);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(44, 305, 103, 14);
		contentPane_1.add(lblEmail);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(157, 364, 124, 27);
		contentPane_1.add(btnSave);
		
		comboBoxDelete = new JComboBox<String>();
		comboBoxDelete.setBounds(157, 430, 124, 27);
		contentPane_1.add(comboBoxDelete);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBounds(157, 468, 124, 27);
		contentPane_1.add(btnDelete);
		
		JLabel lblNewLabel = new JLabel("Delete Employee");
		lblNewLabel.setBounds(44, 436, 103, 14);
		contentPane_1.add(lblNewLabel);
		
		lblFeedBack = new JLabel("");
		lblFeedBack.setBounds(10, 402, 271, 14);
		contentPane_1.add(lblFeedBack);
	}
}
