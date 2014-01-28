package rp.javap.pros.dp.d_singleton.v1;
/**
 * 写个客户端来测试一下
 * <p>date : Oct 22, 2013 8:01:47 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// 创建读取应用配置的对象
		AppConfig config = new AppConfig();
		
		String paramA = config.getParameterA();
		String paramB = config.getParameterB();
		
		System.out.println("paramA="+paramA+",paramB="+paramB);
	}
}
