package rp.javap.pros.dp.f_abstractFactory;

import rp.javap.pros.dp.f_abstractFactory.v1.CPUApi;
import rp.javap.pros.dp.f_abstractFactory.v1.MainboardApi;

/**
 * 装机工程师的类
 * <p>Title: ComputerEngineer</p>
 * <p>Description: (TODO用一句话描述这个变量表示什么)</p>
 * <p>date : Nov 12, 2013 1:49:33 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class ComputerEngineer {

	/**
	 * 定义组装电脑需要的CPU
	 */
	private CPUApi cpu = null;
	
	/**
	 * 定义组装电脑需要的主板
	 */
	private MainboardApi mainboard = null;
	
	/**
	 * 装机过程
	 * makeComputer (TODO这里用一句话描述这个类的作用) 
	 * @author ZhengDongHai
	 * @param schema	客户端选择的装机方案
	 */
	public void makeComputer(AbstractFactory schema){
		// 1：首先准备好装机所需的配件
		prepareHardwares(schema);
		// 2：组装电脑
		// 3：测试电脑
		// 4：交付客户
	}
	
	/**
	 * 准备装机需要的配件
	 * @author ZhengDongHai
	 * @param schema	客户选择的装机方案
	 */
	private void prepareHardwares(AbstractFactory schema){
		// 这里要去准备CPU和主板的具体实现，为了示例简单，这里只准备这两个
		// 可是，装机工程师并不知道如何去创建，怎么办呢？
		
		// 使用抽象工厂来获取相应的接口对象
		this.cpu = schema.createCPUApi();
		this.mainboard = schema.createMainboardApi();
		
		// 测试一下配件是否好用
		this.cpu.calculate();
		this.mainboard.installCPU();
	}
}
