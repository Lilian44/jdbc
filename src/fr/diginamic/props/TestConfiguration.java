package fr.diginamic.props;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class TestConfiguration {

	public static void main(String[] args) {

		ResourceBundle monFichierConf = ResourceBundle.getBundle("data");
		String Name = monFichierConf.getString("nom");

		
		System.out.println(Name);
		
		
	}
}
