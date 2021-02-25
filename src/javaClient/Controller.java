package javaClient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import org.tempuri.CRONUS_Sverige_AB_Employee;
import org.tempuri.WebServiceTUPA5SoapProxy;


public class Controller {

	private JavaClientGUI gui;
	private WebServiceTUPA5SoapProxy proxy; 

	public Controller(JavaClientGUI gui) {
		this.gui = gui;
		this.proxy = new WebServiceTUPA5SoapProxy();
		this.initialize();
		
	}
	
	public JavaClientGUI getGui() {
		return gui;
	}

	public void setGui(JavaClientGUI gui) {
		this.gui = gui;
	}

	public WebServiceTUPA5SoapProxy getProxy() {
		return proxy;
	}

	public void setProxy(WebServiceTUPA5SoapProxy proxy) {
		this.proxy = proxy;
	}
	
	
	public void initialize() {
		gui.getBtnSave().addActionListener(this.saveEmployee());
		gui.getBtnDelete().addActionListener(this.deleteEmployee());
		this.fillComboboxes();
		this.buttonListen();
		try {
			this.updateEmployeeTable();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	public void buttonListen() {
		gui.getRdbtnAdd().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(gui.getRdbtnAdd().isSelected()) {
					gui.getComboBoxOldEmpNo().setEnabled(false);
					gui.getTextFieldEmpNo().setEnabled(true);
				}
			}
		});
		gui.getRdbtnEdit().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			if(gui.getRdbtnEdit().isSelected()) {
			gui.getComboBoxOldEmpNo().setEnabled(true);
			gui.getTextFieldEmpNo().setEnabled(false);
			}
		}
	});
	}
	
	
	public ActionListener saveEmployee() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg){
				gui.getLblFeedBack().setText("");
				String first_Name = gui.getTextFieldFirstName().getText(); 
				String last_Name = gui.getTextFieldLastName().getText();
				String job_Title = gui.getTextFieldJobTitle().getText();
				String address = gui.getTextFieldAddress().getText();
				String phone_No_ = gui.getTextFieldPhoneNumber().getText();
				String e_Mail = gui.getTextFieldEmail().getText();
				try {
					if(gui.getRdbtnAdd().isSelected()) {
						String no_ = gui.getTextFieldEmpNo().getText();
						
					proxy.addEmployee(no_, first_Name, last_Name, job_Title, address, phone_No_, e_Mail);
					gui.getLblFeedBack().setText("Employee was created successfully");
					
				} else  {
					String empNo = gui.getComboBoxOldEmpNo().getSelectedItem().toString();
					proxy.updateEmployee(empNo, first_Name, last_Name, job_Title, address, phone_No_, e_Mail);
					gui.getLblFeedBack().setText("Employee was edited successfully");
				}
					fillComboboxes();
					updateEmployeeTable();
				} catch (RemoteException e1) {
					gui.getLblFeedBack().setText("Error");
					// TODO Auto-generated catch block
					e1.printStackTrace();
				
			}
			}
		};
	}
	
	public void fillComboboxes() {
		try {
			CRONUS_Sverige_AB_Employee[] employees = proxy.getEmployees();
			String[] ls = new String[employees.length];
			for(int i = 0; i < employees.length; i++) {
				ls[i] = employees[i].getNo_();
			}
			DefaultComboBoxModel<String> defaultBox = new DefaultComboBoxModel<String>(ls);
			
			gui.getComboBoxOldEmpNo().setModel(defaultBox);
			gui.getComboBoxDelete().setModel(defaultBox);
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public ActionListener deleteEmployee() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg){
				gui.getLblFeedBack().setText("");
				try {
					String no_ = gui.getComboBoxDelete().getSelectedItem().toString();	
					proxy.deleteEmployee(no_);
					gui.getLblFeedBack().setText("Employee was deleted successfully");
					fillComboboxes();
					updateEmployeeTable();
				} catch (RemoteException e1) {
					gui.getLblFeedBack().setText("Error");
					// TODO Auto-generated catch block
					e1.printStackTrace();
				
			}
			}
		};
	}
	
	public void updateEmployeeTable() throws RemoteException {
		CRONUS_Sverige_AB_Employee[] employees = proxy.getEmployees();
		//Cast the office array from the proxy class into a List which is compatible with the table model class.
	    List<CRONUS_Sverige_AB_Employee> employeeList = Arrays.asList(employees);          
		EmployeeTableModel dataModel = new EmployeeTableModel(employeeList);
		gui.getTableEmp().setModel(dataModel);
	}
	


}
