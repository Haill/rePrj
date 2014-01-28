package rp.javap.pros.dp.c_adapter.v1;

import java.io.Serializable;

/**
 * 日志数据对象
 * <p>date : Oct 8, 2013 7:37:06 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 * 第一版的时候，用户要求日志以文件的形式记录。开发人员遵照用户的要求，对日志文件的存取实现如下。
 */
public class LogModel implements Serializable{

	/** 
	 * @Fields serialVersionUID
	 */ 
	private static final long serialVersionUID = -2368921602084440873L;

	/**
	 * 日志编号
	 */
	private String logId;
	
	/**
	 * 操作人员
	 */
	private String operateUser;
	
	/**
	 * 操作时间，以yyyy-MM-dd HH:mm:ss的格式记录
	 */
	private String operateTime;
	
	/**
	 * 日志内容
	 */
	private String logContent;

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getOperateUser() {
		return operateUser;
	}

	public void setOperateUser(String operateUser) {
		this.operateUser = operateUser;
	}

	public String getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public String getLogContent() {
		return logContent;
	}

	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}
	
}
