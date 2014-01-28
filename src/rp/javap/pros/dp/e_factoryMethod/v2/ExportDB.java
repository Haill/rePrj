package rp.javap.pros.dp.e_factoryMethod.v2;

import rp.javap.pros.dp.e_factoryMethod.ExportFileApi;
/**
 * 导出成数据库备份文件形式的对象
 * <p>date : Nov 1, 2013 5:24:01 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class ExportDB implements ExportFileApi {

	public boolean export(String data) {
		// 简单示意一下，这里需要操作数据库和文件
		System.out.println("导出数据"+data+"到数据库备份文件");
		return false;
	}

}
