package rp.javap.pros.dp.b_facade.fde;

public interface BModuleApi {

	public void testB();
	
	// 对子系统外部
	public void b1();
	
	// 子系统内部使用
	public void b2();
	
	// 子系统内部使用
	public void b3();
}
