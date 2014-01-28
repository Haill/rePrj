package rp.javap.pros.dp.d_singleton.v2;

/**
 * 懒汉式单例实现的实例
 * <p>date : Oct 24, 2013 1:13:02 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class Singleton_delay {

	/**
	 * 定义一个变量来存储创建好的类实例
	 */
	private static Singleton_delay uniqueInstance = null;
	
	/**
	 * 私有化构造方法，可以在内部控制创建实例的数目
	 */
	private Singleton_delay(){
		// 
	}
	
	public static synchronized Singleton_delay getInstance(){
		// 判断存储实例的变量是否有值
		if(uniqueInstance == null){
			// 如果没有，就创建一个类实例，并把值赋给存储类实例的变量
			uniqueInstance = new Singleton_delay();
		}
		// 如果有值，那就直接使用
		return uniqueInstance;
	}
	
	/**
	 * 示意方法，单例可以有自己的操作
	 * @author ZhengDongHai
	 */
	public void singletonOperation(){
		// 功能处理
	}
	
	/**
	 * 示意属性，单例可以有自己的属性
	 */
	private String singletonData;
	
	/**
	 * 示意方法，让外部通过这些方法的访问属性的值
	 * @author ZhengDongHai
	 * @return
	 */
	public String getSingletonData(){
		return singletonData;
	}
}
