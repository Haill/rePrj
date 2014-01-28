package rp.javap.pros.dp.e_factoryMethod.v2;

import rp.javap.pros.dp.e_factoryMethod.ExportOperate;

public class Client {

	public static void main(String[] args) {
		// 创建需要使用的Creator对象
		ExportOperate operate = new ExportTxtFileOperate(); // new ExportDBOperate();
		// 调用输出数据的功能方法
		operate.export("--测试数据--");
	}
}
