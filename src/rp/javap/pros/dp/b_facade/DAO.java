package rp.javap.pros.dp.b_facade;

/**
 * 示意生成数据层的模块
 * <p>date : Sep 5, 2013 1:48:47 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class DAO {
	
	public void generate(){
		ConfigModel cm = ConfigManager.getInstance().getConfigData();
		if(cm.isNeedGenDAO()){
			System.out.println("正在生成数据层代码文件");
		}
	}
}
