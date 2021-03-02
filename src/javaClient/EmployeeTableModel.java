package javaClient;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.tempuri.CRONUS_Sverige_AB_Employee;

public class EmployeeTableModel extends AbstractTableModel {
		/**
		 *  Thanks to Jonas, https://stackoverflow.com/questions/2937991/create-tablemodel-and-populate-jtable-dynamically
		 */
		private static final long serialVersionUID = 1L;
		private List<CRONUS_Sverige_AB_Employee> items;

		public EmployeeTableModel(List<CRONUS_Sverige_AB_Employee> items) {
			this.items = items;
		}

		@Override
		public int getRowCount() {
			return items.size();
		}

		@Override
		public Class<?> getColumnClass(int columnIndex) {
			switch (columnIndex) {
			case 0:
			case 1:
			case 2: 
			case 3:
			case 4:
			case 5:
			case 6:			
			}
			return Object.class;
		}

		@Override
		public String getColumnName(int column) {
			switch (column) {
			case 0: return "No_";
			case 1: return "First Name";
			case 2: return "Last Name";
			case 3: return "Job Title";
			case 4: return "Address";
			case 5: return "Phone No_";
			case 6: return "E-Mail";
			}
			return null;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			CRONUS_Sverige_AB_Employee item = items.get(rowIndex);
			switch (columnIndex) {
			case 0: return item.getNo_();
			case 1: return item.getFirst_Name();
			case 2: return item.getLast_Name();
			case 3: return item.getJob_Title();
			case 4: return item.getAddress();
			case 5: return item.getPhone_No_();
			case 6: return item.getE_Mail();
			}
			return null;

		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 7;
		}
	}


