package rp.javap.pros.dp.c_adapter.v1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
/**
 * 实现对日志文件的操作
 * <p>date : Oct 8, 2013 7:48:56 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 * 实现日志文件的存取。现在的实现也很简单，就是读写文件。
 */
public class LogFileOperate implements LogFileOperateApi {

	/**
	 * 日志文件的路径和文件名称，默认是当前项目根下的AdpaterLog.log
	 */
	private String logFilePathName = "AdapterLog.log";
	
	public LogFileOperate(String logFilePathName){
		// 先判断是否传入了文件的路径和名称，如果是，
		// 就重新设置操作的日志文件的路径和名称
		if(logFilePathName != null && logFilePathName.trim().length() > 0){
			this.logFilePathName = logFilePathName;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<LogModel> readLogFile() {
		List<LogModel> list = null;
		ObjectInputStream oin = null;
		try {
			File f = new File(logFilePathName);
			if(f.exists()){
				oin = new ObjectInputStream( new BufferedInputStream( new FileInputStream(f) ) );
				list = (List<LogModel>)oin.readObject();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			if(oin != null){
				try {
					oin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}

	public void writeLogFile(List<LogModel> list) {
		File f = new File(logFilePathName);
		ObjectOutputStream oout = null;
		try {
			oout = new ObjectOutputStream( new BufferedOutputStream( new FileOutputStream(f) ) );
			oout.writeObject(list);
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				oout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public String readLogFileConttent(){
		List<LogModel> list = readLogFile();
		StringBuilder logBuilder = new StringBuilder();
		for(LogModel log: list){
			logBuilder.append("[ logId=");
			logBuilder.append( log.getLogId() );
			logBuilder.append(",operateUser=");
			logBuilder.append( log.getOperateUser() );
			logBuilder.append(",operateTime=");
			logBuilder.append( log.getOperateTime() );
			logBuilder.append(",logContent");
			logBuilder.append( log.getLogContent() );
			logBuilder.append("\n");
		}
		return logBuilder.toString();
	}

}
