package rp.javap.pros.oschina.net;

/**
 * 规整运行数据收集器
 * 收集、保存和查询只有固定长度和/或数值的对象（其中有1个不重复的主键）
 * 
 * 大型购物网站互联网应用组队中，欢迎java程序员加入！
 * http://www.oschina.net/question/216215_125289
 **/

import java.io.File;
import java.io.IOException;

public class RegularRunDataCollector {
	
	/**
	 * 构造函数 File dir 文件所在目录 String fileName 数据文件名称
	 */
	public RegularRunDataCollector(final File dir, final String fileName)
			throws IOException {

	}

	/**
	 * 按主键大小顺序插入或更新数据 RegularRunData data 需要插入或更新的数据
	 */
	public void update(final RegularRunData data) throws IOException {

	}

	/**
	 * 查询数据 long key 主键
	 */
	public RegularRunData get(final long key) throws IOException {
		return null;
	}

	/**
	 * 关闭收集器
	 */
	public void close() throws IOException {

	}

}