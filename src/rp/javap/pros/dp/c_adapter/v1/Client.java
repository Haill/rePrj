package rp.javap.pros.dp.c_adapter.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 写个客户端来测试一下，看看好用不。
 * <p>date : Oct 8, 2013 8:08:44 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class Client {
	
	public static void main(String[] args){
		// 准备日志内容，也就是测试的数据
		LogModel lml = new LogModel();
		lml.setLogId("001");
		lml.setOperateUser("admin");
		lml.setOperateTime("2013-10-09 14:39:09");
		lml.setLogContent("这是一个测试");
		
		List<LogModel> list = new ArrayList<LogModel>();
		list.add(lml);
		
		// 创建操作日志文件的对象
		LogFileOperateApi api = new LogFileOperate("");
		
		// 保存日志文件
		api.writeLogFile(list);
		
		// 读取日志文件的内容
		List<LogModel> readLog = api.readLogFile();
		String content = api.readLogFileConttent();
		System.out.println("readLog=" + readLog.toString());
		System.out.println("content=" + content);
		
	}
}
