package rp.javap.pros.dp.f_abstractFactory.v2;
/**
 * 具体的工厂实现对象，实现创建具体的产品对象的操作
 * <p>date : Nov 5, 2013 5:32:12 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class ConcreteFactory2 implements AbstractFactory {

	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
