package rp.javap.pros.dp.c_adapter.v2;

import java.util.List;

import rp.javap.pros.dp.c_adapter.v1.LogFileOperateApi;
import rp.javap.pros.dp.c_adapter.v1.LogModel;
/**
 * 适配器对象，将记录日志到文件的功能适配成第二版需要的增删改查功能
 * <p>date : Oct 11, 2013 3:17:41 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class Adapter implements LogDbOperateApi {

	private LogFileOperateApi adaptee;
	
	/**
	 * 构造方法，传入需要被适配的对象
	 * @param adaptee
	 */
	public Adapter(LogFileOperateApi adaptee){
		this.adaptee = adaptee;
	}
	
	public void createLog(LogModel lm) {
		// 1：先读取文件的内容
		List<LogModel> list = adaptee.readLogFile();
		// 2：加入新的日志对象
		list.add(lm);
		// 3：重新写入文件
		adaptee.writeLogFile(list);

	}

	public List<LogModel> getAllLog() {
		return adaptee.readLogFile();
	}

	public void removeLog(LogModel lm) {
		// 1：先读取文件的内容
		List<LogModel> list = adaptee.readLogFile();
		// 2：删除相应的日志对象
		list.remove(lm);
		// 3：重新写入文件
		adaptee.writeLogFile(list);

	}

	public void updateLog(LogModel lm) {
		// 1：先读取文件的内容
		List<LogModel> list = adaptee.readLogFile();
		// 2：修改相应的日志对象
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getLogId().equals(lm.getLogId())){
				list.set(i,lm);
				break;
			}
		}
		// 3：重新写入文件
		adaptee.writeLogFile(list);
	}

	public String readLogFileConttent() {
		return adaptee.readLogFileConttent();
	}

}
