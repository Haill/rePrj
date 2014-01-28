package rp.javap.pros.dp.f_abstractFactory.v1;
/**
 * 微星的主板
 * <p>date : Nov 5, 2013 3:26:11 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class MSIMainboard implements MainboardApi {

	/**
	 * CPU插槽的孔数
	 */
	@SuppressWarnings("unused")
	private int cpuHoles = 0;
	
	/**
	 * 构造方法，传入CPU插槽的孔数
	 * @param cpuHoles CPU插槽的孔数
	 */
	public MSIMainboard(int cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	
	public void installCPU() {
		System.out.println("now in MSIMainboard,cpuHoles="+cpuHoles);
	}

}
