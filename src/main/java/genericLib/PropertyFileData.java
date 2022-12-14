package genericLib;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;
public class PropertyFileData {
	public String getData(String key) throws IOException {
		Properties p=new Properties();
		//create obj for properties class
		FileInputStream fis=new FileInputStream(AutoConstant.propertyfilePath);
		p.load(fis);
		return p.getProperty(key);
	}

}
