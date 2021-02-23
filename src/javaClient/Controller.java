package javaClient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import org.tempuri.CRONUS_Sverige_AB_Employee;
import org.tempuri.WebServiceTUPA5SoapProxy;

public class Controller {

	private JavaClientGUI gui;
	private WebServiceTUPA5SoapProxy proxy; 

	public Controller(JavaClientGUI gui) {
		this.gui = gui;
		this.proxy = new WebServiceTUPA5SoapProxy();
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
		
	}
	
	public ActionListener SaveEmployee() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg){
				gui.getLblFeedBack().setText("");
				String first_Name = gui.getTextFieldFirstName().getText(); 
				String last_Name = gui.getTextFieldLastName().getText();
				String job_Title = gui.getTextFieldJobTitle().getText();
				String address = gui.getTextFieldAddress().getText();
				String phone_No_ = gui.getTextFieldPhoneNo().getText();
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
					
				} catch (RemoteException e1) {
					gui.getLblFeedBack().setText("Error");
					// TODO Auto-generated catch block
					e1.printStackTrace();
				
			}
			}
		};
	}
	
	public void FillComboboxOldNo() {
		try {
			CRONUS_Sverige_AB_Employee[] employees = proxy.getEmployees();
			List<String> ls = new ArrayList<String>();
			for(int i = 0; i < employees.length; i++) {
				ls.add(employees[i].getNo_().toString());
			}
			gui.getComboBoxOldEmpNo().setModel(new DefaultComboBoxModel<String>(ls.toArray(new String[0])));
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	


}
