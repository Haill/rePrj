package rp.javap.pros.dp.c_adapter.adp;
/**
 * 使用适配器的客户端
 * <p>date : Oct 11, 2013 12:38:41 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 * 再来看看使用适配器客户端的示例代码如下：
 */
public class Client {

	public static void main(String[] args) {
		// 创建需要被适配的对象
		Adaptee adaptee = new Adaptee();
		// 创建客户端需要调用的接口对象
		Target target = new Adapter(adaptee);
		// 请求处理
		target.request();
	}
}
