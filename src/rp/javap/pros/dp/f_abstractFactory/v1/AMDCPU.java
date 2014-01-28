package rp.javap.pros.dp.f_abstractFactory.v1;
/**
 * AMD的CPU实现
 * <p>date : Nov 5, 2013 3:15:14 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class AMDCPU implements CPUApi {

	/**
	 * CPU的针脚数目
	 */
	@SuppressWarnings("unused")
	private int pins =0;
	
	public AMDCPU(int pins){
		this.pins = pins;
	}
	
	public void calculate() {
		System.out.println("now in AMD CPU,pins="+pins);
	}

}
