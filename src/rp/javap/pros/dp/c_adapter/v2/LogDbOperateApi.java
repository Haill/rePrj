package rp.javap.pros.dp.c_adapter.v2;

import java.util.List;

import rp.javap.pros.dp.c_adapter.v1.LogModel;
/**
 * 
 * <p>date : Oct 10, 2013 7:46:36 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 * 对于使用数据库来保存日志的实现，这里就不去涉及了，总之知道有这么一个实现就可以了。
 */
public interface LogDbOperateApi {

	/**
	 * 新增日志
	 * @author ZhengDongHai
	 * @param lm	需要新增的日志对象
	 */
	public void createLog(LogModel lm);
	
	/**
	 * 修改日志
	 * @author ZhengDongHai
	 * @param lm	需要修改的日志对象
	 */
	public void updateLog(LogModel lm);
	
	/**
	 * 需要删除的日志对象
	 * @author ZhengDongHai
	 * @param lm
	 */
	public void removeLog(LogModel lm);
	
	/**
	 * 获取所有的日志
	 * @author ZhengDongHai
	 * @return	所有的日志对象
	 */
	public List<LogModel> getAllLog();
	
	/**
	 * 读取日志文件，从文件里面获取存储的日志列表字符串
	 * @author ZhengDongHai
	 * @return
	 */
	public String readLogFileConttent();
}
