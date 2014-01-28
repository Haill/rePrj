package rp.javap.pros.dp.f_abstractFactory.v1;
/**
 * 创建CPU的简单工厂
 * <p>date : Nov 5, 2013 3:31:38 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class CPUFactory {

	
	public static CPUApi createCPUApi(int type){
		CPUApi cpu = null;
		// 根据参数来选择并创建相应的CPU对象
		if(type == 1){
			cpu = new IntelCPU(1156);
		}else if(type ==2){
			cpu = new AMDCPU(939);
		}
		return cpu;
	}
	
}
