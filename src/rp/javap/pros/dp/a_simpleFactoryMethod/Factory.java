package rp.javap.pros.dp.a_simpleFactoryMethod;

import rp.common.utils.RPropertiesUtil;


/**
 * 工厂类
 * <p>date : Aug 30, 2013 3:41:05 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class Factory {

	public static Api createApi(){

		String clazzName = RPropertiesUtil.getProperty("ImpClass");
		// 用反射去创建，那些例外处理等完善的工作这里就不做了
		
		Api api = null;
		try {
			api = (Api)Class.forName(clazzName).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return api;
	}
}
