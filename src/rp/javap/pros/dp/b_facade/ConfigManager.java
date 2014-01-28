package rp.javap.pros.dp.b_facade;
/**
 * 示意配置管理，就是负责读取配置文件，
 * 并把配置文件的内容设置到配置Model中去，是个单例
 * <p>date : Sep 4, 2013 2:48:28 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class ConfigManager {

	private static ConfigManager manager = null;
	private static ConfigModel cm = null;
	private ConfigManager(){
		
	}
	
	public static ConfigManager getInstance(){
		if(manager == null){
			manager = new ConfigManager();
			cm = new ConfigModel();
			// 读取配置文件，把值设置到ConfigModel中去，这里就省略了。
		}
		return manager;
	}
	
	/**
	 * 获取配置的数据
	 * @author ZhengDongHai
	 * @return 配置的数据
	 */
	public ConfigModel getConfigData(){
		return cm;
	}
}
