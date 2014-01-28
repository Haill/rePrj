package rp.javap.pros.dp.e_factoryMethod.v1;
/**
 * 创建起定义的示例代码如下
 * 
 * 创建器，声明工厂方法
 * <p>date : Oct 29, 2013 6:26:48 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public abstract class Creator {

	/**
	 * 创建Product的工厂方法
	 * @author ZhengDongHai
	 * @return	Product 对象
	 */
	protected abstract Product factoryMethod();
	
	/**
	 * 示意方法，实现某些功能的方法
	 * @author ZhengDongHai
	 */
	public void someOperation(){
		// 通常在这些方法实现中需要调用工厂方法来获取Product对象
		@SuppressWarnings("unused")
		Product product = factoryMethod();
	}
}
