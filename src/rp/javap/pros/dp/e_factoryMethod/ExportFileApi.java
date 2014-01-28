package rp.javap.pros.dp.e_factoryMethod;

/**
 * 导出的文件对象的接口
 * <p>date : Oct 29, 2013 4:12:15 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public interface ExportFileApi {

	/**
	 * 导出内容成为文件
	 * @author ZhengDongHai
	 * @param data	示意:需要保存的数据
	 * @return	是否导出成功
	 */
	public boolean export(String data);
	
}
