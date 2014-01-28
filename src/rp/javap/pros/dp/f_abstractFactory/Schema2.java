package rp.javap.pros.dp.f_abstractFactory;

import rp.javap.pros.dp.f_abstractFactory.v1.AMDCPU;
import rp.javap.pros.dp.f_abstractFactory.v1.CPUApi;
import rp.javap.pros.dp.f_abstractFactory.v1.MSIMainboard;
import rp.javap.pros.dp.f_abstractFactory.v1.MainboardApi;
/**
 * 装机方案二：AMD的CPU + 微星的主板
 * <p>date : Nov 8, 2013 5:18:17 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class Schema2 implements AbstractFactory {

	public CPUApi createCPUApi() {
		return new AMDCPU(939);
	}

	public MainboardApi createMainboardApi() {
		return new MSIMainboard(939);
	}

}
