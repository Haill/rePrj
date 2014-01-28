package rp.javap.pros.dp.b_facade.fde;
/**
 * A 模块的接口
 * <p>date : Sep 5, 2013 2:32:29 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public interface AModuleApi {

	/**
	 * 示意方法，A模块对外的一个功能方法
	 * @author ZhengDongHai
	 */
	public void testA();
	
	public void a1();	// 对子系统外部
	
	public void a2();	// 这些是用在子系统内部，与B、C模块交互使用
	
	public void a3();	// 这些是用在子系统内部，与B、C模块交互使用
}
