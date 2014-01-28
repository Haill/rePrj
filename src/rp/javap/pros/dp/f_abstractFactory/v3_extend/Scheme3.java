package rp.javap.pros.dp.f_abstractFactory.v3_extend;

import rp.javap.pros.dp.f_abstractFactory.v1.GAMainboard;
import rp.javap.pros.dp.f_abstractFactory.v1.IntelCPU;

/**
 * 装机方案三:Intel的CPU + 技嘉的主板 + 现代的内存
 * <p>date : Nov 12, 2013 7:54:41 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 * 
 * 现在若要使用这个新加入的产品，以前实现的代码都不用变化，只需新添加一个方案，
 * 在这个方案里面使用新的产品，然后客户端使用这个新的方案即可。
 */
public class Scheme3 implements AbstractFactory {

	public Object createProduct(int type) {
		Object retObj = null;
		// type为1表示创建CPU，type为2表示创建主板，type为3表示创建内存
		if(type==1){
			retObj = new IntelCPU(1156);
		}else if (type==2) {
			retObj = new GAMainboard(1156);
		}else if (type==3) {	// 创建新添加的产品
			retObj = new HyMemory();
		}
		return retObj;
	}

}
