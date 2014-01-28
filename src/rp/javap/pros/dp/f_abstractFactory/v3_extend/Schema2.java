package rp.javap.pros.dp.f_abstractFactory.v3_extend;

import rp.javap.pros.dp.f_abstractFactory.v1.AMDCPU;
import rp.javap.pros.dp.f_abstractFactory.v1.MSIMainboard;

/**
 * 装机方案:AMD的CPU + 微星的主板
 * 这里创建CPU和主板对象的时候，是对应的， 能匹配上的。
 * <p>date : Nov 12, 2013 7:37:25 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class Schema2 implements AbstractFactory {

	public Object createProduct(int type) {
		Object retObj = null;
		// type 为1表示创建CPU，type为2表示创建主板
		if(type==1){
			retObj = new AMDCPU(939);
		}else if(type ==2){
			retObj = new MSIMainboard(939);
		}
		return retObj;
	}

}
