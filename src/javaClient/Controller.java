package javaClient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.ConnectException;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import org.tempuri.CRONUS_Sverige_AB_Employee;
import org.tempuri.WebServiceTUPA5Soap;
import org.tempuri.WebServiceTUPA5SoapProxy;


public class Controller {

	private JavaClientGUI gui;
	private WebServiceTUPA5Soap proxy; 

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

	public WebServiceTUPA5Soap getProxy() {
		return proxy;
	}

	public void setProxy(WebServiceTUPA5Soap proxy) {
		this.proxy = proxy;
	}
	
	
	public void initialize() {
		gui.getBtnSave().addActionListener(this.saveEmployee());
		gui.getBtnDelete().addActionListener(this.deleteEmployee());
		this.rdbtnListen();
		try {
			this.fillComboboxes();
			this.updateEmployeeTable();
		} catch (RemoteException e) {
			handleRemoteException(e);
		} catch (Exception exception) {
			gui.getLblFeedBack().setText("Unknown error, please contact support.");
		}
		
		
	}
	public void rdbtnListen() {
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
				String addNo_ = gui.getTextFieldEmpNo().getText();
				String editNo_ = "";
				
				if (gui.getComboBoxOldEmpNo().getSelectedItem() != null) {
					editNo_ = gui.getComboBoxOldEmpNo().getSelectedItem().toString();
				}
				try {
					if (gui.getRdbtnAdd().isSelected()) {
						proxy.addEmployee(addNo_, first_Name, last_Name, job_Title, address, phone_No_, e_Mail);
						gui.getLblFeedBack().setText("Employee was edited successfully");
					}else {
						proxy.updateEmployee(editNo_, first_Name, last_Name, job_Title, address, phone_No_, e_Mail);
						gui.getLblFeedBack().setText("Employee was edited successfully");
					}
					fillComboboxes();
					updateEmployeeTable();
				} 
				catch (RemoteException e) {
					handleRemoteException(e);
				} catch (Exception exception) {
					gui.getLblFeedBack().setText("Unknown error, please contact support.");
				}
			}
		};
	}
	
	public void fillComboboxes() throws RemoteException{
			CRONUS_Sverige_AB_Employee[] employees = proxy.getEmployees();
			String[] ls = new String[employees.length];
			for(int i = 0; i < employees.length; i++) {
				ls[i] = employees[i].getNo_();
			}
			DefaultComboBoxModel<String> defaultModel = new DefaultComboBoxModel<String>(ls);

			gui.getComboBoxOldEmpNo().setModel(defaultModel);
			gui.getComboBoxDelete().setModel(defaultModel);
	}
	

	public ActionListener deleteEmployee() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg){
				gui.getLblFeedBack().setText("");
				String no_ = "";
				if (gui.getComboBoxDelete().getSelectedItem() != null) {
					no_ = gui.getComboBoxDelete().getSelectedItem().toString();
				}
				try {
					proxy.deleteEmployee(no_);
					gui.getLblFeedBack().setText("Employee was deleted successfully");
					fillComboboxes();
					updateEmployeeTable();
				
				} catch (RemoteException e) {
					handleRemoteException(e);
				} catch (Exception exception) {
					gui.getLblFeedBack().setText("Unknown error, please contact support.");
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

	public String cleanErrorText (String fullErrorText) {
		String almostCleanErrorText = fullErrorText.split(":")[1];
		return almostCleanErrorText.split("-")[0].trim();
	}
	public void handleRemoteException(RemoteException e) {
		Throwable innerException = e.getCause();
		if (innerException != null && innerException instanceof ConnectException) {
			gui.getLblFeedBack().setText("Please check your connection and try again.");
		}
		else {
			gui.getLblFeedBack().setText(cleanErrorText(e.getMessage()));
		}
	}


}
