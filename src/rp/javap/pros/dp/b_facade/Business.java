package rp.javap.pros.dp.b_facade;
/**
 * 示意生成逻辑层的模块
 * <p>date : Sep 4, 2013 4:08:36 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class Business {

	public void generate(){
		ConfigModel cm = ConfigManager.getInstance().getConfigData();
		if(cm.isNeedGenBusiness()){
			System.out.println("正在生成逻辑层代码文件");
		}
	}
}
