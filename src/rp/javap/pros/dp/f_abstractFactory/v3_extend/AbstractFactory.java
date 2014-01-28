package rp.javap.pros.dp.f_abstractFactory.v3_extend;
/**
 * 扩展的抽象工厂
 * <p>date : Nov 12, 2013 7:22:42 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public interface AbstractFactory {

	/**
	 * 一个通用的创建产品对象的方法，为了简单，直接返回Object
	 * 也可以为所有被创建的产品定义一个公共的接口
	 * @author ZhengDongHai
	 * @param type		具体创建的产品类型标识
	 * @return			创建出的产品对象
	 * 
	 * 注意：
	 * 这里要特别注意传入createProduct的参数所代表的含义，这个参数只是用来表示现在是在创建什么类型的产品，
	 * 比如标示现在是创建CPU还是创建主板。
	 * 一般这个type的含义就到此结束了，不再进一步表示具体是什么样的CPU或具体是什么样的主板。
	 * 也就是说type不再表示具体是创建Intel的CPU还是创建AMD的CPU，这就是一个参数所代表的含义的深度问题。
	 * 
	 */
	public Object createProduct(int type);
}
