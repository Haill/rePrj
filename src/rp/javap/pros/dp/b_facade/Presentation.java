package rp.javap.pros.dp.b_facade;
/**
 * 示意生成表现层的模块
 * <p>date : Sep 4, 2013 3:16:41 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class Presentation {

	public void generate(){
		// 1：从配置管理里面获取相应的配置信息
		ConfigModel cm = ConfigManager.getInstance().getConfigData();
		if(cm.isNeedGenPresentation()){
			// 2.按照要求去生成相应的代码，并保存文件
			System.out.println("正在生成表现层代码文件");
		}
	}
}
