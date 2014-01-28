package rp.javap.pros.dp.c_adapter.v2;

import java.util.ArrayList;
import java.util.List;

import rp.javap.pros.dp.c_adapter.v1.LogFileOperate;
import rp.javap.pros.dp.c_adapter.v1.LogFileOperateApi;
import rp.javap.pros.dp.c_adapter.v1.LogModel;

public class Client {

	public static void main(String[] args) {
		// 准备日志内容，也就是测试的数据
		LogModel lml = new LogModel();
		lml.setLogId("001");
		lml.setOperateUser("admin");
		lml.setOperateTime("2013-10-11 15:32:34");
		lml.setLogContent("这是一个测试");
		List<LogModel> list = new ArrayList<LogModel>();
		list.add(lml);
		// 创建操作日志文件的对象
		LogFileOperateApi logFileApi = new LogFileOperate("");
		
		// 创建新版操作日志的接口对象
		LogDbOperateApi api = new Adapter(logFileApi);
		
		// 保存日志文件
		api.createLog(lml);
		// 读取日志文件的内容
		List<LogModel> allLog = api.getAllLog();
		String content = api.readLogFileConttent();
		System.out.println("allLog = " + allLog);
		System.out.println("content="+content);
	}

}
