package rp.javap.pros.dp.f_abstractFactory.v3_extend;

import rp.javap.pros.dp.f_abstractFactory.v1.GAMainboard;
import rp.javap.pros.dp.f_abstractFactory.v1.IntelCPU;

/**
 * 装机方案一:Intel的CPU + 技嘉的主板
 * 这里创建CPU和主板对象的时候，是对应的，能匹配上的。
 * <p>date : Nov 12, 2013 7:32:54 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class Schema1 implements AbstractFactory {

	public Object createProduct(int type) {
		Object retObj = null;
		// type为1表示创建CPU，type为2表示创建主板
		if(type==1){
			retObj = new IntelCPU(1156);
		}else if(type==2){
			retObj = new GAMainboard(1156);
		}
		return retObj;
	}

}
