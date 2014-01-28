package rp.javap.pros.dp.b_facade.fde;

public interface FacadeApi {

	/**
	 * 这些是A,B,C 模块对子系统外的接口，
	 * 这样外部不需要知道A，B，C模块的存在，只需要知道Facade接口就行了。
	 */
	
	public void a1();
	
	public void b1();
	
	public void c1();
	
	public void test();
	
	/**
	 * 这样定义Facade的话，外部只需要有Facade接口，就不再需要其他的接口了， 
	 * 可以有效地屏蔽内部的细节，免得客户端去调用A模块的接口时，发现一些不需要它知道的接口，
	 * 将会造成“接口污染”
	 */
}
