package rp.javap.pros.dp.f_abstractFactory;

import rp.javap.pros.dp.f_abstractFactory.v1.CPUApi;
import rp.javap.pros.dp.f_abstractFactory.v1.MainboardApi;

/**
 * 抽象工厂的接口，声明创建抽象产品对象的操作
 * <p>date : Nov 8, 2013 5:10:51 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public interface AbstractFactory {

	/**
	 * 创建CPU的对象
	 * @author ZhengDongHai
	 * @return CPU的对象
	 */
	public CPUApi createCPUApi();
	
	/**
	 * 创建主板的对象
	 * @author ZhengDongHai
	 * @return 主板的对象
	 */
	public MainboardApi createMainboardApi();
	
}
