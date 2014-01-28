package rp.javap.pros.dp.b_facade.fde;

public interface CModuleApi {

	public void testC();
	
	// 对子系统外部
	public void c1();
	
	// 子系统内部使用
	public void c2();
	
	// 子系统内部使用
	public void c3();
}
