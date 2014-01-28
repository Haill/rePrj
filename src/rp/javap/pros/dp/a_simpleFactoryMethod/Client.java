package rp.javap.pros.dp.a_simpleFactoryMethod;
/**
 * 客户端，使用Api接口
 * <p>date : Aug 30, 2013 3:46:32 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// 通过简单工厂来获取接口对象
		Api api = Factory.createApi();
		api.operation("呵呵，不要紧张，只是个测试而已！");
	}
}
