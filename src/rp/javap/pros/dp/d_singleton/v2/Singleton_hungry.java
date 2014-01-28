package rp.javap.pros.dp.d_singleton.v2;

/**
 * 饿汉式单例实现的示例
 * <p>date : Oct 24, 2013 1:26:51 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class Singleton_hungry {

	/**
	 * 定义一个变量来存储创建好的类实例，直接在这里创建类实例，只能创建一次
	 */
	private static Singleton_hungry uniqueInstance = new Singleton_hungry();
	
	/**
	 * 私有化构造方法，可以在内部控制创建实例的数目
	 */
	private Singleton_hungry(){
		//
	}
	
	/**
	 * 定义一个方法来为客户端提供类实例 
	 * @author ZhengDongHai
	 * @return
	 */
	public static Singleton_hungry getInstance(){
		// 直接使用已经创建好的实例
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
	 * 示意方法，让外部通过这些方法来访问属性的值
	 * getSingletonData (TODO这里用一句话描述这个类的作用) 
	 * @author ZhengDongHai
	 * @return
	 */
	public String getSingletonData(){
		return singletonData;
	}
}
