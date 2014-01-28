package rp.javap.pros.dp.c_adapter.v2;

import java.util.List;

import rp.javap.pros.dp.c_adapter.v1.LogModel;
/**
 * DB存储日志的实现，为了简单，这里举不去真正地实现和数据库交互了，示意一下
 * <p>date : Oct 12, 2013 2:31:47 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class LogDbOperate implements LogDbOperateApi {

	public void createLog(LogModel lm) {
		System.out.println("now in LogDbOperate createLog,lm="+lm);
	}

	public List<LogModel> getAllLog() {
		System.out.println("now in LogDbOperate getAllLog");
		return null;
	}

	public String readLogFileConttent() {
		System.out.println("now in LogDbOperate readLogFileConttent");
		return null;
	}

	public void removeLog(LogModel lm) {
		System.out.println("now in LogDbOperate removeLog,lm="+lm);
	}

	public void updateLog(LogModel lm) {
		System.out.println("now in LogDbOperate updateLog,lm="+lm);
	}

}
