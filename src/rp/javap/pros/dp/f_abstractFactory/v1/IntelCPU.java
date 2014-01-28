package rp.javap.pros.dp.f_abstractFactory.v1;
/**
 * Intel的CPU实现
 * <p>date : Nov 5, 2013 3:11:14 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class IntelCPU implements CPUApi {
	/**
	 * CPU的针脚数目
	 */
	@SuppressWarnings("unused")
	private int pins = 0;
	
	/**
	 * 构造方法，传入CPU的针脚数目
	 * @param pins
	 */
	public IntelCPU(int pins){
		this.pins = pins;
	}
	
	public void calculate() {
		System.out.println("now in Intel CPU,pins="+pins);
	}

}
