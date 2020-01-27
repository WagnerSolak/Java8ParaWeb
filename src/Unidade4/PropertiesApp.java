package Unidade4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {

	public static void main(String[] args) throws Exception, FileNotFoundException, IOException {
		// ler arquivo xml
		Properties sites = new Properties();
		sites.loadFromXML(new FileInputStream("C:/Users/wagne/eclipse-workspace/CursoJava2Disciplina/src/Unidade4/sites.xml"));
		System.out.println(sites.get("1"));

	}

}
