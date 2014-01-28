package rp.javap.pros.dp.d_singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 现在要控制实例的数据为3个，怎么办吧呢？
 * 
 * 其实思路很简单，就是利用上面通过Map来缓存实现单例的示例，进行变形，一个Map可以缓存任意多个实例。
 * 新的问题是，Map中有多个实例，但是客户端调用的时候，到底返回哪一个实例呢，也就是实例调度问题，
 * 
 * 简单演示如何扩展单例模式，控制实例数目为3个
 * <p>date : Oct 25, 2013 1:51:48 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class OneExtend {

	/**
	 * 定义一个缺省的key值得前缀
	 */
	private final static String DEFAULT_PREKEY = "Cache";
	
	/**
	 * 缓存实例的容器
	 */
	private static Map<String, OneExtend> map = new HashMap<String, OneExtend>();
	
	/**
	 * 用来记录当前正在使用第几个实例，到了控制的最大数目，就返回从1开始
	 */
	private static int num = 1;
	
	/**
	 * 定义控制实例的最大数目
	 */
	private final static int NUM_MAX = 3;
	
	private OneExtend(){}
	
	public static OneExtend getInstance(){
		String key = DEFAULT_PREKEY+num;
		OneExtend oneExtend = map.get(key);
		if( oneExtend == null ){
			oneExtend = new OneExtend();
			map.put(key, oneExtend);
		}
		// 把当前实例的序号加1
		num++;
		if( num > NUM_MAX ){
			// 如果实例的序号已经达到最大数目了，那就重复从1开始获取
			num = 1;
		}
		return oneExtend;
	}
	
	public static void main(String[] args) {
		OneExtend t1 = getInstance();
		OneExtend t2 = getInstance();
		OneExtend t3 = getInstance();
		OneExtend t4 = getInstance();
		OneExtend t5 = getInstance();
		OneExtend t6 = getInstance();
		
		System.out.println("t1=="+t1);
		System.out.println("t2=="+t2);
		System.out.println("t3=="+t3);
		System.out.println("t4=="+t4);
		System.out.println("t5=="+t5);
		System.out.println("t6=="+t6);
	}
	
}
