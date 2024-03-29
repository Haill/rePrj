package rp.javap.pros.dp.d_singleton.v3;
/**
 * 使用“双重检查枷锁”的方式来实现，就可以既实现线程安全，有能使性能不受到很大的影响。
 * <p>date : Oct 24, 2013 5:05:04 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class Singleton_volatitle {

	/**
	 * 对保存实例的变量添加volatitle的修饰
	 */
	private volatile static Singleton_volatitle instance = null;
	
	private Singleton_volatitle(){
		
	}
	public static Singleton_volatitle getInstance(){
		// 先检查实例是否存在，如果不存在才进入下面的同步块
		if(instance == null){
			// 同步块，线程安全地创建实例
			synchronized (Singleton_volatitle.class) {
				// 再次检查视力是否存在，如果不存在才真正地创建实例
				if(instance == null){
					instance = new Singleton_volatitle();
				}
			}
		}
		return instance;
	}
}
