package javaClient;

import org.tempuri.WebServiceTUPA5SoapProxy;

public class Controller {

	private JavaClientGUI gui;
	private WebServiceTUPA5SoapProxy proxy; 

	public Controller(JavaClientGUI gui) {
		this.gui = gui;
		this.proxy = new WebServiceTUPA5SoapProxy();
	}



}
