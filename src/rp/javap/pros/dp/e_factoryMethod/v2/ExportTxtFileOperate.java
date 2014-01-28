package rp.javap.pros.dp.e_factoryMethod.v2;

import rp.javap.pros.dp.e_factoryMethod.ExportFileApi;
import rp.javap.pros.dp.e_factoryMethod.ExportOperate;
/**
 * 具体的创建器实现对象，实现创建导出成文本文件格式的对象
 * <p>date : Nov 4, 2013 10:33:40 AM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class ExportTxtFileOperate extends ExportOperate {

	@Override
	protected ExportFileApi factoryMethod() {
		// 创建导出成文本文件格式的对象
		return new ExportTxtFile();
	}

}
