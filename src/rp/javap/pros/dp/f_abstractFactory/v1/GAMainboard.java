package rp.javap.pros.dp.f_abstractFactory.v1;
/**
 * 技嘉的主板
 * <p>Title: GAMMainboard</p>
 * <p>Description: (TODO用一句话描述这个变量表示什么)</p>
 * <p>date : Nov 5, 2013 3:18:22 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class GAMainboard implements MainboardApi {

	/**
	 * CPU插槽的孔数
	 */
	@SuppressWarnings("unused")
	private int cpuHoles = 0;
	
	/**
	 * 构造方法，传入CPU插槽的孔数
	 * @param cpuHoles
	 */
	public GAMainboard(int cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	
	public void installCPU() {
		System.out.println("now in GAMainboard,cpuHoles="+cpuHoles);
	}

}
