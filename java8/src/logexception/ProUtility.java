package logexception;

import java.io.InputStream;
import java.util.Properties;

public class ProUtility {
	private ProUtility() 
	{
		
	}
	private static Properties p;
	static {
		try {
			Properties p = new Properties();
			InputStream in = p.getClass().getResourceAsStream("p.properties");
			p.load(in);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static String getValue(String key) {
		return p.getProperty(key);
		
	}

}
