package rp.common.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Properties文件载入工具类。
 * @author ZhengDongHai
 * @version 1.0
 */
public class RPropertiesUtil {

	private static Properties properties;
	private static InputStream fis;
	static{
		properties = new Properties();
		try {
			// D:\projects\pera\researchPrj\src\rp\javap\pros\dp\a_simpleFactoryMethod
			fis = new FileInputStream("D://projects/pera/researchPrj/src/rp/javap/pros/dp/a_simpleFactoryMethod/FactoryTest.properties");
			properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	RPropertiesUtil(){
		
	}
	
	public Properties getProperties() {
		return properties;
	}
	
	public static String getProperty(String key){
		return properties.getProperty(key);
	}
	
	
}
