package rp.javap.pros.dp.f_abstractFactory.v3_extend;

import rp.javap.pros.dp.f_abstractFactory.v1.CPUApi;
import rp.javap.pros.dp.f_abstractFactory.v1.MainboardApi;

public class ComputerEngineer {

	private CPUApi cpu = null;
	private MainboardApi mainboard = null;
	
	/**
	 * 定义组装电脑需要的内存
	 */
	private MemoryApi memory = null;
	
	public void makeComputer(AbstractFactory schema){
		// 使用抽象工厂来获取相应的接口对象
		this.cpu = (CPUApi)schema.createProduct(1);
		this.mainboard = (MainboardApi)schema.createProduct(2);
		this.memory = (MemoryApi)schema.createProduct(3);
		
		
		// 测试一下配件是否好用
		this.cpu.calculate();
		this.mainboard.installCPU();
		if(memory !=null){
			this.memory.cacheData();
		}
	}
}
