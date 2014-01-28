package rp.javap.pros.dp.f_abstractFactory;

import rp.javap.pros.dp.f_abstractFactory.v1.CPUApi;
import rp.javap.pros.dp.f_abstractFactory.v1.GAMainboard;
import rp.javap.pros.dp.f_abstractFactory.v1.IntelCPU;
import rp.javap.pros.dp.f_abstractFactory.v1.MainboardApi;
/**
 * 装机方案一: Intel的CPU + 技嘉的主板
 * 这里创建CPU和主板对象的时候，是对应的，能匹配上的
 * <p>date : Nov 8, 2013 5:15:42 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class Schema1 implements AbstractFactory {

	public CPUApi createCPUApi() {
		return new IntelCPU(1156);
	}

	public MainboardApi createMainboardApi() {
		return new GAMainboard(1156);
	}

}
