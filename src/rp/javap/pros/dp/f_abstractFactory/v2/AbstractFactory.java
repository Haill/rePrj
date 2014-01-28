package rp.javap.pros.dp.f_abstractFactory.v2;
/**
 * 抽象工厂的接口，声明创建抽象产品对象的操作
 * <p>date : Nov 5, 2013 5:17:06 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public interface AbstractFactory {

	/**
	 * 示例方法，创建抽象产品A的对象
	 * @author ZhengDongHai
	 * @return	抽象产品A的对象
	 */
	public AbstractProductA createProductA();
	
	/**
	 * 示例方法，创建抽象产品B的对象
	 * @author ZhengDongHai
	 * @return	抽象产品B的对象
	 */
	public AbstractProductB createProductB();
	
}
