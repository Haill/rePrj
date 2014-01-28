package rp.javap.pros.dp.c_adapter.v1;

import java.util.List;

/**
 * 日志文件操作接口
 * <p>date : Oct 8, 2013 7:43:15 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 * 接下来定义一个操作日志文件的接口。
 */
public interface LogFileOperateApi {

	/**
	 * 读取日志文件，从文件里面获取存储的日志列表对象
	 * @author ZhengDongHai
	 * @return 存储的日志列表对象
	 */
	public List<LogModel> readLogFile();
	
	/**
	 * 写日志文件，把日志列表写出到日志文件中去
	 * @author ZhengDongHai
	 * @param list	要写到日志文件的日志列表
	 */
	public void writeLogFile(List<LogModel> list);
	
	/**
	 * 读取日志文件，从文件里面获取存储的日志列表字符串
	 * @author ZhengDongHai
	 * @return
	 */
	public String readLogFileConttent();
}
