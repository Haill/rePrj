package rp.javap.pros.dp.d_singleton.v3;

import java.util.HashMap;
import java.util.Map;

/**
 * Java中缓存的基本实现示例
 * <p>date : Oct 24, 2013 4:06:03 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 * 
 * 这里只是缓存的基本实现，还有很多功能没有考虑，比如缓存的清除，缓存的同步。
 * 
 */
public class JavaCache {

	/**
	 * 缓存数据的容器，定义成Map是方便访问，直接根据key就可以获取Value了
	 * key选用String是为了简单，方便演示
	 */
	private Map<String,Object> map = new HashMap<String, Object>();
	
	/**
	 * 从缓存中获取值
	 * @author ZhengDongHai
	 * @param key 设置时候的key值	
	 * @return	key 对应的Value值
	 */
	public Object getValue(String key){
		// 先从缓存里面取值
		Object obj = map.get(key);
		// 判断缓存里面是否有值
		if(obj == null){
			// 如果没有，那么就去获取相应的数据，比如读取数据库或者文件
			// 这里只是演示，所以直接写个假的值
			obj = key + ",value";
			// 把获取的值设置回到缓存里面
			map.put(key, obj);
		}
		// 如果有值了，就直接返回使用
		return obj;
	}
	
}
