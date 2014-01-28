package rp.javap.pros.dp.d_singleton.v1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 直接使用Java来读取配置文件的示例代码如下：
 * 读取应用配置文件
 * <p>date : Oct 22, 2013 7:49:27 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class AppConfig {

	/**
	 * 用来存放配置文件中参数A的值
	 */
	private String parameterA;
	
	/**
	 * 用来存放配置文件中参数B的值
	 */
	private String parameterB;

	// 注意：只有访问参数的方法，没有设置参数的方法
	public String getParameterA() {
		return parameterA;
	}
	
	// 注意：只有访问参数的方法，没有设置参数的方法
	public String getParameterB() {
		return parameterB;
	}

	/**
	 * 构造方法
	 */
	public AppConfig(){
		// 调用读取配置文件的方法
		readConfig();
	}
	
	/**
	 * 读取配置文件，把配置文件中的内容读取出来设置到属性上
	 * @author ZhengDongHai
	 */
	private void readConfig(){
		Properties p = new Properties();
		InputStream in = null;
		try {
			in = AppConfig.class.getResourceAsStream("AppConfig.properties");
			p.load(in);
			// 把配置文件中的内容读取出来设置到属性上
			this.parameterA = p.getProperty("paramA");
			this.parameterB = p.getProperty("paramB");
		} catch (IOException e) {
			System.out.println("转载配置文件出错了，具体堆栈信息如下:");
			e.printStackTrace();
		} finally{
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
