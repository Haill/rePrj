package rp.javap.pros.dp.e_factoryMethod.v1;
/**
 * 创建起实现对象的示例代码
 * 
 * 具体的创建器实现对象
 * <p>date : Oct 29, 2013 6:31:28 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class ConcreteCreator extends Creator {

	@Override
	protected Product factoryMethod() {
		// 定义工厂方法，返回一个具体的Product对象
		return new ConcreteProduct();
	}

}
