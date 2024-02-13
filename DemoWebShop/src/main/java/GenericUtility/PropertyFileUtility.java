package GenericUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility extends WebDriverUtility {

	public static String propertyData(String Key) throws IOException{
	FileInputStream fis = new FileInputStream(Iconstant.property_path);
	Properties p = new Properties();
	p.load(fis);
	return p.getProperty(Key);
	
}}
