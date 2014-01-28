package rp.javap.pros.dp.e_factoryMethod.v2;

import rp.javap.pros.dp.e_factoryMethod.ExportFileApi;

/**
 * 导出文本文件格式的对象
 * <p>date : Nov 1, 2013 5:17:32 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class ExportTxtFile implements ExportFileApi {

	public boolean export(String data) {
		// 简单示意一下，这里需要操作文件
		System.out.println("导出数据"+data+"到文本文件");
		return true;
	}

}
